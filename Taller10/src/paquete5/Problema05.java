/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author PabloCosta14
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        int fila;
        int columna;
        String cadena = "";

        for (fila = 0; fila < estudiantes.length; fila++) {

            for (columna = 0; columna < estudiantes[fila].length; columna++) {

                char inicial = estudiantes[fila][columna].charAt(0);
                String inicialDos = String.valueOf(inicial);
                if (inicialDos.equals("S") || inicialDos.equals("P")
                        || inicialDos.equals("T")) {

                    cadena = String.format("%s%s\n", cadena,
                            estudiantes[fila][columna]);

                }
            }
        }
        System.out.println(cadena);
    }
}
