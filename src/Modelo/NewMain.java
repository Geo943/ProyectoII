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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataSistema data = new DataSistema();
        ArrayList<Cliente> listadoClientes = data.getClientes();
        
        
        //listadoClientes =  data.getClientes();
        listadoClientes.forEach((n) -> System.out.println("holaaaaaaa"+n.toString(n)));
        
        //problemas para imprimir el array de clientes 
    }
    
}
