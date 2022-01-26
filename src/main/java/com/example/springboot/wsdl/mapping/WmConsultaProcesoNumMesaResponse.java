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
 *         &lt;element name="wm_ConsultaProcesoNumMesaResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "wmConsultaProcesoNumMesaResult"
})
@XmlRootElement(name = "wm_ConsultaProcesoNumMesaResponse")
public class WmConsultaProcesoNumMesaResponse {

    @XmlElement(name = "wm_ConsultaProcesoNumMesaResult")
    protected byte[] wmConsultaProcesoNumMesaResult;

    /**
     * Obtiene el valor de la propiedad wmConsultaProcesoNumMesaResult.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getWmConsultaProcesoNumMesaResult() {
        return wmConsultaProcesoNumMesaResult;
    }

    /**
     * Define el valor de la propiedad wmConsultaProcesoNumMesaResult.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setWmConsultaProcesoNumMesaResult(byte[] value) {
        this.wmConsultaProcesoNumMesaResult = value;
    }

}
