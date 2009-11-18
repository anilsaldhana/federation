//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.12.08 at 05:45:20 PM CST 
//


package org.picketlink.identity.federation.saml.v2.ac.classes.personalizedtelephony;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalizedTelephony}PhysicalVerification" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalizedTelephony}WrittenConsent" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalizedTelephony}GoverningAgreements" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalizedTelephony}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nym" type="{urn:oasis:names:tc:SAML:2.0:ac:classes:PersonalizedTelephony}nymType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "physicalVerification",
    "writtenConsent",
    "governingAgreements",
    "extension"
})
public class IdentificationType {

    @XmlElement(name = "PhysicalVerification")
    protected PhysicalVerification physicalVerification;
    @XmlElement(name = "WrittenConsent")
    protected ExtensionOnlyType writtenConsent;
    @XmlElement(name = "GoverningAgreements")
    protected GoverningAgreementsType governingAgreements;
    @XmlElement(name = "Extension")
    protected List<ExtensionType> extension;
    @XmlAttribute
    protected NymType nym;

    /**
     * Gets the value of the physicalVerification property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalVerification }
     *     
     */
    public PhysicalVerification getPhysicalVerification() {
        return physicalVerification;
    }

    /**
     * Sets the value of the physicalVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalVerification }
     *     
     */
    public void setPhysicalVerification(PhysicalVerification value) {
        this.physicalVerification = value;
    }

    /**
     * Gets the value of the writtenConsent property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public ExtensionOnlyType getWrittenConsent() {
        return writtenConsent;
    }

    /**
     * Sets the value of the writtenConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionOnlyType }
     *     
     */
    public void setWrittenConsent(ExtensionOnlyType value) {
        this.writtenConsent = value;
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
     * Gets the value of the nym property.
     * 
     * @return
     *     possible object is
     *     {@link NymType }
     *     
     */
    public NymType getNym() {
        return nym;
    }

    /**
     * Sets the value of the nym property.
     * 
     * @param value
     *     allowed object is
     *     {@link NymType }
     *     
     */
    public void setNym(NymType value) {
        this.nym = value;
    }

}
