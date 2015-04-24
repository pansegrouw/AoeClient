
package au.com.alliedexpress.neptune.ttws_ejb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errors" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="surcharges" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}JobCharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobPrice", propOrder = {
    "errors",
    "jobCharge",
    "surcharges",
    "totalCharge"
})
public class JobPrice {

    @XmlElement(required = true, nillable = true)
    protected String errors;
    protected double jobCharge;
    @XmlElement(nillable = true)
    protected List<JobCharge> surcharges;
    protected double totalCharge;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrors(String value) {
        this.errors = value;
    }

    /**
     * Gets the value of the jobCharge property.
     * 
     */
    public double getJobCharge() {
        return jobCharge;
    }

    /**
     * Sets the value of the jobCharge property.
     * 
     */
    public void setJobCharge(double value) {
        this.jobCharge = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurcharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobCharge }
     * 
     * 
     */
    public List<JobCharge> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<JobCharge>();
        }
        return this.surcharges;
    }

    /**
     * Gets the value of the totalCharge property.
     * 
     */
    public double getTotalCharge() {
        return totalCharge;
    }

    /**
     * Sets the value of the totalCharge property.
     * 
     */
    public void setTotalCharge(double value) {
        this.totalCharge = value;
    }

}
