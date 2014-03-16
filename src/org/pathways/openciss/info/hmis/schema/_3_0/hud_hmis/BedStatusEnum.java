//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.19 at 05:35:09 PM EDT 
//


package org.pathways.openciss.info.hmis.schema._3_0.hud_hmis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bedStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bedStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="householdNoChildren"/>
 *     &lt;enumeration value="householdOneAdultOneChild"/>
 *     &lt;enumeration value="householdOnlyChildren"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bedStatusEnum")
@XmlEnum
public enum BedStatusEnum {


    /**
     * Number of persons in households without children
     * 
     */
    @XmlEnumValue("householdNoChildren")
    HOUSEHOLD_NO_CHILDREN("householdNoChildren"),

    /**
     * Number of persons in households with at least one adult and one child
     * 
     */
    @XmlEnumValue("householdOneAdultOneChild")
    HOUSEHOLD_ONE_ADULT_ONE_CHILD("householdOneAdultOneChild"),

    /**
     * Number of persons in households with only children. This includes only persons age 17 or under, including unaccompanied youth, adolescent parents and their children, adolescent siblings, or other household configurations composed only of children.
     * 
     */
    @XmlEnumValue("householdOnlyChildren")
    HOUSEHOLD_ONLY_CHILDREN("householdOnlyChildren");
    private final String value;

    BedStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BedStatusEnum fromValue(String v) {
        for (BedStatusEnum c: BedStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}