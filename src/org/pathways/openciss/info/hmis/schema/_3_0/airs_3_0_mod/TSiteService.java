//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.airs_3_0_mod;

import org.pathways.openciss.info.hmis.schema._3_0.hud_hmis.SiteService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SiteService is the smallest unit describing a "service" that is offered at a Site. It can be thought of as the intersection of a Site and a Taxonomy code (or related Taxonomy codes) and meta data about what is offered. *This documentation is modified from the AIRS Final 3.0 Data Standard.  It used to also say "A "Service" however is not represented as its own element because the "Service" cannot exist without a location (the site).", but this modified version adds a tService to describe aspects of a "Service" or "Program" common to add its Sites.
 * 
 * <p>Java class for tSiteService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSiteService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TimeOpen" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tTimeOpen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Seasonal" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tSeasonal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Taxonomy" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tTaxonomy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Languages" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tLanguages" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeographicAreaServed" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tGeographicAreaServed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResourceInfo" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tResourceInfo" minOccurs="0"/>
 *         &lt;element name="DocumentsRequired" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tDocumentsRequired" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicationProcess" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tApplicationProcess" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FeeStructure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherRequirements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AidRequirements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgeRequirements" type="{http://www.hmis.info/schema/3_0/AIRS_3_0_mod.xsd}tAgeRequirements" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenderRequirements" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyRequirements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncomeRequirements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResidencyRequirements" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AreaFlexibility" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceNotAlwaysAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ServiceGroupKey" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSiteService", propOrder = {
    "name",
    "key",
    "description",
    "phone",
    "timeOpen",
    "seasonal",
    "taxonomy",
    "languages",
    "geographicAreaServed",
    "resourceInfo",
    "documentsRequired",
    "applicationProcess",
    "feeStructure",
    "otherRequirements",
    "aidRequirements",
    "ageRequirements",
    "genderRequirements",
    "familyRequirements",
    "incomeRequirements",
    "residencyRequirements"
})
@XmlSeeAlso({
    SiteService.class
})
public class TSiteService {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Key", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger key;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Phone")
    protected List<TPhone> phone;
    @XmlElement(name = "TimeOpen")
    protected List<TTimeOpen> timeOpen;
    @XmlElement(name = "Seasonal")
    protected List<TSeasonal> seasonal;
    @XmlElement(name = "Taxonomy")
    protected List<TTaxonomy> taxonomy;
    @XmlElement(name = "Languages")
    protected List<TLanguages> languages;
    @XmlElement(name = "GeographicAreaServed")
    protected List<TGeographicAreaServed> geographicAreaServed;
    @XmlElement(name = "ResourceInfo")
    protected TResourceInfo resourceInfo;
    @XmlElement(name = "DocumentsRequired")
    protected List<TDocumentsRequired> documentsRequired;
    @XmlElement(name = "ApplicationProcess")
    protected List<TApplicationProcess> applicationProcess;
    @XmlElement(name = "FeeStructure")
    protected String feeStructure;
    @XmlElement(name = "OtherRequirements")
    protected List<String> otherRequirements;
    @XmlElement(name = "AidRequirements")
    protected List<String> aidRequirements;
    @XmlElement(name = "AgeRequirements")
    protected List<TAgeRequirements> ageRequirements;
    @XmlElement(name = "GenderRequirements")
    protected String genderRequirements;
    @XmlElement(name = "FamilyRequirements")
    protected List<String> familyRequirements;
    @XmlElement(name = "IncomeRequirements")
    protected List<String> incomeRequirements;
    @XmlElement(name = "ResidencyRequirements")
    protected List<String> residencyRequirements;
    @XmlAttribute(name = "AreaFlexibility")
    protected Boolean areaFlexibility;
    @XmlAttribute(name = "ServiceNotAlwaysAvailable")
    protected Boolean serviceNotAlwaysAvailable;
    @XmlAttribute(name = "ServiceGroupKey")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger serviceGroupKey;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKey(BigInteger value) {
        this.key = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPhone }
     * 
     * 
     */
    public List<TPhone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<TPhone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the timeOpen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeOpen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeOpen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTimeOpen }
     * 
     * 
     */
    public List<TTimeOpen> getTimeOpen() {
        if (timeOpen == null) {
            timeOpen = new ArrayList<TTimeOpen>();
        }
        return this.timeOpen;
    }

    /**
     * Gets the value of the seasonal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasonal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSeasonal }
     * 
     * 
     */
    public List<TSeasonal> getSeasonal() {
        if (seasonal == null) {
            seasonal = new ArrayList<TSeasonal>();
        }
        return this.seasonal;
    }

    /**
     * Gets the value of the taxonomy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxonomy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTaxonomy }
     * 
     * 
     */
    public List<TTaxonomy> getTaxonomy() {
        if (taxonomy == null) {
            taxonomy = new ArrayList<TTaxonomy>();
        }
        return this.taxonomy;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TLanguages }
     * 
     * 
     */
    public List<TLanguages> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<TLanguages>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the geographicAreaServed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicAreaServed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicAreaServed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TGeographicAreaServed }
     * 
     * 
     */
    public List<TGeographicAreaServed> getGeographicAreaServed() {
        if (geographicAreaServed == null) {
            geographicAreaServed = new ArrayList<TGeographicAreaServed>();
        }
        return this.geographicAreaServed;
    }

    /**
     * Gets the value of the resourceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TResourceInfo }
     *     
     */
    public TResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    /**
     * Sets the value of the resourceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TResourceInfo }
     *     
     */
    public void setResourceInfo(TResourceInfo value) {
        this.resourceInfo = value;
    }

    /**
     * Gets the value of the documentsRequired property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsRequired property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsRequired().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDocumentsRequired }
     * 
     * 
     */
    public List<TDocumentsRequired> getDocumentsRequired() {
        if (documentsRequired == null) {
            documentsRequired = new ArrayList<TDocumentsRequired>();
        }
        return this.documentsRequired;
    }

    /**
     * Gets the value of the applicationProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TApplicationProcess }
     * 
     * 
     */
    public List<TApplicationProcess> getApplicationProcess() {
        if (applicationProcess == null) {
            applicationProcess = new ArrayList<TApplicationProcess>();
        }
        return this.applicationProcess;
    }

    /**
     * Gets the value of the feeStructure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeStructure() {
        return feeStructure;
    }

    /**
     * Sets the value of the feeStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeStructure(String value) {
        this.feeStructure = value;
    }

    /**
     * Gets the value of the otherRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherRequirements() {
        if (otherRequirements == null) {
            otherRequirements = new ArrayList<String>();
        }
        return this.otherRequirements;
    }

    /**
     * Gets the value of the aidRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aidRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAidRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAidRequirements() {
        if (aidRequirements == null) {
            aidRequirements = new ArrayList<String>();
        }
        return this.aidRequirements;
    }

    /**
     * Gets the value of the ageRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TAgeRequirements }
     * 
     * 
     */
    public List<TAgeRequirements> getAgeRequirements() {
        if (ageRequirements == null) {
            ageRequirements = new ArrayList<TAgeRequirements>();
        }
        return this.ageRequirements;
    }

    /**
     * Gets the value of the genderRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderRequirements() {
        return genderRequirements;
    }

    /**
     * Sets the value of the genderRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderRequirements(String value) {
        this.genderRequirements = value;
    }

    /**
     * Gets the value of the familyRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFamilyRequirements() {
        if (familyRequirements == null) {
            familyRequirements = new ArrayList<String>();
        }
        return this.familyRequirements;
    }

    /**
     * Gets the value of the incomeRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncomeRequirements() {
        if (incomeRequirements == null) {
            incomeRequirements = new ArrayList<String>();
        }
        return this.incomeRequirements;
    }

    /**
     * Gets the value of the residencyRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residencyRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResidencyRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResidencyRequirements() {
        if (residencyRequirements == null) {
            residencyRequirements = new ArrayList<String>();
        }
        return this.residencyRequirements;
    }

    /**
     * Gets the value of the areaFlexibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAreaFlexibility() {
        return areaFlexibility;
    }

    /**
     * Sets the value of the areaFlexibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAreaFlexibility(Boolean value) {
        this.areaFlexibility = value;
    }

    /**
     * Gets the value of the serviceNotAlwaysAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceNotAlwaysAvailable() {
        return serviceNotAlwaysAvailable;
    }

    /**
     * Sets the value of the serviceNotAlwaysAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceNotAlwaysAvailable(Boolean value) {
        this.serviceNotAlwaysAvailable = value;
    }

    /**
     * Gets the value of the serviceGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceGroupKey() {
        return serviceGroupKey;
    }

    /**
     * Sets the value of the serviceGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceGroupKey(BigInteger value) {
        this.serviceGroupKey = value;
    }

}