//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.11.17 at 10:51:56 PM EST
//


package checkmarx.wsdl.portal;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetScansDisplayDataResult" type="{http://Checkmarx.com}CxWSResponseScansDisplayData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getScansDisplayDataResult"
})
@XmlRootElement(name = "GetScansDisplayDataResponse")
public class GetScansDisplayDataResponse {

    @XmlElement(name = "GetScansDisplayDataResult")
    protected CxWSResponseScansDisplayData getScansDisplayDataResult;

    /**
     * Gets the value of the getScansDisplayDataResult property.
     *
     * @return
     *     possible object is
     *     {@link CxWSResponseScansDisplayData }
     *
     */
    public CxWSResponseScansDisplayData getGetScansDisplayDataResult() {
        return getScansDisplayDataResult;
    }

    /**
     * Sets the value of the getScansDisplayDataResult property.
     *
     * @param value
     *     allowed object is
     *     {@link CxWSResponseScansDisplayData }
     *
     */
    public void setGetScansDisplayDataResult(CxWSResponseScansDisplayData value) {
        this.getScansDisplayDataResult = value;
    }

}