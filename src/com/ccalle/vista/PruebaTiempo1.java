/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.vista;

import com.ccalle.modelo.Tiempo1;
import javax.swing.JOptionPane;

/**
 *
 * @author Cr
 */
public class PruebaTiempo1 {
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();
        String salida = "La hora universal inicial es:" +
                tiempo.aStringUniversal() + "\nLa hora estandar inicial es" +
                tiempo.aStringEstandar();
        tiempo.establecerHora(13, 27, 6);
        salida += "\n\nLa hora universal despues de establecerHora es:" +
                tiempo.aStringUniversal() +
                "\nLa hora estandar despues de establecerHora es: " +
                tiempo.aStringEstandar();
        tiempo.establecerHora(99, 99, 99);
        salida += "\n\nDespues de intentar ajustes invalidos: "+
                "\nHora universal: " +tiempo.aStringUniversal() +
                "\nHora estandar: " +tiempo.aStringEstandar();
        JOptionPane.showMessageDialog(null, salida,"Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
                
    }
}
