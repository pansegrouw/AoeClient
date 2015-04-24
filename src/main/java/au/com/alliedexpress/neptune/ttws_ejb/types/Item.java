
package au.com.alliedexpress.neptune.ttws_ejb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dangerous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "dangerous",
    "height",
    "itemCount",
    "length",
    "volume",
    "weight",
    "width"
})
@XmlSeeAlso({
    CubedItem.class
})
public class Item {

    protected boolean dangerous;
    protected double height;
    protected int itemCount;
    protected double length;
    protected double volume;
    protected double weight;
    protected double width;

    /**
     * Gets the value of the dangerous property.
     * 
     */
    public boolean isDangerous() {
        return dangerous;
    }

    /**
     * Sets the value of the dangerous property.
     * 
     */
    public void setDangerous(boolean value) {
        this.dangerous = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
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
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
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

    /**
     * Gets the value of the width property.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Item [dangerous=" + dangerous + ", height=" + height + ", itemCount=" + itemCount + ", length=" + length + ", volume=" + volume + ", weight=" + weight + ", width="
                + width + "]";
    }

    
    
}
