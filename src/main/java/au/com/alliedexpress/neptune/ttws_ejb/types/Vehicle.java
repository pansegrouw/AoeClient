
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}GeographicAddress"/>
 *         &lt;element name="vehicleID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "location",
    "vehicleID"
})
public class Vehicle {

    @XmlElement(required = true, nillable = true)
    protected GeographicAddress location;
    protected int vehicleID;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress }
     *     
     */
    public GeographicAddress getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress }
     *     
     */
    public void setLocation(GeographicAddress value) {
        this.location = value;
    }

    /**
     * Gets the value of the vehicleID property.
     * 
     */
    public int getVehicleID() {
        return vehicleID;
    }

    /**
     * Sets the value of the vehicleID property.
     * 
     */
    public void setVehicleID(int value) {
        this.vehicleID = value;
    }

}
