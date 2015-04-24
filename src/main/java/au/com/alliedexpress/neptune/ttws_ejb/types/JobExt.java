
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freightOversizedHomeDel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="job" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Job"/>
 *         &lt;element name="onForwardChargeDelivery" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="onForwardChargePickup" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobExt", propOrder = {
    "freightOversizedHomeDel",
    "job",
    "onForwardChargeDelivery",
    "onForwardChargePickup"
})
public class JobExt {

    protected double freightOversizedHomeDel;
    @XmlElement(required = true, nillable = true)
    protected Job job;
    protected double onForwardChargeDelivery;
    protected double onForwardChargePickup;

    /**
     * Gets the value of the freightOversizedHomeDel property.
     * 
     */
    public double getFreightOversizedHomeDel() {
        return freightOversizedHomeDel;
    }

    /**
     * Sets the value of the freightOversizedHomeDel property.
     * 
     */
    public void setFreightOversizedHomeDel(double value) {
        this.freightOversizedHomeDel = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
    }

    /**
     * Gets the value of the onForwardChargeDelivery property.
     * 
     */
    public double getOnForwardChargeDelivery() {
        return onForwardChargeDelivery;
    }

    /**
     * Sets the value of the onForwardChargeDelivery property.
     * 
     */
    public void setOnForwardChargeDelivery(double value) {
        this.onForwardChargeDelivery = value;
    }

    /**
     * Gets the value of the onForwardChargePickup property.
     * 
     */
    public double getOnForwardChargePickup() {
        return onForwardChargePickup;
    }

    /**
     * Sets the value of the onForwardChargePickup property.
     * 
     */
    public void setOnForwardChargePickup(double value) {
        this.onForwardChargePickup = value;
    }

}
