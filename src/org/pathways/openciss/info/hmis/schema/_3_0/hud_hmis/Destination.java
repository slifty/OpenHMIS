//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for destination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="destination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationID" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}iDIndex"/>
 *         &lt;element name="DestinationCode" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}destinationCode" minOccurs="0"/>
 *         &lt;element name="DestinationOther" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string50" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destination", propOrder = {
    "destinationID",
    "destinationCode",
    "destinationOther"
})
public class Destination {

    @XmlElement(name = "DestinationID", required = true)
    protected IDIndex destinationID;
    @XmlElement(name = "DestinationCode")
    protected DestinationCode destinationCode;
    @XmlElement(name = "DestinationOther")
    protected String50 destinationOther;

    /**
     * Gets the value of the destinationID property.
     * 
     * @return
     *     possible object is
     *     {@link IDIndex }
     *     
     */
    public IDIndex getDestinationID() {
        return destinationID;
    }

    /**
     * Sets the value of the destinationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDIndex }
     *     
     */
    public void setDestinationID(IDIndex value) {
        this.destinationID = value;
    }

    /**
     * Gets the value of the destinationCode property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationCode }
     *     
     */
    public DestinationCode getDestinationCode() {
        return destinationCode;
    }

    /**
     * Sets the value of the destinationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationCode }
     *     
     */
    public void setDestinationCode(DestinationCode value) {
        this.destinationCode = value;
    }

    /**
     * Gets the value of the destinationOther property.
     * 
     * @return
     *     possible object is
     *     {@link String50 }
     *     
     */
    public String50 getDestinationOther() {
        return destinationOther;
    }

    /**
     * Sets the value of the destinationOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String50 }
     *     
     */
    public void setDestinationOther(String50 value) {
        this.destinationOther = value;
    }

}