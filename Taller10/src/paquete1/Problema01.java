/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author PabloCosta14
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila;
        int columna;
        double suma;
        double promedio;
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] nombresEstudiantes = {"Jerry ponce", "Gabriela Lewis",
            "David Bell"};

        for (fila = 0; fila < nombresEstudiantes.length; fila++) {
            suma = 0;

            for (columna = 0; columna < notas[fila].length; columna++) {
                suma = suma + notas[fila][columna];

            }
            promedio = suma / 4;

            System.out.printf("Estudiante: %s tiene un promedio de %.2f\n",
                    nombresEstudiantes[fila],
                    promedio);
        }
    }

}
