//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.13 at 12:12:07 PM HST 
//

package org.wattdepot.datamodel;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Abbr"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "abbr" })
@XmlRootElement(name = "Unit")
public class Unit extends DataModel implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "Name", required = true)
  protected String name;
  @XmlElement(name = "Abbr", required = true)
  protected String abbr;

  public Unit() {
    // JAXB needs the default constructor.
  }

  /**
   * @param name
   *          The Name of the Unit.
   * @param abbr
   *          The Abbreviation for the Unit.
   */
  public Unit(String name, String abbr) {
    this.name = name;
    this.abbr = abbr;
  }

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the abbr property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAbbr() {
    return abbr;
  }

  /**
   * Sets the value of the abbr property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setAbbr(String value) {
    this.abbr = value;
  }

  public boolean isSetAbbr() {
    return (this.abbr != null);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((abbr == null) ? 0 : abbr.hashCode());
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Unit other = (Unit) obj;
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    }
    else if (!name.equals(other.name)) {
      return false;
    }
    if (abbr == null) {
      if (other.abbr != null) {
        return false;
      }
    }
    return abbr.equals(other.abbr);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return abbr;
  }

  
}
