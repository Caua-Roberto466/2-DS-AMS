package com.mycompany.testelampada;

import javax.swing.JOptionPane;
public class Lampada {
    String estadoDaLampada = "apagado";
    
    public static void apagar(String estado){
        estado = "apagado";
        JOptionPane.showMessageDialog(null, "A luz foi apagada");
    }
    public static void acender(String estado){
        estado = "aceso";
        JOptionPane.showMessageDialog(null, "A luz foi acesa");
    }
    public static void mostrarEstado(String estado){
        JOptionPane.showMessageDialog(null, "A lus está " + estado);
    }
}
