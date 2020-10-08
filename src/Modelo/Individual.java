
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
    
    public Individual(String dpi, String nombre, String nit, String direccion, String telefono, String estado) {
        super(nombre, nit, direccion, telefono, estado);
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
   public String toString() {
   return getNombre();
   }
    
    
    public String toString(String a) {
        return "["+ util.getNombreClase(this) +"]" + "id=" + getId() + ", nombre=" + getNombre() + "DPI =" + getDpi() + ", nit=" + getNit() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", Estado=" + getEstado();
      }  
    
}
