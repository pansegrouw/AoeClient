
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobStop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geographicAddress" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}GeographicAddress"/>
 *         &lt;element name="jobStopFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stopNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stopType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobStop", propOrder = {
    "companyName",
    "contact",
    "geographicAddress",
    "jobStopFlag",
    "phoneNumber",
    "stopNumber",
    "stopType"
})
public class JobStop {

    @XmlElement(required = true, nillable = true)
    protected String companyName;
    @XmlElement(required = true, nillable = true)
    protected String contact;
    @XmlElement(required = true, nillable = true)
    protected GeographicAddress geographicAddress;
    @XmlElement(required = true, nillable = true)
    protected String jobStopFlag;
    @XmlElement(required = true, nillable = true)
    protected String phoneNumber;
    protected int stopNumber;
    @XmlElement(required = true, nillable = true)
    protected String stopType;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the geographicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress }
     *     
     */
    public GeographicAddress getGeographicAddress() {
        return geographicAddress;
    }

    /**
     * Sets the value of the geographicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress }
     *     
     */
    public void setGeographicAddress(GeographicAddress value) {
        this.geographicAddress = value;
    }

    /**
     * Gets the value of the jobStopFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStopFlag() {
        return jobStopFlag;
    }

    /**
     * Sets the value of the jobStopFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStopFlag(String value) {
        this.jobStopFlag = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the stopNumber property.
     * 
     */
    public int getStopNumber() {
        return stopNumber;
    }

    /**
     * Sets the value of the stopNumber property.
     * 
     */
    public void setStopNumber(int value) {
        this.stopNumber = value;
    }

    /**
     * Gets the value of the stopType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopType() {
        return stopType;
    }

    /**
     * Sets the value of the stopType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopType(String value) {
        this.stopType = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "JobStop [companyName=" + companyName + ", contact=" + contact + ", jobStopFlag=" + jobStopFlag + ", phoneNumber=" + phoneNumber + ", stopNumber=" + stopNumber
                + ", stopType=" + stopType + "]";
    }

    
    
    
}
