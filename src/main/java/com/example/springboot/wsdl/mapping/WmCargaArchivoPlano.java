//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.01.24 a las 02:13:19 PM COT 
//


package com.example.springboot.wsdl.mapping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pi_sIdemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sXml" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="pi_sPlano" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "piSIdemp",
    "piSNombre",
    "piSXml",
    "piSPlano"
})
@XmlRootElement(name = "wm_CargaArchivoPlano")
public class WmCargaArchivoPlano {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sNombre")
    protected String piSNombre;
    @XmlElement(name = "pi_sXml")
    protected byte[] piSXml;
    @XmlElement(name = "pi_sPlano")
    protected byte[] piSPlano;

    /**
     * Obtiene el valor de la propiedad piSIdemp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSIdemp() {
        return piSIdemp;
    }

    /**
     * Define el valor de la propiedad piSIdemp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSIdemp(String value) {
        this.piSIdemp = value;
    }

    /**
     * Obtiene el valor de la propiedad piSNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSNombre() {
        return piSNombre;
    }

    /**
     * Define el valor de la propiedad piSNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSNombre(String value) {
        this.piSNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad piSXml.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPiSXml() {
        return piSXml;
    }

    /**
     * Define el valor de la propiedad piSXml.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPiSXml(byte[] value) {
        this.piSXml = value;
    }

    /**
     * Obtiene el valor de la propiedad piSPlano.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPiSPlano() {
        return piSPlano;
    }

    /**
     * Define el valor de la propiedad piSPlano.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPiSPlano(byte[] value) {
        this.piSPlano = value;
    }

}
