/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamaintsoft;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NICO
 */
public class Pruebamaintsoft {

   static double[] denominaciones = {0.05, 0.1, 0.2, 0.5, 1.2, 5, 10, 20, 50, 100, 200};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double entrada = 0.1;
        ArrayList<Double> salida = new ArrayList<>();
        build(entrada, salida, 0.0);
    }
    public static void build(double entrada, ArrayList<Double> salidas, double suma) {

        if (suma == entrada) {
            System.out.println("Lista de combinaciones: " + salidas);
        } else {
            
            for (double i : denominaciones) {
                suma += i;
                if (suma <= entrada) {
                    salidas.add(i);
                    build(entrada, salidas, suma);
                    salidas.remove(salidas.indexOf(i));
                }
                suma -= i;
            }
        }
    }
}
