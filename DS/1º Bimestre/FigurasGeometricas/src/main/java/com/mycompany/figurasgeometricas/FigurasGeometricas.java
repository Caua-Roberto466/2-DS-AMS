package com.mycompany.figurasgeometricas;

import javax.swing.JOptionPane;
public class FigurasGeometricas {

    public static void main(String[] args) {
        
        Figura figura = new Figura();
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha sua figura"
                + "\n1 - Quadrado"
                + "\n2 - Círculo"
                + "\n3 - Retângulo"));
        
        if(escolha == 1){
            figura.valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor dos lados do quadrado"));
            double areaQuadrado = figura.calcularQuadrado(figura.valor1);
            JOptionPane.showMessageDialog(null, "A área do quadrado é "+areaQuadrado);
        }else if(escolha == 2){
            figura.valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio do círculo"));
            double areaCirculo = figura.calcularCirculo(figura.valor1);
            JOptionPane.showMessageDialog(null, "A área do círculo é "+areaCirculo);
        }else if(escolha == 3){
            figura.valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do retângulo"));
            figura.valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do retângulo"));
            double areaRetangulo = figura.calcularRetangulo(figura.valor1, figura.valor2);
            JOptionPane.showMessageDialog(null, "A área do retângulo é "+areaRetangulo);
        }
    }
}
