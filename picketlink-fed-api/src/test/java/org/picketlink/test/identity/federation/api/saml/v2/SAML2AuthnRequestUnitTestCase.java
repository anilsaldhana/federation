/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors. 
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.test.identity.federation.api.saml.v2;

import java.io.ByteArrayOutputStream;
import java.util.List;

import javax.xml.bind.JAXBElement;

import junit.framework.TestCase;

import org.picketlink.identity.federation.api.saml.v2.request.SAML2Request;
import org.picketlink.identity.federation.core.saml.v2.common.IDGenerator;
import org.picketlink.identity.federation.saml.v2.assertion.AudienceRestrictionType;
import org.picketlink.identity.federation.saml.v2.assertion.ConditionAbstractType;
import org.picketlink.identity.federation.saml.v2.assertion.ConditionsType;
import org.picketlink.identity.federation.saml.v2.assertion.NameIDType;
import org.picketlink.identity.federation.saml.v2.assertion.SubjectType;
import org.picketlink.identity.federation.saml.v2.protocol.AuthnRequestType;
import org.picketlink.identity.federation.saml.v2.protocol.RequestedAuthnContextType;
import org.picketlink.identity.xmlsec.w3.xmldsig.SignatureType;
 


/**
 * Unit test the SAML2 Authn Request Context constructs
 * @author Anil.Saldhana@redhat.com
 * @since Dec 8, 2008
 */
public class SAML2AuthnRequestUnitTestCase extends TestCase
{ 
   /**
    * Test reading a saml2 authn request
    * @throws Exception
    */
   public void testAuthnRequestExample() throws Exception
   {
      String resourceName = "saml/v2/authnrequest/samlAuthnRequestExample.xml";
      
      SAML2Request request = new SAML2Request();
      
      AuthnRequestType authnRequestType = request.getAuthnRequestType(resourceName);
      
      assertEquals("http://www.example.com/", authnRequestType.getDestination()); 
      assertEquals("urn:oasis:names:tc:SAML:2.0:consent:obtained", authnRequestType.getConsent());
      assertEquals("http://www.example.com/",authnRequestType.getAssertionConsumerServiceURL());
      assertEquals(Integer.valueOf("0"), authnRequestType.getAttributeConsumingServiceIndex());
      
      SubjectType subjectType = authnRequestType.getSubject();
      assertNotNull(subjectType);
      
      List<JAXBElement<?>> subjectContentList = subjectType.getContent();
      JAXBElement<?> elem1 = subjectContentList.get(0);
      NameIDType nameIDType = (NameIDType) elem1.getValue();
      
      assertEquals("urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress",nameIDType.getFormat());
      assertEquals("j.doe@company.com",nameIDType.getValue()); 
      
      ConditionsType conditionsType = authnRequestType.getConditions();
      List<ConditionAbstractType> conditions = conditionsType.getConditionOrAudienceRestrictionOrOneTimeUse();
      assertTrue(conditions.size() == 1);
      
      ConditionAbstractType condition = conditions.get(0);
      assertTrue(condition instanceof AudienceRestrictionType);
      AudienceRestrictionType audienceRestrictionType = (AudienceRestrictionType) condition;
      List<String> audiences = audienceRestrictionType.getAudience();
      assertTrue(audiences.size() == 1);
      assertEquals("urn:foo:sp.example.org", audiences.get(0));
      
      RequestedAuthnContextType requestedAuthnContext = authnRequestType.getRequestedAuthnContext();
      assertEquals( "urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport"
            ,requestedAuthnContext.getAuthnContextClassRef().get(0));
      
      //Let us marshall it back to an output stream
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      request.marshall(authnRequestType, baos);
   }  
   
   /**
    * Test reading a saml authn request from a file that 
    * contains a digital signature
    * @throws Exception
    */
   public void testAuthnRequestWithSignature() throws Exception
   {
      String resourceName = "saml/v2/authnrequest/samlAuthnRequestWithSignature.xml";

      SAML2Request request = new SAML2Request();
      
      AuthnRequestType authnRequestType = request.getAuthnRequestType(resourceName);
      assertNotNull(authnRequestType);
      
      SignatureType signatureType = authnRequestType.getSignature();
      assertNotNull("Signature is not null", signatureType);
      
      //Let us marshall it back to an output stream
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      request.marshall(authnRequestType, baos);
   }
   
   /**
    * Test the creation of AuthnRequestType
    * @throws Exception
    */
   public void testAuthnRequestCreation() throws Exception
   {
      String id = IDGenerator.create("ID_");
      
      SAML2Request request = new SAML2Request();
      AuthnRequestType authnRequest = request.createAuthnRequestType( 
            id, "http://sp", "http://idp", "http://sp"); 

      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      request.marshall(authnRequest, baos); 
   }
}