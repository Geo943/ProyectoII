
package Modelo;

/**
 *
 * @author geoffrey
 */
public class Producto {
    private int id;
    static int sigIdproducto=2000;
    private String nombre;
    private String marcav;
    private String modelov;
    private int cantidad;
    private double precio;

    public Producto() {
        this.id=sigIdproducto;
    }

    public Producto(int id, String nombre, String marcav, String modelov, int cantidad, double precio) {
        this.id ++;
        this.nombre = nombre;
        this.marcav = marcav;
        this.modelov = modelov;
        this.cantidad = cantidad;
        this.precio= precio;
    }
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcav() {
        return marcav;
    }

    public void setMarcav(String marcav) {
        this.marcav = marcav;
    }

    public String getModelov() {
        return modelov;
    }

    public void setModelov(String modelov) {
        this.modelov = modelov;
    }
    
    public String nombre(){
        return this.getClass().getSimpleName();
    
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "["+nombre()+"]" + "id=" + getId() + ", nombre=" + getNombre() + ", marcav=" + getMarcav() + ", modelov=" + getModelov() + ", cantidad=" + getCantidad() + ", Precio="+ getPrecio();
    }

    
    
    
    
}
