
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Scanning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scanning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consignmentNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consignmentPart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scanning", propOrder = {
    "batchID",
    "consignmentNote",
    "consignmentPart",
    "driverNum",
    "location",
    "scanDate",
    "userID"
})
public class Scanning {

    @XmlElement(required = true, nillable = true)
    protected String batchID;
    @XmlElement(required = true, nillable = true)
    protected String consignmentNote;
    @XmlElement(required = true, nillable = true)
    protected String consignmentPart;
    @XmlElement(required = true, nillable = true)
    protected String driverNum;
    @XmlElement(required = true, nillable = true)
    protected String location;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scanDate;
    @XmlElement(required = true, nillable = true)
    protected String userID;

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the consignmentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentNote() {
        return consignmentNote;
    }

    /**
     * Sets the value of the consignmentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentNote(String value) {
        this.consignmentNote = value;
    }

    /**
     * Gets the value of the consignmentPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignmentPart() {
        return consignmentPart;
    }

    /**
     * Sets the value of the consignmentPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignmentPart(String value) {
        this.consignmentPart = value;
    }

    /**
     * Gets the value of the driverNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverNum() {
        return driverNum;
    }

    /**
     * Sets the value of the driverNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverNum(String value) {
        this.driverNum = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDate(XMLGregorianCalendar value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
