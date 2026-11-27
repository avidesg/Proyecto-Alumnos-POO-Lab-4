/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.ufg.lab4.alumnos.base;

/**
 *
 * @author andresvides
 */
import java.util.Scanner;

public class Lab4AlumnosBase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String opcion;

        do {
            System.out.println("\n---- Gestion de Alumnos ----");
            System.out.println("1. Importar estudiantes desde Excel");
            System.out.println("2. Mostrar estudiantes importados");
            System.out.println("3. Ordenar por carnet (ascendente)");
            System.out.println("4. Ordenar por apellido (ascendente)");
            System.out.println("5. Ordenar por promedio (descendente)");
            System.out.println("6. Salir");
            System.out.print("Elegí una opción: ");

            opcion = teclado.nextLine().trim();

            switch (opcion) {
                case "1" -> System.out.println("Importar Excel: pendiente de integrar.");
                case "2" -> System.out.println("Mostrar alumnos: pendiente de integrar.");
                case "3" -> System.out.println("Ordenar por carnet: pendiente de integrar.");
                case "4" -> System.out.println("Ordenar por apellido: pendiente de integrar.");
                case "5" -> System.out.println("Ordenar por promedio: pendiente de integrar.");
                case "6" -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción inválida. Elige del 1 al 6.");
            }
        } while (!opcion.equals("6"));
        teclado.close();
    }
}