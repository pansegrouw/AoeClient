
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicSignature", propOrder = {
    "docketNumber",
    "recipientName",
    "signatureImage"
})
public class ElectronicSignature {

    @XmlElement(required = true, nillable = true)
    protected String docketNumber;
    @XmlElement(required = true, nillable = true)
    protected String recipientName;
    @XmlElement(required = true, nillable = true)
    protected byte[] signatureImage;

    /**
     * Gets the value of the docketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocketNumber() {
        return docketNumber;
    }

    /**
     * Sets the value of the docketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocketNumber(String value) {
        this.docketNumber = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Gets the value of the signatureImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignatureImage() {
        return signatureImage;
    }

    /**
     * Sets the value of the signatureImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignatureImage(byte[] value) {
        this.signatureImage = value;
    }

}
