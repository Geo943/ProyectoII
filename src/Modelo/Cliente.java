
package Modelo;

import Controlador.Utilerias;

/**
 *
 * @author geoffrey
 */
public class Cliente {

    private int id;
    private static int sigIdcliente=1;
    public String nombre;
    private String nit;
    private String direccion;
    private String telefono;
    private String estado;
    
//aumenta su valor 
    public Cliente() {
        this.id=sigIdcliente++; //inicializo
    }

    public Cliente(String nombre, String nit,String direccion, String telefono, String estado) { 
        //reutilizacion de constructor
        this(); //le asigno a la var static el incremento de id
        this.nombre = nombre;
        this.nit = nit;
        this.direccion=direccion;
        this.telefono = telefono;
        this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
 
    @Override
    public String toString() {
        Utilerias util=new Utilerias();
        return "["+ util.getNombreClase(this) +"]" + "id=" + getId() + ", nombre=" + getNombre() + ", nit=" + getNit() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", Estado =" + getEstado();
      }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
