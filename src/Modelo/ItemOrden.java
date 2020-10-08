package Modelo;

import Controlador.Utilerias;

/**
 *
 * @author geoffrey
 */
public class ItemOrden {

    private int noLinea; //numero de correlativo de orden 
    private int cantidad;
    public static Producto producto;

    public ItemOrden(int cantidad, Producto producto) {
        this.noLinea = randomx();
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //constructor para crear objetos vacios
    public ItemOrden() {
    }

    public int getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(int noLinea) {
        this.noLinea = noLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return producto.getPrecio() * cantidad;
    }

    public int randomx() {
        NoRepeatRandom random = new NoRepeatRandom(1, 1000);
        int num = random.getRandom();
        return num;
    }

    @Override
    public String toString() {
        Utilerias util = new Utilerias();
        return "[" + util.getNombreClase(this) + "]" + "noLinea=" + getNoLinea() + ", cantidad=" + getCantidad() + ", producto=" + producto + '}';
    }

}
