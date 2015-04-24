
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CubedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CubedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Item">
 *       &lt;sequence>
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="consignment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cubedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dimensionerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubedItem", propOrder = {
    "barcode",
    "consignment",
    "cubedDate",
    "dimensionerName",
    "processedDate",
    "status",
    "statusDate"
})
public class CubedItem
    extends Item
{

    @XmlElement(required = true, nillable = true)
    protected String barcode;
    @XmlElement(required = true, nillable = true)
    protected String consignment;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cubedDate;
    @XmlElement(required = true, nillable = true)
    protected String dimensionerName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedDate;
    @XmlElement(required = true, nillable = true)
    protected String status;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the consignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignment() {
        return consignment;
    }

    /**
     * Sets the value of the consignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignment(String value) {
        this.consignment = value;
    }

    /**
     * Gets the value of the cubedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCubedDate() {
        return cubedDate;
    }

    /**
     * Sets the value of the cubedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCubedDate(XMLGregorianCalendar value) {
        this.cubedDate = value;
    }

    /**
     * Gets the value of the dimensionerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionerName() {
        return dimensionerName;
    }

    /**
     * Sets the value of the dimensionerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionerName(String value) {
        this.dimensionerName = value;
    }

    /**
     * Gets the value of the processedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessedDate() {
        return processedDate;
    }

    /**
     * Sets the value of the processedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessedDate(XMLGregorianCalendar value) {
        this.processedDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

}
