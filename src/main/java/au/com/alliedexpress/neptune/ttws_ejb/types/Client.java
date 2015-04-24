
package au.com.alliedexpress.neptune.ttws_ejb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultShippingDivision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddresses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siteTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
    "clientCodes",
    "clientID",
    "clientName",
    "defaultShippingDivision",
    "errorTemplate",
    "ipAddresses",
    "signature",
    "siteTemplate"
})
public class Client {

    @XmlElement(nillable = true)
    protected List<String> clientCodes;
    protected int clientID;
    @XmlElement(required = true, nillable = true)
    protected String clientName;
    @XmlElement(required = true, nillable = true)
    protected String defaultShippingDivision;
    @XmlElement(required = true, nillable = true)
    protected String errorTemplate;
    @XmlElement(nillable = true)
    protected List<String> ipAddresses;
    @XmlElement(required = true, nillable = true)
    protected String signature;
    @XmlElement(required = true, nillable = true)
    protected String siteTemplate;

    /**
     * Gets the value of the clientCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClientCodes() {
        if (clientCodes == null) {
            clientCodes = new ArrayList<String>();
        }
        return this.clientCodes;
    }

    /**
     * Gets the value of the clientID property.
     * 
     */
    public int getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     */
    public void setClientID(int value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the defaultShippingDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultShippingDivision() {
        return defaultShippingDivision;
    }

    /**
     * Sets the value of the defaultShippingDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultShippingDivision(String value) {
        this.defaultShippingDivision = value;
    }

    /**
     * Gets the value of the errorTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorTemplate() {
        return errorTemplate;
    }

    /**
     * Sets the value of the errorTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorTemplate(String value) {
        this.errorTemplate = value;
    }

    /**
     * Gets the value of the ipAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIpAddresses() {
        if (ipAddresses == null) {
            ipAddresses = new ArrayList<String>();
        }
        return this.ipAddresses;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the siteTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTemplate() {
        return siteTemplate;
    }

    /**
     * Sets the value of the siteTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTemplate(String value) {
        this.siteTemplate = value;
    }

}
