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
 *         &lt;element name="pi_iNumeroCalle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_iNumeroCarrera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pi_iNumeroAdicional" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "piINumeroCalle",
    "piINumeroCarrera",
    "piINumeroAdicional"
})
@XmlRootElement(name = "wm_pb_devolver_Zona")
public class WmPbDevolverZona {

    @XmlElement(name = "pi_sIdemp")
    protected String piSIdemp;
    @XmlElement(name = "pi_iNumeroCalle")
    protected int piINumeroCalle;
    @XmlElement(name = "pi_iNumeroCarrera")
    protected int piINumeroCarrera;
    @XmlElement(name = "pi_iNumeroAdicional")
    protected int piINumeroAdicional;

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
     * Obtiene el valor de la propiedad piINumeroCalle.
     * 
     */
    public int getPiINumeroCalle() {
        return piINumeroCalle;
    }

    /**
     * Define el valor de la propiedad piINumeroCalle.
     * 
     */
    public void setPiINumeroCalle(int value) {
        this.piINumeroCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad piINumeroCarrera.
     * 
     */
    public int getPiINumeroCarrera() {
        return piINumeroCarrera;
    }

    /**
     * Define el valor de la propiedad piINumeroCarrera.
     * 
     */
    public void setPiINumeroCarrera(int value) {
        this.piINumeroCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad piINumeroAdicional.
     * 
     */
    public int getPiINumeroAdicional() {
        return piINumeroAdicional;
    }

    /**
     * Define el valor de la propiedad piINumeroAdicional.
     * 
     */
    public void setPiINumeroAdicional(int value) {
        this.piINumeroAdicional = value;
    }

}
