package Modelo;

import java.util.Date;

/**
 *
 * @author geoffrey
 */
public class Orden {

    int id;
    Cliente cliente;
    ItemOrden itemorden1;
    ItemOrden itemorden2;
    Date fechaOrden;
    double precioEnvio;
    double total;
    String tipoEnvio;
    String estado;
    static int sigidOrden;
    int diasEnvio;

    public Orden() {
        this.id = 1;
        this.total = 0.0;
        this.fechaOrden = new Date();
    }

    public Orden(Date pFecha) {
        this();
        this.fechaOrden = pFecha;
    }
ItemOrden or=new ItemOrden();
    public Orden(Cliente pcliente, ItemOrden itemorden1, ItemOrden itemorden2, double precioEnvio, double total, String tipoEnvio, String estado, int diasEnvio) {
        this();
        this.cliente = pcliente;
        this.itemorden1 = itemorden1;
        this.itemorden2 = itemorden2;
        this.fechaOrden =new Date();
        this.precioEnvio = precioEnvio;
        this.total = or.getTotal();
        this.tipoEnvio = tipoEnvio;
        this.estado = estado;
        this.diasEnvio = diasEnvio;
    }
    
    public double getTotalOrden( ){
        ItemOrden io= new ItemOrden();
        Empresa empre = new Empresa();
        double to= io.getTotal()-(empre.getDescuento()/100);
        return to;
    
    }

}
