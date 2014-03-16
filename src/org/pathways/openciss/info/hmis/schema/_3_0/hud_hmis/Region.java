//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for region complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="region">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionID" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}id"/>
 *         &lt;element name="SiteServiceID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="RegionType" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}twoVal" minOccurs="0"/>
 *         &lt;element name="RegionDescription" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}string30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "region", propOrder = {
    "regionID",
    "siteServiceID",
    "regionType",
    "regionDescription"
})
public class Region {

    @XmlElement(name = "RegionID", required = true)
    protected Id regionID;
    @XmlElement(name = "SiteServiceID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger siteServiceID;
    @XmlElement(name = "RegionType")
    protected TwoVal regionType;
    @XmlElement(name = "RegionDescription")
    protected String30 regionDescription;

    /**
     * Gets the value of the regionID property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getRegionID() {
        return regionID;
    }

    /**
     * Sets the value of the regionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setRegionID(Id value) {
        this.regionID = value;
    }

    /**
     * Gets the value of the siteServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSiteServiceID() {
        return siteServiceID;
    }

    /**
     * Sets the value of the siteServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSiteServiceID(BigInteger value) {
        this.siteServiceID = value;
    }

    /**
     * Gets the value of the regionType property.
     * 
     * @return
     *     possible object is
     *     {@link TwoVal }
     *     
     */
    public TwoVal getRegionType() {
        return regionType;
    }

    /**
     * Sets the value of the regionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoVal }
     *     
     */
    public void setRegionType(TwoVal value) {
        this.regionType = value;
    }

    /**
     * Gets the value of the regionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String30 }
     *     
     */
    public String30 getRegionDescription() {
        return regionDescription;
    }

    /**
     * Sets the value of the regionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String30 }
     *     
     */
    public void setRegionDescription(String30 value) {
        this.regionDescription = value;
    }

}