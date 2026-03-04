package com.mycompany.diferencadereais;

import javax.swing.JOptionPane;
public class DiferencaDeReais {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite primeiro número real"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite segundo número real"));
        diferenca(numero1, numero2);
    }
    public static void diferenca(double n1, double n2){
        if(n1 > n2){
            double dif = n1 - n2;
            JOptionPane.showMessageDialog(null, "A diferença do maior: "+n1+" para o menor: "+n2+" é "+ dif);
        }else{
            double dif = n2 - n1;
            JOptionPane.showMessageDialog(null, "A diferença do maior: "+n2+" para o menor: "+n1+" é "+ dif);        
        }
    }
}
