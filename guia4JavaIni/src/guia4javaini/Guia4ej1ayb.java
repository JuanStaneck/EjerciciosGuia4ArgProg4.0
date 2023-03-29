/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4javaini;

import java.util.Scanner;

public class Guia4ej1ayb {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros a ordenar, y a continuación una -a- si desea ordenarlos de menor a mayor y una -d- si desea ordenarlos de mayor a menor");
        int[] arreglo = new int[3];
        for (int i = 0; i < 3; i++)
            arreglo[i] = scn.nextInt();
        char orden = scn.next().charAt(0);
        int[] resultado = ordenamiento(arreglo, orden);
        for (int i=0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    private static int[] ordenamiento(int[] numerosAOrdenar, char orden) {
        int temp;
        if (orden == 'd') {
            for (int i = 0; i < numerosAOrdenar.length - 1; i++) {
                for (int j = 0; j < numerosAOrdenar.length - 1; j++) {
                    if (numerosAOrdenar[j] < numerosAOrdenar[j + 1]) {
                        temp = numerosAOrdenar[j];
                        numerosAOrdenar[j] = numerosAOrdenar[j + 1];
                        numerosAOrdenar[j + 1] = temp;
                    }
                }
            }
        }
        if (orden == 'a') {
            for (int i = 0; i < numerosAOrdenar.length - 1; i++) {
                for (int j = 0; j < numerosAOrdenar.length - 1; j++) {
                    if (numerosAOrdenar[j] > numerosAOrdenar[j + 1]) {
                        temp = numerosAOrdenar[j + 1];
                        numerosAOrdenar[j + 1] = numerosAOrdenar[j];
                        numerosAOrdenar[j] = temp;
                    }
                }
            }
        }
        return numerosAOrdenar;
    }

}
