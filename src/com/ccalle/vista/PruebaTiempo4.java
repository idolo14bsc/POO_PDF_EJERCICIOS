/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.vista;

import com.ccalle.modelo.Tiempo3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Cristian Calle
 */
public class PruebaTiempo4  extends JApplet implements ActionListener{
    private Tiempo3 tiempo;
    
    private JLabel horaEtiqueta, minutoEtiqueta, segundoEtiqueta;
    private JTextField horaCampo,minutoCampo, segundoCampo, pantallaCampo;
    private JButton ticBoton;
    
    public void init(){
        tiempo = new Tiempo3();
        Container contenedor =getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        horaEtiqueta = new JLabel("Establecer hora");
        horaCampo= new JTextField(10);
        contenedor.add(horaEtiqueta);
        contenedor.add(horaCampo);
        
        minutoEtiqueta = new JLabel("Establecer minuto");
        minutoCampo= new JTextField(10);
        contenedor.add(minutoEtiqueta);
        contenedor.add(minutoCampo);
        
        segundoEtiqueta = new JLabel("Establecer segundo");
        segundoCampo= new JTextField(10);
        contenedor.add(segundoEtiqueta);
        contenedor.add(segundoCampo);

        pantallaCampo = new JTextField(30);
        pantallaCampo.setEditable(false);
        contenedor.add(pantallaCampo);
        
        ticBoton = new JButton("Agregar 1 a Segundo");
        contenedor.add(ticBoton);
        
        horaCampo.addActionListener(this);
        minutoCampo.addActionListener(this);
        segundoCampo.addActionListener(this);
        ticBoton.addActionListener(this);
        
        mostrarHora();
    }
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == ticBoton)
            tic();
        else if(evento.getSource() == horaCampo) {
            tiempo.establecerHora(Integer.parseInt(evento.getActionCommand()));
            horaCampo.setText("");
        }
        else if(evento.getSource() == minutoCampo) {
            tiempo.establecerMinuto(Integer.parseInt(evento.getActionCommand()));
            minutoCampo.setText("");
        }
        else if(evento.getSource() == segundoCampo) {
            tiempo.establecerSegundo(Integer.parseInt(evento.getActionCommand()));
            segundoCampo.setText("");
        }  
        mostrarHora();
    }
    
    public void mostrarHora(){
        pantallaCampo.setText("Hora: " + tiempo.obtenerHora() + "; Minuto: " +
                tiempo.obtenerMinuto() + "; Segundo: " +tiempo.obtenerSegundo());
        
        showStatus("La hora estandar es: "+ tiempo.aStringEstandar() + 
                "; la hora universal es:"+ tiempo.aStringUniversal());
    }
    
    public void tic(){
        tiempo.establecerSegundo((tiempo.obtenerSegundo() +1) %60);
        
        if(tiempo.obtenerSegundo() == 0) {
            tiempo.establecerMinuto((tiempo.obtenerMinuto()+1) %60);
            
            if(tiempo.obtenerMinuto()==0) 
                tiempo.establecerHora((tiempo.obtenerHora()+1 )%24);
            
        }
    }
}
