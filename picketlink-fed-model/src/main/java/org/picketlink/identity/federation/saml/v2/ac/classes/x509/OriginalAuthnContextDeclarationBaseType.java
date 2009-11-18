//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.08 at 05:45:20 PM CST 
//


package org.picketlink.identity.federation.saml.v2.ac.classes.x509;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuthnContextDeclarationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthnContextDeclarationBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}Identification" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}TechnicalProtection" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}OperationalProtection" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}AuthnMethod" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}GoverningAgreements" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:X509}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identification",
    "technicalProtection",
    "operationalProtection",
    "authnMethod",
    "governingAgreements",
    "extension"
})
@XmlSeeAlso({
    AuthnContextDeclarationBaseType.class
})
public class OriginalAuthnContextDeclarationBaseType {

    @XmlElement(name = "Identification")
    protected IdentificationType identification;
    @XmlElement(name = "TechnicalProtection")
    protected TechnicalProtectionBaseType technicalProtection;
    @XmlElement(name = "OperationalProtection")
    protected OperationalProtectionType operationalProtection;
    @XmlElement(name = "AuthnMethod")
    protected AuthnMethodBaseType authnMethod;
    @XmlElement(name = "GoverningAgreements")
    protected GoverningAgreementsType governingAgreements;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setIdentification(IdentificationType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the technicalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalProtectionBaseType }
     *     
     */
    public TechnicalProtectionBaseType getTechnicalProtection() {
        return technicalProtection;
    }

    /**
     * Sets the value of the technicalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalProtectionBaseType }
     *     
     */
    public void setTechnicalProtection(TechnicalProtectionBaseType value) {
        this.technicalProtection = value;
    }

    /**
     * Gets the value of the operationalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalProtectionType }
     *     
     */
    public OperationalProtectionType getOperationalProtection() {
        return operationalProtection;
    }

    /**
     * Sets the value of the operationalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalProtectionType }
     *     
     */
    public void setOperationalProtection(OperationalProtectionType value) {
        this.operationalProtection = value;
    }

    /**
     * Gets the value of the authnMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AuthnMethodBaseType }
     *     
     */
    public AuthnMethodBaseType getAuthnMethod() {
        return authnMethod;
    }

    /**
     * Sets the value of the authnMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthnMethodBaseType }
     *     
     */
    public void setAuthnMethod(AuthnMethodBaseType value) {
        this.authnMethod = value;
    }

    /**
     * Gets the value of the governingAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningAgreementsType }
     *     
     */
    public GoverningAgreementsType getGoverningAgreements() {
        return governingAgreements;
    }

    /**
     * Sets the value of the governingAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningAgreementsType }
     *     
     */
    public void setGoverningAgreements(GoverningAgreementsType value) {
        this.governingAgreements = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
