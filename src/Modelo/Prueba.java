/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author geoffrey
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj = new Cliente();
        Cliente c = new Cliente("nombre1","32184-5","c3","65+6565");
        Cliente c2 = new Cliente("nombre1","32184-5","c3","65+6565");
        Cliente c3 = new Cliente("nombre1","32184-5","c3","65+6565");
        //System.out.println(""+c.toString(c)+""+c2.toString(c)+""+c3.toString(c)); 
        
        Individual a= new Individual("6+65+65", "asdasd", "asdasd", "z68464", "535135");
        Individual a1= new Individual("sdfsd", "a23", "assdd", "2323", "5ccvscv");
        //System.out.println(a.toString(a)+""+a1.toString(a1));
        
        
        ArrayList<Cliente> listadoClientes = new ArrayList<Cliente>();
        
        Empresa b= new Empresa("asljk", 5, "sad", "asd", "asd", "asd");
        
        //System.out.println(b.toString(b));
        
        
        
        // llenar la lista de clientes
        DataSistema data = new DataSistema();
        data.llenarCliente(c);
        data.llenarCliente(c2);
        data.llenarCliente(c3);
        listadoClientes =  data.getClientes();
        
        // imprime todos los clientes de la lista.
        //listadoClientes.forEach((n) -> System.out.println("holaaaaaaa"+n));
        
        
        
        
    }
    
}
