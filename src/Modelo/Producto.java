
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
    private String estado;

    public Producto() {
        this.id=sigIdproducto++;
    }

    public Producto( String nombre, String marcav, String modelov, int cantidad, double precio,String estado) {
        this();
        this.nombre = nombre;
        this.marcav = marcav;
        this.modelov = modelov;
        this.cantidad = cantidad;
        this.precio= precio;
        this.estado=estado;
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
        return "Producto{" + "nombre=" + nombre + ", marcav=" + marcav + ", modelov=" + modelov + '}';
    }
    
    
//no se solisito que fuera medante la clase Utileria el nombre de la clase
//    @Override
//    public String toString() {
//        return "["+nombre()+"]" + "id=" + getId() + ", nombre=" + getNombre() + ", marcav=" + getMarcav() + ", modelov=" + getModelov() + ", cantidad=" + getCantidad() + ", Precio="+ getPrecio()+ ", estado=" + getEstado();
//    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
    
}
