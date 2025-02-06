/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        int dato;
        int suma = 0;
        String cadenaFinal = "Valores:\n";
        // arreglo de tipo entero
        // se le asigna valores concretos al arreglo cuando se lo
        // inicializa
        int[] arreglo1 = {1000, 2000, 3000, 4000, 5000};
        int[] sumas = new int[2];// arreglo de 5 elementos

        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {

            if (arreglo1[i] % 2 == 0) {
                sumas[0] = sumas[0] + arreglo1[i];
            } else {
                sumas[1] = sumas[1] + arreglo1[i];
                suma = suma + arreglo1[i];
                cadenaFinal = String.format("%s%d\n", cadenaFinal, arreglo1[i]);
            }

            // System.out.printf("La suma de los valores del arreglo es: %d\n", suma);
            // cadenaFinal = String.format("%s%d\n", cadenaFinal, suma);
            System.out.printf(("%s\nLa suma de los valores del arreglo es:%d\n"
                    + "Suma de pares: %d\nSuma de impares; %d\n"),
                    cadenaFinal, suma, sumas[0], sumas[1]);

        }
        /*
    Valores:
    1000
    2000
    3000
    4000
    5000
    La suma de los valores del arreglo es: 15000
    
         */

    }
}