package com.mycompany.hipotenusa;

import javax.swing.JOptionPane;
public class Hipotenusa {

    public static void main(String[] args) {
        System.out.println("Hipotenusa!");
        
        double base = Double.parseDouble(digitar());
        double altura = Double.parseDouble(digitar());
        
        double hipotenusa = calcularHipotenusa(base, altura);
        
        JOptionPane.showMessageDialog(null, "A hitenusa de "+ base + " com "+ altura+ " é "+hipotenusa);
    }
    static double calcularHipotenusa(double b, double a){
        double qb = Math.pow(b, 2);
        double qa = Math.pow(a, 2);
        double qhipo = qa + qb;
        double hipo = Math.sqrt(qhipo);
        
        return hipo;
    }
    static String digitar(){
        return JOptionPane.showInputDialog(null, "Digite o número: ");
    }
}
