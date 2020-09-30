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
public class Individual extends Cliente {
    private String dpi;

    public Individual (){
    }
    
    public Individual(String dpi, String nombre, String nit, String direccion, String telefono) {
        super(nombre, nit, direccion, telefono);
        this.dpi = dpi;
    }
    
     public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
  
   Utilerias util=new Utilerias();
 
    @Override
    public String toString(Object obj) {
        return "["+ util.getNombreClase(obj) +"]{" + "id=" + getId() + ", nombre=" + getNombre() + "DPI =" + getDpi() + ", nit=" + getNit() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + '}';
      }  
    
}
