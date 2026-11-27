/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ufg.lab4.alumnos.base;

/**
 *
 * @author andresvides
 */
import java.util.ArrayList;
import java.util.Comparator;

public class Ordenamiento {

    public static <T> void selectionSort(ArrayList<T> lista, Comparator<T> comparador) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int seleccionado = i;

            for (int j = i + 1; j < lista.size(); j++) {
                if (comparador.compare(lista.get(j), lista.get(seleccionado)) < 0) {
                    seleccionado = j;
                }
            }

            if (seleccionado != i) {
                T temporal = lista.get(i);
                lista.set(i, lista.get(seleccionado));
                lista.set(seleccionado, temporal);
            }
        }
    }
}