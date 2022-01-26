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
 *         &lt;element name="pi_sLogID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sLogDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_eLogTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_sLogObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_eLogFlujo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_eLogEstado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_eLogFecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pi_sLogRutaArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "piSLogID",
    "piSLogDescripcion",
    "piELogTipo",
    "piSLogObjeto",
    "piELogFlujo",
    "piELogEstado",
    "piELogFecha",
    "piSLogRutaArchivo"
})
@XmlRootElement(name = "wm_IngresoLogSAP")
public class WmIngresoLogSAP {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_sLogID")
    protected String piSLogID;
    @XmlElement(name = "pi_sLogDescripcion")
    protected String piSLogDescripcion;
    @XmlElement(name = "pi_eLogTipo")
    protected int piELogTipo;
    @XmlElement(name = "pi_sLogObjeto")
    protected String piSLogObjeto;
    @XmlElement(name = "pi_eLogFlujo")
    protected int piELogFlujo;
    @XmlElement(name = "pi_eLogEstado")
    protected int piELogEstado;
    @XmlElement(name = "pi_eLogFecha")
    protected String piELogFecha;
    @XmlElement(name = "pi_sLogRutaArchivo")
    protected String piSLogRutaArchivo;

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
     * Obtiene el valor de la propiedad piSLogID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogID() {
        return piSLogID;
    }

    /**
     * Define el valor de la propiedad piSLogID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogID(String value) {
        this.piSLogID = value;
    }

    /**
     * Obtiene el valor de la propiedad piSLogDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogDescripcion() {
        return piSLogDescripcion;
    }

    /**
     * Define el valor de la propiedad piSLogDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogDescripcion(String value) {
        this.piSLogDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad piELogTipo.
     * 
     */
    public int getPiELogTipo() {
        return piELogTipo;
    }

    /**
     * Define el valor de la propiedad piELogTipo.
     * 
     */
    public void setPiELogTipo(int value) {
        this.piELogTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad piSLogObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogObjeto() {
        return piSLogObjeto;
    }

    /**
     * Define el valor de la propiedad piSLogObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogObjeto(String value) {
        this.piSLogObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad piELogFlujo.
     * 
     */
    public int getPiELogFlujo() {
        return piELogFlujo;
    }

    /**
     * Define el valor de la propiedad piELogFlujo.
     * 
     */
    public void setPiELogFlujo(int value) {
        this.piELogFlujo = value;
    }

    /**
     * Obtiene el valor de la propiedad piELogEstado.
     * 
     */
    public int getPiELogEstado() {
        return piELogEstado;
    }

    /**
     * Define el valor de la propiedad piELogEstado.
     * 
     */
    public void setPiELogEstado(int value) {
        this.piELogEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad piELogFecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiELogFecha() {
        return piELogFecha;
    }

    /**
     * Define el valor de la propiedad piELogFecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiELogFecha(String value) {
        this.piELogFecha = value;
    }

    /**
     * Obtiene el valor de la propiedad piSLogRutaArchivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiSLogRutaArchivo() {
        return piSLogRutaArchivo;
    }

    /**
     * Define el valor de la propiedad piSLogRutaArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiSLogRutaArchivo(String value) {
        this.piSLogRutaArchivo = value;
    }

}
