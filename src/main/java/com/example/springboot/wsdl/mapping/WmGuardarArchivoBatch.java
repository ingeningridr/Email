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
 *         &lt;element name="pi_sUsuarioWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sClaveWS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sNombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sExtencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sEnvio" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "piSUsuarioWS",
    "piSClaveWS",
    "piSNombreArchivo",
    "piSExtencion",
    "piSEnvio"
})
@XmlRootElement(name = "wm_GuardarArchivoBatch")
public class WmGuardarArchivoBatch {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sUsuarioWS")
    protected String piSUsuarioWS;
    @XmlElement(name = "pi_sClaveWS")
    protected String piSClaveWS;
    @XmlElement(name = "pi_sNombreArchivo")
    protected String piSNombreArchivo;
    @XmlElement(name = "pi_sExtencion")
    protected String piSExtencion;
    @XmlElement(name = "pi_sEnvio")
    protected byte[] piSEnvio;

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
     * Obtiene el valor de la propiedad piSUsuarioWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSUsuarioWS() {
        return piSUsuarioWS;
    }

    /**
     * Define el valor de la propiedad piSUsuarioWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSUsuarioWS(String value) {
        this.piSUsuarioWS = value;
    }

    /**
     * Obtiene el valor de la propiedad piSClaveWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSClaveWS() {
        return piSClaveWS;
    }

    /**
     * Define el valor de la propiedad piSClaveWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSClaveWS(String value) {
        this.piSClaveWS = value;
    }

    /**
     * Obtiene el valor de la propiedad piSNombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSNombreArchivo() {
        return piSNombreArchivo;
    }

    /**
     * Define el valor de la propiedad piSNombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSNombreArchivo(String value) {
        this.piSNombreArchivo = value;
    }

    /**
     * Obtiene el valor de la propiedad piSExtencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSExtencion() {
        return piSExtencion;
    }

    /**
     * Define el valor de la propiedad piSExtencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSExtencion(String value) {
        this.piSExtencion = value;
    }

    /**
     * Obtiene el valor de la propiedad piSEnvio.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPiSEnvio() {
        return piSEnvio;
    }

    /**
     * Define el valor de la propiedad piSEnvio.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPiSEnvio(byte[] value) {
        this.piSEnvio = value;
    }

}
