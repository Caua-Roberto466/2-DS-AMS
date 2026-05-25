package com.mycompany.teoremapitagoras;

import javax.swing.JOptionPane;
public class TeoremaPitagoras {

    public static void main(String[] args) {
        double cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto 1:"));
        double cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto 2:"));
        double hipotenusa = calcularPitagoras(cateto1, cateto2);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
    }
    public static double calcularPitagoras(double a, double b){
        double hipoQ = Math.pow(a, 2) + Math.pow(b, 2);
        double hipo = Math.sqrt(hipoQ);
        return hipo;
    }
}
