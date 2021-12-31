/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        int fila;
        int columna;

        for (fila = 0; fila < notasCuantitativas.length; fila++) {

            for (columna = 0; columna < notasCuantitativas.length; columna++) {
                if (notasCuantitativas[fila][columna] >= 0
                        && notasCuantitativas[fila][columna] <= 2.9) {
                    notasCualitativas[fila][columna] = "Insuficiente";
                } else {
                    if (notasCuantitativas[fila][columna] >= 3
                            && notasCuantitativas[fila][columna] <= 4.9) {
                        notasCualitativas[fila][columna] = "Regular";
                    } else {
                        if (notasCuantitativas[fila][columna] >= 5
                                && notasCuantitativas[fila][columna] <= 7.9) {
                            notasCualitativas[fila][columna] = "Buena";
                        } else {
                            if (notasCuantitativas[fila][columna] >= 8
                                    && notasCuantitativas[fila][columna] <= 9.5) {
                                notasCualitativas[fila][columna] = "Muy Buena";
                            } else {
                                if (notasCuantitativas[fila][columna] >= 9.6
                                        && notasCuantitativas[fila][columna] <= 10) {
                                    notasCualitativas[fila][columna] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }
                /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
                 */
                System.out.printf("Las notas Cualitativas de la posicion "
                        + "[%s][%s] son %s\n",
                        fila, columna, notasCualitativas[fila][columna]);
            }

        }

    }
}
