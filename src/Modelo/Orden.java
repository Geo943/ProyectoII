package Modelo;

import java.util.Date;

/**
 *
 * @author geoffrey
 */
public class Orden {

    public static int getSigidOrden() {
        return sigidOrden;
    }

    public static void setSigidOrden(int aSigidOrden) {
        sigidOrden = aSigidOrden;
    }

    private int id;
    private Cliente cliente;
    private ItemOrden itemorden1;
    private ItemOrden itemorden2;
    private Date fechaOrden;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private static int sigidOrden;
    private int diasEnvio;

    public Orden() {
        this.id = 1;
        this.total = 0.0;
        this.fechaOrden = new Date();
    }

    public Orden(Date pFecha) {
        this();
        this.fechaOrden = pFecha;
    }
private ItemOrden or=new ItemOrden();
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

    public Orden(Cliente cliente, Date fechaOrden, double precioEnvio, String estado, int diasEnvio,String tipoEnvio) {
        this.cliente = cliente;
        this.fechaOrden = fechaOrden;
        this.precioEnvio = precioEnvio;
        this.estado = estado;
        this.diasEnvio = diasEnvio;
        this.tipoEnvio = tipoEnvio;
        
    }

    public double getTotalOrden( ){
        ItemOrden io= new ItemOrden();
        Empresa empre = new Empresa();
        double to= io.getTotal()-(empre.getDescuento()/100);
        return to;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemOrden getItemorden1() {
        return itemorden1;
    }

    public void setItemorden1(ItemOrden itemorden1) {
        this.itemorden1 = itemorden1;
    }

    public ItemOrden getItemorden2() {
        return itemorden2;
    }

    public void setItemorden2(ItemOrden itemorden2) {
        this.itemorden2 = itemorden2;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDiasEnvio() {
        return diasEnvio;
    }

    public void setDiasEnvio(int diasEnvio) {
        this.diasEnvio = diasEnvio;
    }

    
}
