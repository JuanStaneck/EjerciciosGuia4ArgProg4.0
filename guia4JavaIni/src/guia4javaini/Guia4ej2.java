/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4javaini;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Guia4ej2 {

    public static void main(String[] args) throws IOException {

        String archivo = "E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\ejercicio2guia4.txt";
        List<String> contenidoArchivo = Files.readAllLines(Paths.get(archivo));
        System.out.println(contenidoArchivo);
        Scanner scn = new Scanner(System.in);
        System.out.println("Desea sumar (s) o multiplicar (m) los numeros en el archivo?");
        char orden = scn.next().charAt(0);
        if (orden == 's') {
            int resultado = 0;
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                System.out.println("Los numeros en el archivo son: " + linea);
                for (int i = 0; i < linea.length(); i++) {
                    resultado = resultado + (int) linea.charAt(i) - (int) '0';  //Resto el valor de ASCII del numero menos el del 0 y me da el valor del entero
                }
                System.out.println(resultado);
            }
        }
        if (orden == 'm') {
            int resultado = 1;
            for (String linea : Files.readAllLines(Paths.get(archivo))) {
                System.out.println("Los numeros en el archivo son: " + linea);
                for (int i = 0; i < linea.length(); i++) {
                    resultado = resultado * ((int) linea.charAt(i) - (int) '0');  //Resto el valor de ASCII del numero menos el del 0 y me da el valor del entero
                }
                System.out.println(resultado);
            }
        }
    }
}
