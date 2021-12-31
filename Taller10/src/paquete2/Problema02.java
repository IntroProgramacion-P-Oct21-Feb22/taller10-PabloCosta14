/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PabloCosta14
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] ventas = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robbert Wallace"};
        double venta;
        int fila;
        int columna;
        double suma = 0;
        String cadenafinal = "";
        for (fila = 0; fila < vendedores.length; fila++) {

            for (columna = 0; columna < 5; columna++) {
                System.out.printf("Ingrese el valor de venta total del dia\n");
                venta = entrada.nextDouble();
                ventas[fila][columna] = venta;
                suma = suma + ventas[fila][columna];

            }
            cadenafinal = String.format("%sVendedor(a) %s\n",
                    cadenafinal, vendedores[fila]);
        }
        System.out.println(cadenafinal);
        System.out.printf("Ha realizado un total de %s$ en ventas\n", suma);
    }

}
