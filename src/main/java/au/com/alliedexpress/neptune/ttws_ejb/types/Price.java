
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cubicFactor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discountClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="grossPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="jobCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="netPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "chargeQuantity",
    "cubicFactor",
    "discountClass",
    "discountRate",
    "grossPrice",
    "jobCode",
    "netPrice",
    "rateCode",
    "reason"
})
public class Price {

    protected int chargeQuantity;
    protected int cubicFactor;
    @XmlElement(required = true, nillable = true)
    protected String discountClass;
    protected double discountRate;
    protected double grossPrice;
    @XmlElement(required = true, nillable = true)
    protected String jobCode;
    protected double netPrice;
    @XmlElement(required = true, nillable = true)
    protected String rateCode;
    @XmlElement(required = true, nillable = true)
    protected String reason;

    /**
     * Gets the value of the chargeQuantity property.
     * 
     */
    public int getChargeQuantity() {
        return chargeQuantity;
    }

    /**
     * Sets the value of the chargeQuantity property.
     * 
     */
    public void setChargeQuantity(int value) {
        this.chargeQuantity = value;
    }

    /**
     * Gets the value of the cubicFactor property.
     * 
     */
    public int getCubicFactor() {
        return cubicFactor;
    }

    /**
     * Sets the value of the cubicFactor property.
     * 
     */
    public void setCubicFactor(int value) {
        this.cubicFactor = value;
    }

    /**
     * Gets the value of the discountClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountClass() {
        return discountClass;
    }

    /**
     * Sets the value of the discountClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountClass(String value) {
        this.discountClass = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     */
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     */
    public void setDiscountRate(double value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the grossPrice property.
     * 
     */
    public double getGrossPrice() {
        return grossPrice;
    }

    /**
     * Sets the value of the grossPrice property.
     * 
     */
    public void setGrossPrice(double value) {
        this.grossPrice = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
    }

    /**
     * Gets the value of the netPrice property.
     * 
     */
    public double getNetPrice() {
        return netPrice;
    }

    /**
     * Sets the value of the netPrice property.
     * 
     */
    public void setNetPrice(double value) {
        this.netPrice = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
