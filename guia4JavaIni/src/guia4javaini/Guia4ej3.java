/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia4javaini;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class Guia4ej3 {

    public static void main(String[] args) throws IOException  {

        String archivoEntrada = "E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\Ej3Entrada.txt";
        String temp="";
        String contArchivoEntrada;
        contArchivoEntrada = temp;
        for (String linea : Files.readAllLines(Paths.get(archivoEntrada)))
            contArchivoEntrada = temp + linea;
        System.out.println("Frase a codificar o descodificar: "+contArchivoEntrada);
        System.out.println("Ingrese si desea codificar (c) o descodificar el archivo: (d)");
        Scanner cod = new Scanner(System.in);
        char a = cod.next().charAt(0);

        System.out.println("Ingrese el tipo de codifiación o descodifiación, 1 o 2: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (a == 'c') {
            if (i == 1) {
               codificacion1(contArchivoEntrada);
            }
            if (i == 2) {
                codificacion2(contArchivoEntrada);
            }
        }
        if (a == 'd') {
            if (i == 1) {
                deCodificacion1(contArchivoEntrada);
            }
            if (i == 2) {
                deCodificacion2(contArchivoEntrada);
            }
        }

    }

    private static void codificacion1(String frase) {

        String fraseMin = frase.toLowerCase();
        String fraseCod = "";
//        System.out.println(frase);
        for (int i = 0; i < fraseMin.length(); i++) {
            char letra = fraseMin.charAt(i);
            if (letra == ' ') {
                fraseCod += 'a';
            } else {
                letra = (char) (letra + 1);
                fraseCod += letra;
            }
        }
        try {
            Files.writeString(Paths.get("E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\Ej3Salida.txt" ), fraseCod);
            System.out.println("Archivo codificado con exito");
        } catch (IOException ex) {
            Logger.getLogger(Guia4ej3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al codificar el archivo");
        }
//        return fraseCod;
    }

    private static void codificacion2(String frase) {

        String fraseMin = frase.toLowerCase();
        String fraseCod = "";
//        System.out.println(frase);
        for (int i = 0; i < fraseMin.length(); i++) {
            char letra = fraseMin.charAt(i);
            if (letra == ' ') {
                fraseCod += 'b';
            } else {
                letra = (char) (letra + 2);
                fraseCod += letra;
            }
        }
        try {
            Files.writeString(Paths.get("E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\Ej3Salida.txt" ), fraseCod);
            System.out.println("Archivo codificado con exito");
        } catch (IOException ex) {
            Logger.getLogger(Guia4ej3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al codificar el archivo");
        }
//        return fraseCod;
    }

    private static void deCodificacion1(String frase) {

        String fraseMin = frase.toLowerCase();
        String fraseDecod = "";
//        System.out.println(frase);
        for (int i = 0; i < fraseMin.length(); i++) {
            char letra = fraseMin.charAt(i);
            if (letra == 'a') {
                fraseDecod += ' ';
            } else {
                letra = (char) (letra - 1);
                fraseDecod += letra;
            }
        }
        try {
            Files.writeString(Paths.get("E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\Ej3Salida.txt" ), fraseDecod);
            System.out.println("Archivo decodificado con exito");
        } catch (IOException ex) {
            Logger.getLogger(Guia4ej3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al decodificar el archivo");
        }
//        return fraseDecod;
    }

    private static void deCodificacion2(String frase) {

        String fraseMin = frase.toLowerCase();
        String fraseDecod = "";
//        System.out.println(frase);
        for (int i = 0; i < fraseMin.length(); i++) {
            char letra = fraseMin.charAt(i);
            if (letra == 'b') {
                fraseDecod += ' ';
            } else {
                letra = (char) (letra - 2);
                fraseDecod += letra;
            }
        }
        try {
            Files.writeString(Paths.get("E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\Ej3Salida.txt" ), fraseDecod);
            System.out.println("Archivo decodificado con exito");
        } catch (IOException ex) {
            Logger.getLogger(Guia4ej3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al decodificar el archivo");
        }
//        return fraseDecod;
    }
}
