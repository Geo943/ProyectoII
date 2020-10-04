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

    //     public static void main(String[] args) {
//          
//          ItemOrden obj = new ItemOrden();
//          
//         Producto pro = new Producto("frijoles", "ducal", "shupala", 1, 15.50);
//         Producto pro1 = new Producto("frijoles", "ducal", "shupala", 1, 15.50);
//         Producto pro2 = new Producto("frijoles", "ducal", "shupala", 1, 15.50);
//         
//         ItemOrden obj2=new ItemOrden(1, pro);
//         ItemOrden obj3=new ItemOrden(6, pro1);
//         ItemOrden obj4=new ItemOrden(5, pro2);
//         
//         
//          System.out.println("Correlativo Unico: "+obj2.getNoLinea()+" -  Cantidad: "+obj2.getCantidad()+" -  Producto: "+obj2.producto.getNombre()+"");
//          System.out.println("Correlativo Unico: "+obj3.getNoLinea()+" -  Cantidad: "+obj3.getCantidad()+" -  Producto: "+obj3.producto.getNombre()+"");
//          System.out.println("Correlativo Unico: "+obj4.getNoLinea()+" -  Cantidad: "+obj4.getCantidad()+" -  Producto: "+obj4.producto.getNombre()+"");
//          
//       
//          
//
    //  }
}
