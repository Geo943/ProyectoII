/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.nio.file.Files.size;
import static javafx.beans.binding.Bindings.size;
import static sun.plugin2.os.windows.FLASHWINFO.size;

/**
 *
 * @author dev
 */
public class NoRepeatRandom {
    private int[] numeros = null;
    private int N = -1;
    private int numRestantes = 0;
    
    public NoRepeatRandom(int minVal, int maxVal){
        N = (maxVal - minVal) + 1;
        numeros = new int[N];
        int n = minVal;
        for(int i = 0; i < N; i++)
          numeros[i] = n++;
        numRestantes = N;
    }

    public int getRandom(){
        // Devuelve -1 cuando no quedan números
        if(numRestantes <= 0) return -1;

        // Si no, calculamos un índice aleatorio
        int index = (int) (numRestantes * Math.random());
        int randNum = numeros[index];

        // Desplazamos el valor obtenido al final del array, y 
        // disminuimos el numero de elementos restantes:
        numeros[index] = numeros[size()-1];
        numeros[--numRestantes] = randNum;

        // Devolvemos el número aleatorio
        return randNum;
    }
    
    

}
