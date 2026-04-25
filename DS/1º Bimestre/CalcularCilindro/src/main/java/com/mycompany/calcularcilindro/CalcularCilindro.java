package com.mycompany.calcularcilindro;

import javax.swing.JOptionPane;
public class CalcularCilindro {

    public static void main(String[] args) {
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Cilindro:"));
       double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do Cilindro:"));
       
       double area = calcularArea(raio, altura);
       double volume = calcularVolume(raio, altura);
       
       JOptionPane.showMessageDialog(null, "O volume é: "+ volume +"cm³ e a área é: "+ area+"cm²");
    }
    public static double calcularArea(double r, double a){
        double area = 2 * Math.PI * r * a;
        return area;
    }
    public static double calcularVolume(double r, double a){
        double rQ = Math.pow(r, 2);
        double volume = Math.PI * rQ * a;
        return volume;
    }
}
