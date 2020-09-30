/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;

/**
 *
 * @author geoffrey
 */
public class Utilerias {   
        
  
        public String getNombreClase(Object obj) {  
     
        return obj.getClass().getSimpleName();
 
    }
   

}
