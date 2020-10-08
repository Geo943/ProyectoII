package Modelo;

import Modelo.Cliente;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author geoffrey
 */
public class DataSistema {

    //public static ObservableList<Cliente> prueba;
    public static ArrayList<Cliente> list = new ArrayList<Cliente>(100);
    public static ArrayList<Producto> listpro = new ArrayList<Producto>(100);
    public static ArrayList<Orden> lisorden = new ArrayList<Orden>(100);

    Cliente c1 = new Individual("231967380101", "Pedro gomez", "58476", "zona 1", "58962102", "Alta");
    Cliente c2 = new Individual("266544370101", "rut Perez", "38569", "zona 5", "44855622", "Alta");
    Cliente c3 = new Individual("220252620101", "Pedro gomez", "98652", "zona 10", "23054896", "Alta");
    Cliente c4 = new Individual("280656556101", "Pedro gomez", "021555", "zona 12", "92356485", "Alta");
    Cliente c5 = new Empresa("Juan pedromo", 10, "Repuestos S.A", "586489", "zona 25", "58623515", "Alta");
    Cliente c6 = new Empresa("Hugo zanches", 8, "Las partes S.A", "963248", "zona 1", "44552211", "Alta");
    Cliente c7 = new Empresa("Carlos medrano", 10, "Los charros S.A", "562001", "zona 3", "99663322", "Alta");
    Cliente c8 = new Empresa("Lilian Fernandez", 5, "Gastume S.A", "032158", "zona 4", "27270015", "Alta");
    //-----------------------------------------------------------------------------------------------
    Producto p1 = new Producto("BomperD", "Mazda", "2020", 1, 500, "Alta");
    Producto p2 = new Producto("BomperT", "BMW", "2015", 1, 1500, "Alta");
    Producto p3 = new Producto("Pastillas de freno D", "Honda", "2014", 1, 500, "Alta");
    Producto p4 = new Producto("Pastillas de freno T", "Nissan", "2000", 1, 700, "Alta");
    Producto p5 = new Producto("Filtro de aire", "Toyota", "2005", 1, 900, "Alta");
    Producto p6 = new Producto("Radiador", "Mazda", "2006", 1, 1500, "Alta");
    Producto p7 = new Producto("Candelas", "Toyota", "2008", 1, 1200, "Alta");
    Producto p8 = new Producto("Bobina", "Mazda", "2003", 1, 700, "Alta");
    //-----------------------------------------------------------------------------------------------
    ItemOrden io1 = new ItemOrden(1, p1);
    ItemOrden io2 = new ItemOrden(1, p2);
    ItemOrden io3 = new ItemOrden(1, p3);
    ItemOrden io4 = new ItemOrden(1, p4);
    ItemOrden io5 = new ItemOrden(1, p5);
    ItemOrden io6 = new ItemOrden(1, p6);
    ItemOrden io7 = new ItemOrden(1, p6);
    //-----------------------------------------------------------------------------------------------
    Orden o1 = new Orden(c1, io1, io2, 100, io1.getTotal(), "Express", "activo", 2);
    Orden o2 = new Orden(c2, io2, io3, 120, io2.getTotal(), "Express", "activo", 3);
    Orden o3 = new Orden(c3, io4, io5, 130, io4.getTotal(), "Express", "activo", 1);
    Orden o4 = new Orden(c4, io6, io7, 150, io6.getTotal(), "Express", "activo", 3);
    Orden o5 = new Orden(c5, io1, io2, 100, io1.getTotal(), "Express", "activo", 2);
    Orden o6 = new Orden(c6, io3, io4, 90, io3.getTotal(), "Express", "activo", 1);
    Orden o7 = new Orden(c7, io5, io6, 90, io5.getTotal(), "Express", "activo", 3);
    Orden o8 = new Orden(c8, io7, io2, 100, io7.getTotal(), "Express", "activo", 1);

    public void llenarCliente() {
        list.add(0, c1);
        list.add(1, c2);
        list.add(2, c3);
        list.add(3, c4);
        list.add(4, c5);
        list.add(5, c6);
        list.add(6, c7);
        list.add(7, c8);
    }

    public void llenarCliempre() {

        list.add(0, c5);
        list.add(1, c6);
        list.add(2, c7);
        list.add(3, c8);
    }

    public ArrayList<Cliente> getClientes() {
        return list;
    }

    public void llenarProductos() {
        listpro.add(0, p1);
        listpro.add(1, p2);
        listpro.add(2, p3);
        listpro.add(3, p4);
        listpro.add(4, p5);
        listpro.add(5, p6);
        listpro.add(6, p7);
        listpro.add(7, p8);
    }

    public ArrayList<Producto> getProducto() {
        return listpro;
    }

    public void llenarorden() {
        lisorden.add(o1);
        lisorden.add(o2);
        lisorden.add(o3);
        lisorden.add(o4);
        lisorden.add(o5);
        lisorden.add(o6);
        lisorden.add(o7);
        lisorden.add(o8);

    }

}
