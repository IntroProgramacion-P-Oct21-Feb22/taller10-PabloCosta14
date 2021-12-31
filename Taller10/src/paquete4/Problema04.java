/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int fila;
        int columna;
        double dato;
        String cadena = "";
        for (fila = 0; fila < datos.length; fila++) {

            for (columna = 0; columna < datos.length; columna++) {
                System.out.printf("Ingrese los valores por teclado"
                        + " para la posicion [%s][%s]",
                        fila,
                        columna);
                dato = entrada.nextDouble();
                datos[fila][columna] = dato;

                /*cadena = String.format("%sLos valores por teclado ingresados en"
                        + "[%s][%s] son %s\n",
                        cadena, fila, columna, datos[fila][columna]);
                 Estas lineas comentadas sirven para comprobar los valores ingresador al arreglo
                 */
            }
        }
        //System.out.println(cadena);
    }
}
