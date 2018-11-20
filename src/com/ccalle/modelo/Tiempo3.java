/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.modelo;
import java.text.DecimalFormat;
/**
 *
 * @author Cristian Calle
 */
public class Tiempo3 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo3() {
        this(0, 0, 0);
    }
     public Tiempo3(int h){
        this(h, 0, 0);
    }
    public Tiempo3(int h, int m){
        this(h, m, 0);
    }
    public Tiempo3(int h,int m,int s){
        establecerHora(h,m,s);
        
    } 
    public Tiempo3(Tiempo3 tiempo){
        this(tiempo.obtenerHora(), tiempo.obtenerMinuto(),tiempo.obtenerSegundo());
    }    
    public void establecerHora(int h,int m, int s){
            establecerHora(h);
            establecerMinuto(m);
            establecerSegundo(s);
    }
    public void establecerHora(int h){
        hora = ((h >=0 && h <24) ? h : 0);

    }    
    public void establecerMinuto(int m){
        minuto = ((m >=0 && m <60) ? m : 0);

    }        
    public void establecerSegundo(int s){
        segundo = ((s >=0 && s <60) ? s : 0);

    }        
    
    public int obtenerHora(){
        return hora;
    }
    public int obtenerMinuto(){
        return minuto;
    }    
    public int obtenerSegundo(){
        return segundo;
    }
    
   public String aStringUniversal() {
       DecimalFormat dosDigitos = new DecimalFormat("00");
       return dosDigitos.format(obtenerHora()) + ":" +
               dosDigitos.format(obtenerMinuto()) + ":" +dosDigitos.format(obtenerSegundo());
   }
   public String aStringEstandar() {
       DecimalFormat dosDigitos = new DecimalFormat("00");
       return ((obtenerHora() == 12 || obtenerHora() == 0)? 12: hora %12) +":" + 
               dosDigitos.format(obtenerMinuto()) +":"+ dosDigitos.format(obtenerSegundo()) +
               (obtenerHora() <12 ? "AM " : "PM");
   }    
    
}
