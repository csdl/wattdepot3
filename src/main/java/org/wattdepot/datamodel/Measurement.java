//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.13 at 12:12:07 PM HST 
//

package org.wattdepot.datamodel;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

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
 *         &lt;element ref="{}Timestamp"/>
 *         &lt;element ref="{}MeasValue"/>
 *         &lt;element ref="{}Unit"/>
 *         &lt;element ref="{}Properties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "timestamp", "measValue", "unit", "properties" })
@XmlRootElement(name = "Measurement")
public class Measurement extends DataModel implements Serializable, Comparable<Measurement> {

  private final static long serialVersionUID = 12343L;
  @XmlElement(name = "Timestamp", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar timestamp;
  @XmlElement(name = "MeasValue", required = true)
  protected BigDecimal measValue;
  @XmlElement(name = "Unit", required = true)
  protected Unit unit;
  @XmlElement(name = "Properties")
  protected Properties properties;

  public static final String POWER_CONSUMED = "powerConsumed";
  public static final String POWER_GENERATED = "powerGenerated";
  public static final String ENERGY_CONSUMED = "energyConsumed";
  public static final String ENERGY_GENERATED = "energyGenerated";
  public static final String ENERGY_CONSUMED_TO_DATE = "energyConsumedToDate";
  public static final String ENERGY_GENERATED_TO_DATE = "energyGeneratedToDate";
  public static final String CARBON_EMITTED = "carbonEmitted";
  public static final String INTERPOLATED = "interpolated";
  public static final Property interpolatedProperty = new Property(INTERPOLATED, "true");

  /**
   * Default no-argument constructor, apparently needed by JAXB. Don't use this,
   * use the one with all the parameters.
   */
  public Measurement() {
    // JAXB needs default constructor.
  }

  /**
   * Returns a new Measurement with the provided parameters.
   * 
   * @param timestamp
   *          The timestamp for the Measurement.
   * @param value
   *          The value of the Measurement.
   * @param unit
   *          The unit of the Measurement.
   * @param props
   *          The properties for the Measurement.
   */
  public Measurement(XMLGregorianCalendar timestamp, BigDecimal value, Unit unit, Properties props) {
    this.timestamp = timestamp;
    this.measValue = value;
    this.unit = unit;
    this.properties = props;
  }

  /**
   * Returns a new Measurement with the provided parameters.
   * 
   * @param timestamp
   *          The timestamp for the Measurement.
   * @param value
   *          The value of the Measurement.
   * @param unit
   *          The unit of the Measurement.
   * @param prop
   *          A property for the Measurement.
   */
  public Measurement(XMLGregorianCalendar timestamp, BigDecimal value, Unit unit, Property prop) {
    this.timestamp = timestamp;
    this.measValue = value;
    this.unit = unit;
    this.properties = new Properties();
    this.properties.getProperty().add(prop);
  }

  /**
   * Gets the value of the timestamp property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the timestamp property.
   * 
   * @param value
   *          allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setTimestamp(XMLGregorianCalendar value) {
    this.timestamp = value;
  }

  public boolean isSetTimestamp() {
    return (this.timestamp != null);
  }

  /**
   * Gets the value of the measValue property.
   * 
   * @return possible object is {@link BigDecimal }
   * 
   */
  public BigDecimal getMeasValue() {
    return measValue;
  }

  /**
   * Sets the value of the measValue property.
   * 
   * @param value
   *          allowed object is {@link BigDecimal }
   * 
   */
  public void setMeasValue(BigDecimal value) {
    this.measValue = value;
  }

  public boolean isSetMeasValue() {
    return (this.measValue != null);
  }

  /**
   * Gets the value of the unit property.
   * 
   * @return possible object is {@link Unit }
   * 
   */
  public Unit getUnit() {
    return unit;
  }

  /**
   * Sets the value of the unit property.
   * 
   * @param value
   *          allowed object is {@link Unit }
   * 
   */
  public void setUnit(Unit value) {
    this.unit = value;
  }

  public boolean isSetUnit() {
    return (this.unit != null);
  }

  /**
   * Gets the value of the properties property.
   * 
   * @return possible object is {@link Properties }
   * 
   */
  public Properties getProperties() {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   * 
   * @param value
   *          allowed object is {@link Properties }
   * 
   */
  public void setProperties(Properties value) {
    this.properties = value;
  }

  public boolean isSetProperties() {
    return (this.properties != null);
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
    result = prime * result + ((properties == null) ? 0 : properties.hashCode());
    result = prime * result + ((unit == null) ? 0 : unit.hashCode());
    result = prime * result + ((measValue == null) ? 0 : measValue.hashCode());
    result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
    try {
      Measurement other = (Measurement) obj;
      if (properties == null) {
        if (other.properties != null) {
          return false;
        }
      }
      else if (!properties.equals(other.properties)) {
        return false;
      }
      if (unit == null) {
        if (other.unit != null) {
          return false;
        }
      }
      else if (!unit.equals(other.unit)) {
        return false;
      }
      if (measValue == null) {
        if (other.measValue != null) {
          return false;
        }
      }
      if (timestamp == null) {
        if (other.timestamp != null) {
          return false;
        }
      }
      return timestamp.equals(other.timestamp);
    } catch (ClassCastException cce) {
      return false;
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Measurement [timestamp=" + timestamp + ", value=" + measValue + ", unit=" + unit
        + ", properties=" + properties + "]";
  }

  /**
   * A convenience method to add a Property to the List of Property stored in
   * the Properties field.
   * 
   * @param prop
   *          The Property to add.
   */
  public void addProperty(Property prop) {
    if (this.properties == null) {
      this.properties = new Properties();
    }
    this.properties.getProperty().add(prop);
  }

  /**
   * Returns the value of the Property with the given key as a double. If the
   * key is not found, it returns 0. Only the first property with the given key
   * is returned. This is a convenience method that calls the underlying
   * Properties method.
   * 
   * @param key
   *          The key.
   * @return The key's value as a double.
   */
  public double getPropertyAsDouble(String key) {
    return this.properties.getPropertyAsDouble(key);
  }

  /**
   * Returns the value of the Property with the given key as a String. If the
   * key is not found, it returns null. Only the first property with the given
   * key is returned. This is a convenience method that calls the underlying
   * Properties method.
   * 
   * @param key
   *          The key.
   * @return The key's value as a double.
   */
  public String getProperty(String key) {
    return this.properties.getProperty(key);
  }

  /**
   * Returns true if this Properties contains the given Property, or false
   * otherwise. Convenience method that calls Properties.containsProperty().
   * 
   * @param prop
   *          The property to be searched for.
   * @return True if prop is found, false otherwise.
   */
  public boolean containsProperty(Property prop) {
    return this.properties.containsProperty(prop);
  }

  /**
   * Tests whether this Measurement was created through interpolation.
   * 
   * @return True if this Measurement was interpolated, false otherwise.
   */
  public boolean isInterpolated() {
    return containsProperty(interpolatedProperty);
  }

  /**
   * Sets the interpolated property to the desired value. To indicate that the
   * SensorData is interpolated, the property SensorData.INTERPOLATED is set to
   * value "true". To indicate that the SensorData is not interpolated, the
   * property is deleted.
   * 
   * @param interpolatedp
   *          The interpolated value to set.
   */
  public void setInterpolated(boolean interpolatedp) {
    if (interpolatedp) {
      addProperty(interpolatedProperty);
    }
    else {
      this.properties.getProperty().remove(interpolatedProperty);
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  @Override
  public int compareTo(Measurement o) {
    // if o is null, throw NullPointerException, per Comparable JavaDoc
    if (o == null) {
      throw new NullPointerException("Tried to compare SensorData with null");
    }
    if (o.equals(this)) {
      return 0;
    }
    int timestampCompare = timestamp.compare(o.getTimestamp());
    if (timestampCompare == DatatypeConstants.LESSER) {
      // this is earlier than o
      return -1;
    }
    else if (timestampCompare == DatatypeConstants.GREATER) {
      // this is later than o
      return 1;
    }
    return measValue.compareTo(o.measValue);
  }

}
