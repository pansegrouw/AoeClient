
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignmentNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="podData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POD", propOrder = {
    "consignmentNote",
    "podData"
})
public class POD {

    @XmlElement(required = true, nillable = true)
    protected String consignmentNote;
    @XmlElement(required = true, nillable = true)
    protected byte[] podData;

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
     * Gets the value of the podData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPodData() {
        return podData;
    }

    /**
     * Sets the value of the podData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPodData(byte[] value) {
        this.podData = value;
    }

}
