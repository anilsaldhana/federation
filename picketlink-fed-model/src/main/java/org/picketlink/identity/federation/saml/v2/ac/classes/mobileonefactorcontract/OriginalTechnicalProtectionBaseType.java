//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.08 at 05:45:20 PM CST 
//


package org.picketlink.identity.federation.saml.v2.ac.classes.mobileonefactorcontract;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalProtectionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalProtectionBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}PrivateKeyProtection"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}SecretKeyProtection"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:MobileOneFactorContract}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "privateKeyProtection",
    "secretKeyProtection",
    "extension"
})
@XmlSeeAlso({
    TechnicalProtectionBaseType.class
})
public class OriginalTechnicalProtectionBaseType {

    @XmlElement(name = "PrivateKeyProtection")
    protected PrivateKeyProtectionType privateKeyProtection;
    @XmlElement(name = "SecretKeyProtection")
    protected SecretKeyProtectionType secretKeyProtection;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the privateKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateKeyProtectionType }
     *     
     */
    public PrivateKeyProtectionType getPrivateKeyProtection() {
        return privateKeyProtection;
    }

    /**
     * Sets the value of the privateKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateKeyProtectionType }
     *     
     */
    public void setPrivateKeyProtection(PrivateKeyProtectionType value) {
        this.privateKeyProtection = value;
    }

    /**
     * Gets the value of the secretKeyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link SecretKeyProtectionType }
     *     
     */
    public SecretKeyProtectionType getSecretKeyProtection() {
        return secretKeyProtection;
    }

    /**
     * Sets the value of the secretKeyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecretKeyProtectionType }
     *     
     */
    public void setSecretKeyProtection(SecretKeyProtectionType value) {
        this.secretKeyProtection = value;
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

}
