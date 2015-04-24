
package au.com.alliedexpress.neptune.ttws_ejb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Account"/>
 *         &lt;element name="bookedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cancelledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="chargedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="closeTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cubedItems" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}CubedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cubicWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dispatchedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="docketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instructions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="items" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobErrors" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}JobError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobNotes" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobStops" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}JobStop" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pods" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}POD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="price" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Price"/>
 *         &lt;element name="readyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="referenceNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scannings" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Scanning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scheduledPickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="serviceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatures" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}ElectronicSignature" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validatedHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vehicle" type="{http://neptune.alliedexpress.com.au/ttws-ejb/types}Vehicle"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "account",
    "bookedBy",
    "bookedDate",
    "cancelledDate",
    "chargedDate",
    "closeTime",
    "cubedItems",
    "cubicWeight",
    "deliveryDate",
    "dispatchedDate",
    "docketNumber",
    "instructions",
    "itemCount",
    "items",
    "jobErrors",
    "jobNotes",
    "jobNumber",
    "jobStatus",
    "jobStops",
    "jobType",
    "notes",
    "pickupDate",
    "pods",
    "price",
    "readyDate",
    "referenceNumbers",
    "scannings",
    "scheduledDeliveryDate",
    "scheduledPickupDate",
    "serviceDescription",
    "serviceLevel",
    "signatures",
    "validatedHash",
    "vehicle",
    "volume",
    "weight"
})
public class Job {

    @XmlElement(required = true, nillable = true)
    protected Account account;
    @XmlElement(required = true, nillable = true)
    protected String bookedBy;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookedDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargedDate;
    @XmlElement(required = true, nillable = true)
    protected String closeTime;
    @XmlElement(nillable = true)
    protected List<CubedItem> cubedItems;
    protected double cubicWeight;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispatchedDate;
    @XmlElement(required = true, nillable = true)
    protected String docketNumber;
    @XmlElement(required = true, nillable = true)
    protected String instructions;
    protected int itemCount;
    @XmlElement(nillable = true)
    protected List<Item> items;
    @XmlElement(nillable = true)
    protected List<JobError> jobErrors;
    @XmlElement(nillable = true)
    protected List<Note> jobNotes;
    protected int jobNumber;
    @XmlElement(required = true, nillable = true)
    protected String jobStatus;
    @XmlElement(nillable = true)
    protected List<JobStop> jobStops;
    @XmlElement(required = true, nillable = true)
    protected String jobType;
    @XmlElement(required = true, nillable = true)
    protected String notes;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    @XmlElement(nillable = true)
    protected List<POD> pods;
    @XmlElement(required = true, nillable = true)
    protected Price price;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar readyDate;
    @XmlElement(nillable = true)
    protected List<String> referenceNumbers;
    @XmlElement(nillable = true)
    protected List<Scanning> scannings;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDeliveryDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledPickupDate;
    @XmlElement(required = true, nillable = true)
    protected String serviceDescription;
    @XmlElement(required = true, nillable = true)
    protected String serviceLevel;
    @XmlElement(nillable = true)
    protected List<ElectronicSignature> signatures;
    @XmlElement(required = true, nillable = true)
    protected String validatedHash;
    @XmlElement(required = true, nillable = true)
    protected Vehicle vehicle;
    protected double volume;
    protected double weight;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the bookedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedBy() {
        return bookedBy;
    }

    /**
     * Sets the value of the bookedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedBy(String value) {
        this.bookedBy = value;
    }

    /**
     * Gets the value of the bookedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookedDate() {
        return bookedDate;
    }

    /**
     * Sets the value of the bookedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookedDate(XMLGregorianCalendar value) {
        this.bookedDate = value;
    }

    /**
     * Gets the value of the cancelledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledDate() {
        return cancelledDate;
    }

    /**
     * Sets the value of the cancelledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledDate(XMLGregorianCalendar value) {
        this.cancelledDate = value;
    }

    /**
     * Gets the value of the chargedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargedDate() {
        return chargedDate;
    }

    /**
     * Sets the value of the chargedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargedDate(XMLGregorianCalendar value) {
        this.chargedDate = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTime(String value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the cubedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cubedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCubedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CubedItem }
     * 
     * 
     */
    public List<CubedItem> getCubedItems() {
        if (cubedItems == null) {
            cubedItems = new ArrayList<CubedItem>();
        }
        return this.cubedItems;
    }

    /**
     * Gets the value of the cubicWeight property.
     * 
     */
    public double getCubicWeight() {
        return cubicWeight;
    }

    /**
     * Sets the value of the cubicWeight property.
     * 
     */
    public void setCubicWeight(double value) {
        this.cubicWeight = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the dispatchedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispatchedDate() {
        return dispatchedDate;
    }

    /**
     * Sets the value of the dispatchedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispatchedDate(XMLGregorianCalendar value) {
        this.dispatchedDate = value;
    }

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
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the itemCount property.
     * 
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     */
    public void setItemCount(int value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

    /**
     * Gets the value of the jobErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobError }
     * 
     * 
     */
    public List<JobError> getJobErrors() {
        if (jobErrors == null) {
            jobErrors = new ArrayList<JobError>();
        }
        return this.jobErrors;
    }

    /**
     * Gets the value of the jobNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getJobNotes() {
        if (jobNotes == null) {
            jobNotes = new ArrayList<Note>();
        }
        return this.jobNotes;
    }

    /**
     * Gets the value of the jobNumber property.
     * 
     */
    public int getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     */
    public void setJobNumber(int value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatus(String value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the jobStops property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobStops property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobStops().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobStop }
     * 
     * 
     */
    public List<JobStop> getJobStops() {
        if (jobStops == null) {
            jobStops = new ArrayList<JobStop>();
        }
        return this.jobStops;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the pods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POD }
     * 
     * 
     */
    public List<POD> getPods() {
        if (pods == null) {
            pods = new ArrayList<POD>();
        }
        return this.pods;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the readyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReadyDate() {
        return readyDate;
    }

    /**
     * Sets the value of the readyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReadyDate(XMLGregorianCalendar value) {
        this.readyDate = value;
    }

    /**
     * Gets the value of the referenceNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceNumbers() {
        if (referenceNumbers == null) {
            referenceNumbers = new ArrayList<String>();
        }
        return this.referenceNumbers;
    }

    /**
     * Gets the value of the scannings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scannings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScannings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scanning }
     * 
     * 
     */
    public List<Scanning> getScannings() {
        if (scannings == null) {
            scannings = new ArrayList<Scanning>();
        }
        return this.scannings;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryDate(XMLGregorianCalendar value) {
        this.scheduledDeliveryDate = value;
    }

    /**
     * Gets the value of the scheduledPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledPickupDate() {
        return scheduledPickupDate;
    }

    /**
     * Sets the value of the scheduledPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledPickupDate(XMLGregorianCalendar value) {
        this.scheduledPickupDate = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicSignature }
     * 
     * 
     */
    public List<ElectronicSignature> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<ElectronicSignature>();
        }
        return this.signatures;
    }

    /**
     * Gets the value of the validatedHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatedHash() {
        return validatedHash;
    }

    /**
     * Sets the value of the validatedHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatedHash(String value) {
        this.validatedHash = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Job [account=" + account + ", bookedBy=" + bookedBy + ", bookedDate=" + bookedDate + ", cancelledDate=" + cancelledDate + ", chargedDate=" + chargedDate
                + ", closeTime=" + closeTime + ", cubedItems=" + cubedItems + ", cubicWeight=" + cubicWeight + ", deliveryDate=" + deliveryDate + ", dispatchedDate="
                + dispatchedDate + ", docketNumber=" + docketNumber + ", instructions=" + instructions + ", itemCount=" + itemCount + ", items=" + items + ", jobErrors="
                + jobErrors + ", jobNotes=" + jobNotes + ", jobNumber=" + jobNumber + ", jobStatus=" + jobStatus + ", jobStops=" + jobStops + ", jobType=" + jobType + ", notes="
                + notes + ", pickupDate=" + pickupDate + ", pods=" + pods + ", price=" + price + ", readyDate=" + readyDate + ", referenceNumbers=" + referenceNumbers
                + ", scannings=" + scannings + ", scheduledDeliveryDate=" + scheduledDeliveryDate + ", scheduledPickupDate=" + scheduledPickupDate + ", serviceDescription="
                + serviceDescription + ", serviceLevel=" + serviceLevel + ", signatures=" + signatures + ", validatedHash=" + validatedHash + ", vehicle=" + vehicle + ", volume="
                + volume + ", weight=" + weight + "]";
    }
    
    
    
}
