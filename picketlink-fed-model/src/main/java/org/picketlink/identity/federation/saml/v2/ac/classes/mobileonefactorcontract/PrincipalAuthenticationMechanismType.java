//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.08 at 05:45:20 PM CST 
//


package org.picketlink.identity.federation.saml.v2.ac.classes.mobileonefactorcontract;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalAuthenticationMechanismType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalAuthenticationMechanismType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}Password" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}RestrictedPassword" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}Token" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}Smartcard" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}ActivationPin" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="preauth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAuthenticationMechanismType", propOrder = {
    "password",
    "restrictedPassword",
    "token",
    "smartcard",
    "activationPin",
    "extension"
})
public class PrincipalAuthenticationMechanismType {

    @XmlElement(name = "Password")
    protected PasswordType password;
    @XmlElement(name = "RestrictedPassword")
    protected RestrictedPasswordType restrictedPassword;
    @XmlElement(name = "Token")
    protected TokenType token;
    @XmlElement(name = "Smartcard")
    protected ExtensionOnlyType smartcard;
    @XmlElement(name = "ActivationPin")
    protected ActivationPinType activationPin;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute
    protected BigInteger preauth;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordType }
     *     
     */
    public PasswordType getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordType }
     *     
     */
    public void setPassword(PasswordType value) {
        this.password = value;
    }

    /**
     * Gets the value of the restrictedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedPasswordType }
     *     
     */
    public RestrictedPasswordType getRestrictedPassword() {
        return restrictedPassword;
    }

    /**
     * Sets the value of the restrictedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedPasswordType }
     *     
     */
    public void setRestrictedPassword(RestrictedPasswordType value) {
        this.restrictedPassword = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link TokenType }
     *     
     */
    public TokenType getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenType }
     *     
     */
    public void setToken(TokenType value) {
        this.token = value;
    }

    /**
     * Gets the value of the smartcard property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getSmartcard() {
        return smartcard;
    }

    /**
     * Sets the value of the smartcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setSmartcard(ExtensionOnlyType value) {
        this.smartcard = value;
    }

    /**
     * Gets the value of the activationPin property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationPinType }
     *     
     */
    public ActivationPinType getActivationPin() {
        return activationPin;
    }

    /**
     * Sets the value of the activationPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationPinType }
     *     
     */
    public void setActivationPin(ActivationPinType value) {
        this.activationPin = value;
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
     * Gets the value of the preauth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreauth() {
        return preauth;
    }

    /**
     * Sets the value of the preauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreauth(BigInteger value) {
        this.preauth = value;
    }

}
