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
 * <p>Java class for hIVAIDSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hIVAIDSStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasHIVAIDS" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}fourValDKRefused"/>
 *         &lt;element name="ReceiveHIVAIDSServices" type="{http://www.hmis.info/schema/3_0/HUD_HMIS.xsd}fourValDKRefused" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hIVAIDSStatus", propOrder = {
    "hasHIVAIDS",
    "receiveHIVAIDSServices"
})
public class HIVAIDSStatus {

    @XmlElement(name = "HasHIVAIDS", required = true)
    protected FourValDKRefused hasHIVAIDS;
    @XmlElement(name = "ReceiveHIVAIDSServices")
    protected FourValDKRefused receiveHIVAIDSServices;

    /**
     * Gets the value of the hasHIVAIDS property.
     * 
     * @return
     *     possible object is
     *     {@link FourValDKRefused }
     *     
     */
    public FourValDKRefused getHasHIVAIDS() {
        return hasHIVAIDS;
    }

    /**
     * Sets the value of the hasHIVAIDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link FourValDKRefused }
     *     
     */
    public void setHasHIVAIDS(FourValDKRefused value) {
        this.hasHIVAIDS = value;
    }

    /**
     * Gets the value of the receiveHIVAIDSServices property.
     * 
     * @return
     *     possible object is
     *     {@link FourValDKRefused }
     *     
     */
    public FourValDKRefused getReceiveHIVAIDSServices() {
        return receiveHIVAIDSServices;
    }

    /**
     * Sets the value of the receiveHIVAIDSServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link FourValDKRefused }
     *     
     */
    public void setReceiveHIVAIDSServices(FourValDKRefused value) {
        this.receiveHIVAIDSServices = value;
    }

}