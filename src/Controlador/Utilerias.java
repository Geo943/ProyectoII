/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author geoffrey
 */
public class Utilerias {

    public String getNombreClase(Object obj) {

        return obj.getClass().getSimpleName();

    }
    //para  formato de moneda

    public NumberFormat formatmoneda(String cantidad) {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        nf.format(cantidad);
        return nf;

    }

}
