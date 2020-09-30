/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Utilerias;

/**
 *
 * @author geoffrey
 */
public class Empresa extends Cliente {
    private String contacto;
    private int descuento;

    public Empresa(String contacto, int descuento, String nombre, String nit, String direccion, String telefono) {
        super(nombre, nit, direccion, telefono);
        this.contacto = contacto;
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    Utilerias util=new Utilerias();
 
    @Override
    public String toString(Object obj) {
        return "["+ util.getNombreClase(obj) +"]{" + "id =" + getId() + ", nombre =" + getNombre() + ", nit =" + getNit() + ", direccion =" + getDireccion() + ", telefono =" + getTelefono() + "Contacto =" + getContacto()+ "Descuento =" + getDescuento()+'}';
      }  
    
}
