//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.08 at 05:45:20 PM CST 
//


package org.picketlink.identity.federation.saml.v2.ac.classes.secureremotepassword;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivateKeyProtectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateKeyProtectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword}KeyActivation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword}KeyStorage" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword}KeySharing" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:SecureRemotePassword}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateKeyProtectionType", propOrder = {
    "keyActivation",
    "keyStorage",
    "keySharing",
    "extension"
})
public class PrivateKeyProtectionType {

    @XmlElement(name = "KeyActivation")
    protected KeyActivationType keyActivation;
    @XmlElement(name = "KeyStorage")
    protected KeyStorageType keyStorage;
    @XmlElement(name = "KeySharing")
    protected KeySharingType keySharing;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;

    /**
     * Gets the value of the keyActivation property.
     * 
     * @return
     *     possible object is
     *     {@link KeyActivationType }
     *     
     */
    public KeyActivationType getKeyActivation() {
        return keyActivation;
    }

    /**
     * Sets the value of the keyActivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyActivationType }
     *     
     */
    public void setKeyActivation(KeyActivationType value) {
        this.keyActivation = value;
    }

    /**
     * Gets the value of the keyStorage property.
     * 
     * @return
     *     possible object is
     *     {@link KeyStorageType }
     *     
     */
    public KeyStorageType getKeyStorage() {
        return keyStorage;
    }

    /**
     * Sets the value of the keyStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyStorageType }
     *     
     */
    public void setKeyStorage(KeyStorageType value) {
        this.keyStorage = value;
    }

    /**
     * Gets the value of the keySharing property.
     * 
     * @return
     *     possible object is
     *     {@link KeySharingType }
     *     
     */
    public KeySharingType getKeySharing() {
        return keySharing;
    }

    /**
     * Sets the value of the keySharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeySharingType }
     *     
     */
    public void setKeySharing(KeySharingType value) {
        this.keySharing = value;
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
