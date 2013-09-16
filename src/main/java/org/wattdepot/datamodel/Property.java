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
 *         &lt;element ref="{}Key"/>
 *         &lt;element ref="{}PropertyValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "key", "propertyValue" })
@XmlRootElement(name = "Property")
public class Property extends DataModel implements Serializable {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "Key", required = true)
  protected String key;
  @XmlElement(name = "PropertyValue", required = true)
  protected String propertyValue;

  /**
   * Default no-argument constructor, apparently needed by JAXB. Don't use this,
   * use the one with all the parameters.
   */
  public Property() {
    // Apparently needed by JAXB
  }

  /**
   * Returns a new Property object with the provided key and value.
   * 
   * @param key
   *          The key.
   * @param value
   *          The value.
   */
  public Property(String key, String value) {
    this.key = key;
    this.propertyValue = value;
  }

  /**
   * Returns a new Property object with the provided key and double value (which
   * will be converted to a string for storage). Convenience method.
   * 
   * @param key
   *          The key.
   * @param value
   *          The double value.
   */
  public Property(String key, double value) {
    this.key = key;
    this.propertyValue = Double.toString(value);
  }

  /**
   * Returns a new Property object with the provided key and int value (which
   * will be converted to a string for storage). Convenience method.
   * 
   * @param key
   *          The key.
   * @param value
   *          The int value.
   */
  public Property(String key, int value) {
    this.key = key;
    this.propertyValue = Integer.toString(value);
  }

  /**
   * Gets the value of the key property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getKey() {
    return key;
  }

  /**
   * Sets the value of the key property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setKey(String value) {
    this.key = value;
  }

  public boolean isSetKey() {
    return (this.key != null);
  }

  /**
   * Gets the value of the propertyValue property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPropertyValue() {
    return propertyValue;
  }

  /**
   * Sets the value of the propertyValue property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPropertyValue(String value) {
    this.propertyValue = value;
  }

  public boolean isSetPropertyValue() {
    return (this.propertyValue != null);
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
    result = prime * result + ((key == null) ? 0 : key.hashCode());
    result = prime * result + ((propertyValue == null) ? 0 : propertyValue.hashCode());
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
    Property other = (Property) obj;
    if (key == null) {
      if (other.key != null) {
        return false;
      }
    }
    else if (!key.equals(other.key)) {
      return false;
    }
    if (propertyValue == null) {
      if (other.propertyValue != null) {
        return false;
      }
    }
    else if (!propertyValue.equals(other.propertyValue)) {
      return false;
    }
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Property [key=" + key + ", value=" + propertyValue + "]";
  }
}