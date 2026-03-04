package com.mycompany.pesoideal;

import javax.swing.JOptionPane;
public class PesoIdeal {

    public static void main(String[] args) {
        int sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu sexo biológico: ('1 - Masculino' ou '2 - Feminino')"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura:"));
        calcularPesoIdeal(sexo, altura);
    }
    public static void calcularPesoIdeal(int s, double h){
        if(s == 1){
            double pesoIdeal = (72.7 * h) - 58;
            JOptionPane.showMessageDialog(null, "O peso ideal para um homem da sua altura: "+h+" é: "+ pesoIdeal);
        }else if(s == 2){
            double pesoIdeal = (62.1 * h) - 44.7;
            JOptionPane.showMessageDialog(null, "O peso ideal para uma mulheré da sua altura: "+h+" é: "+ pesoIdeal);
        }else{
            JOptionPane.showMessageDialog(null, "Sexo inválido");
        }
    }
}
