//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.airs_3_0_mod;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TimeOpen refers to the times a service is open or available
 * 
 * <p>Java class for tTimeOpen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTimeOpen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sunday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Monday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tuesday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Wednesday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Thursday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Friday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Saturday" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimeOpen", propOrder = {
    "sunday",
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "notes"
})
public class TTimeOpen {

    @XmlElement(name = "Sunday")
    protected List<TDay> sunday;
    @XmlElement(name = "Monday")
    protected List<TDay> monday;
    @XmlElement(name = "Tuesday")
    protected List<TDay> tuesday;
    @XmlElement(name = "Wednesday")
    protected List<TDay> wednesday;
    @XmlElement(name = "Thursday")
    protected List<TDay> thursday;
    @XmlElement(name = "Friday")
    protected List<TDay> friday;
    @XmlElement(name = "Saturday")
    protected List<TDay> saturday;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the sunday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sunday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSunday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getSunday() {
        if (sunday == null) {
            sunday = new ArrayList<TDay>();
        }
        return this.sunday;
    }

    /**
     * Gets the value of the monday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getMonday() {
        if (monday == null) {
            monday = new ArrayList<TDay>();
        }
        return this.monday;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tuesday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTuesday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getTuesday() {
        if (tuesday == null) {
            tuesday = new ArrayList<TDay>();
        }
        return this.tuesday;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wednesday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWednesday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getWednesday() {
        if (wednesday == null) {
            wednesday = new ArrayList<TDay>();
        }
        return this.wednesday;
    }

    /**
     * Gets the value of the thursday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thursday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThursday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getThursday() {
        if (thursday == null) {
            thursday = new ArrayList<TDay>();
        }
        return this.thursday;
    }

    /**
     * Gets the value of the friday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the friday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFriday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getFriday() {
        if (friday == null) {
            friday = new ArrayList<TDay>();
        }
        return this.friday;
    }

    /**
     * Gets the value of the saturday property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saturday property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaturday().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDay }
     * 
     * 
     */
    public List<TDay> getSaturday() {
        if (saturday == null) {
            saturday = new ArrayList<TDay>();
        }
        return this.saturday;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}