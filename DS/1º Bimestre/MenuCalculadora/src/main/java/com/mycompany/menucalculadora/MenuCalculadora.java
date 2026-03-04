package com.mycompany.menucalculadora;

import javax.swing.JOptionPane;
public class MenuCalculadora {

    public static void main(String[] args) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Faça sua escolha: "
                + "\n1 - Soma "
                + "\n2 - Subtração "
                + "\n3 - Divisão"
                + "\n4 - Multiplicação"
                + "\n5 - Resto da divisão"
                + "\n6 - Dobro"
                + "\n7 - Quadrado"
                + "\n8 - Cubo"
                + "\n9 - Raiz quadrada"
                + "\n0 - Sair"
        ));
        
        switch(escolha){
            case 1:
                double soma = soma();
                JOptionPane.showMessageDialog(null, "A soma é: "+soma);
                break;
            case 2:
                double subtracao = subtracao();
                JOptionPane.showMessageDialog(null, "A subtração é: "+subtracao);
                break;
            case 3:
                double divisao = divisao();
                JOptionPane.showMessageDialog(null, "A divsão é: "+divisao);
                break;
            case 4:
                double multiplicacao = multiplicacao();
                JOptionPane.showMessageDialog(null, "A multiplicação é: "+ multiplicacao);
                break;
            case 5:
                double resto = restoDiv();
                JOptionPane.showMessageDialog(null, "O resto da divisção é: "+ resto);
                break;
            case 6:
                double dobro = dobro();
                JOptionPane.showMessageDialog(null, "O dobro do número é: "+ dobro);
                break;
            case 7:
                double quadrado = quadrado();
                JOptionPane.showMessageDialog(null, "O número elevado ao quadrado é: "+ quadrado);
                break;
            case 8:
                double cubo = cubo();
                JOptionPane.showMessageDialog(null, "O número elevado ao cubo é: "+ cubo);
                break;
            case 9:
                double raizQuadrada = raizQuadrada();
                JOptionPane.showMessageDialog(null, "O a raiz quadrada do número é: "+ raizQuadrada);
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Programa encerrado. Adeus");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
    public static double soma(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        double soma = n1 + n2;
        return soma;
    }
    public static double subtracao(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        double sub = n1 - n2;
        return sub;
    }
    public static double divisao(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        double div = n1 / n2;
        return div;
    }
    public static double multiplicacao(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        double mult = n1 * n2;
        return mult;
    }
    public static double restoDiv(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
        double rest = n1 % n2;
        return rest;
    }
    public static double dobro(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número a ser dobrado"));
        double dobro = n1 * 2;
        return dobro;
    }
    public static double quadrado(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para ser elevado ao quadrado"));
        double quadrado = Math.pow(n1, 2);
        return quadrado;
    }
    public static double cubo(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para ser elevado ao cubo"));
        double cubo = Math.pow(n1, 3);
        return cubo;
    }
    public static double raizQuadrada(){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para saber sua raiz quadrada"));
        double raizQuadrada = Math.sqrt(n1);
        return raizQuadrada;
    }
}
