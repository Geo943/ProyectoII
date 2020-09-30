
package Modelo;

import Modelo.Cliente;
import java.util.ArrayList;


/**
 *
 * @author geoffrey
 */
public class DataSistema {
    
     public static ArrayList<Cliente> list;
    
     Cliente c1= new Individual("231967380101","Pedro gomez", "58476", "zona 1", "58962102");
     Cliente c2= new Individual("266544370101","rut Perez", "38569", "zona 5", "44855622");
     Cliente c3= new Individual("220252620101","Pedro gomez", "98652", "zona 10", "23054896");
     Cliente c4= new Individual("280656556101","Pedro gomez", "021555", "zona 12", "92356485");
     Cliente c5= new Empresa("Juan pedromo", 10, "Repuestos S.A", "586489", "zona 25", "58623515");
     Cliente c6= new Empresa("Hugo zanches", 8, "Las partes S.A", "963248", "zona 1", "44552211");
     Cliente c7= new Empresa("Carlos medrano", 10, "Los charros S.A", "562001", "zona 3", "99663322");
     Cliente c8= new Empresa("Lilian Fernandez", 5, "Gastume S.A", "032158", "zona 4", "27270015");
    
     public void llenarCliente(Cliente c){
        list  = new ArrayList<Cliente>(100);
        list.add(0, c1);
        list.add(1,c2);
        list.add(2,c3);
        list.add(3,c4);
        list.add(4,c5);
        list.add(5,c6);
        list.add(6,c7);
        list.add(7,c8);
     }
     
     public  ArrayList<Cliente> getClientes(){
         return list;
     }
    
   

    
    
   
    
    
    
    
    
    
    
}
