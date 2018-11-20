/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.vista;

import com.ccalle.modelo.Tiempo2;
import javax.swing.*;


/**
 *
 * @author Cristian Calle
 */
public class PruebaTiempo3 {
    public static void main(String[] args) {
        
    
    Tiempo2 t1 = new Tiempo2();
    Tiempo2 t2 = new Tiempo2(2);
    Tiempo2 t3 = new Tiempo2(21,34);
    Tiempo2 t4 = new Tiempo2(12,25,42);
    Tiempo2 t5 = new Tiempo2(27,74,99);
    Tiempo2 t6 = new Tiempo2(t4);
    
    String salida = "Se construyo con:" + 
            "\nt1: Todos los argumentos predeterminados" +
            "\n     " + t1.aStringUniversal()+
            "\n     " + t1.aStringEstandar();
    
    salida = "Se construyo con:" + 
            "\nt2: Se especifico hora; minuto y segundo predeterminados" +
            "\n     " + t2.aStringUniversal()+
            "\n     " + t2.aStringEstandar();
    
    salida = "Se construyo con:" + 
            "\nt1: Se especifico hora y minuto; segundo predeterminados" +
            "\n     " + t3.aStringUniversal()+
            "\n     " + t3.aStringEstandar();
    
    salida = "Se construyo con:" + 
            "\nt1: Se especifico horay minuto y segundo " +
            "\n     " + t4.aStringUniversal()+
            "\n     " + t4.aStringEstandar(); 
    
    salida = "Se construyo con:" + 
            "\nt1: Se especifico todos los valores invalidos" +
            "\n     " + t5.aStringUniversal()+
            "\n     " + t5.aStringEstandar();    
    
    salida = "Se construyo con:" + 
            "\nt1: Se especifico objeto t4 de la clase Tiempo2" +
            "\n     " + t6.aStringUniversal()+
            "\n     " + t6.aStringEstandar();    
    
    JOptionPane.showMessageDialog(null, salida,"Constructores sobrecargados",JOptionPane.INFORMATION_MESSAGE );
    
    System.exit(0);
    }
    
}
