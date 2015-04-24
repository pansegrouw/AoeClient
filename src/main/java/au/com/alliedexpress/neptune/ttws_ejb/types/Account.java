
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountKey" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountLedger" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultContact" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultPhoneNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultPostCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultSuburbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="priceSuppressed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shippingDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountCode",
    "accountHash",
    "accountKey",
    "accountLedger",
    "accountName",
    "accountState",
    "defaultAddress",
    "defaultContact",
    "defaultPhoneNo",
    "defaultPostCode",
    "defaultState",
    "defaultSuburbName",
    "discountLevel",
    "priceSuppressed",
    "shippingDivision"
})
public class Account {

    @XmlElement(required = true, nillable = true)
    protected String accountCode;
    @XmlElement(required = true, nillable = true)
    protected String accountHash;
    protected int accountKey;
    @XmlElement(required = true, nillable = true)
    protected String accountLedger;
    @XmlElement(required = true, nillable = true)
    protected String accountName;
    @XmlElement(required = true, nillable = true)
    protected String accountState;
    @XmlElement(required = true, nillable = true)
    protected String defaultAddress;
    @XmlElement(required = true, nillable = true)
    protected String defaultContact;
    @XmlElement(required = true, nillable = true)
    protected String defaultPhoneNo;
    @XmlElement(required = true, nillable = true)
    protected String defaultPostCode;
    @XmlElement(required = true, nillable = true)
    protected String defaultState;
    @XmlElement(required = true, nillable = true)
    protected String defaultSuburbName;
    protected int discountLevel;
    protected boolean priceSuppressed;
    @XmlElement(required = true, nillable = true)
    protected String shippingDivision;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the accountHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHash() {
        return accountHash;
    }

    /**
     * Sets the value of the accountHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHash(String value) {
        this.accountHash = value;
    }

    /**
     * Gets the value of the accountKey property.
     * 
     */
    public int getAccountKey() {
        return accountKey;
    }

    /**
     * Sets the value of the accountKey property.
     * 
     */
    public void setAccountKey(int value) {
        this.accountKey = value;
    }

    /**
     * Gets the value of the accountLedger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLedger() {
        return accountLedger;
    }

    /**
     * Sets the value of the accountLedger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLedger(String value) {
        this.accountLedger = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountState(String value) {
        this.accountState = value;
    }

    /**
     * Gets the value of the defaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Sets the value of the defaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAddress(String value) {
        this.defaultAddress = value;
    }

    /**
     * Gets the value of the defaultContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultContact() {
        return defaultContact;
    }

    /**
     * Sets the value of the defaultContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultContact(String value) {
        this.defaultContact = value;
    }

    /**
     * Gets the value of the defaultPhoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPhoneNo() {
        return defaultPhoneNo;
    }

    /**
     * Sets the value of the defaultPhoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPhoneNo(String value) {
        this.defaultPhoneNo = value;
    }

    /**
     * Gets the value of the defaultPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPostCode() {
        return defaultPostCode;
    }

    /**
     * Sets the value of the defaultPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPostCode(String value) {
        this.defaultPostCode = value;
    }

    /**
     * Gets the value of the defaultState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultState() {
        return defaultState;
    }

    /**
     * Sets the value of the defaultState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultState(String value) {
        this.defaultState = value;
    }

    /**
     * Gets the value of the defaultSuburbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSuburbName() {
        return defaultSuburbName;
    }

    /**
     * Sets the value of the defaultSuburbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSuburbName(String value) {
        this.defaultSuburbName = value;
    }

    /**
     * Gets the value of the discountLevel property.
     * 
     */
    public int getDiscountLevel() {
        return discountLevel;
    }

    /**
     * Sets the value of the discountLevel property.
     * 
     */
    public void setDiscountLevel(int value) {
        this.discountLevel = value;
    }

    /**
     * Gets the value of the priceSuppressed property.
     * 
     */
    public boolean isPriceSuppressed() {
        return priceSuppressed;
    }

    /**
     * Sets the value of the priceSuppressed property.
     * 
     */
    public void setPriceSuppressed(boolean value) {
        this.priceSuppressed = value;
    }

    /**
     * Gets the value of the shippingDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingDivision() {
        return shippingDivision;
    }

    /**
     * Sets the value of the shippingDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingDivision(String value) {
        this.shippingDivision = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Account [accountCode=" + accountCode + ", accountHash=" + accountHash + ", accountKey=" + accountKey + ", accountLedger=" + accountLedger + ", accountName="
                + accountName + ", accountState=" + accountState + ", defaultAddress=" + defaultAddress + ", defaultContact=" + defaultContact + ", defaultPhoneNo="
                + defaultPhoneNo + ", defaultPostCode=" + defaultPostCode + ", defaultState=" + defaultState + ", defaultSuburbName=" + defaultSuburbName + ", discountLevel="
                + discountLevel + ", priceSuppressed=" + priceSuppressed + ", shippingDivision=" + shippingDivision + "]";
    }

    
    
}
