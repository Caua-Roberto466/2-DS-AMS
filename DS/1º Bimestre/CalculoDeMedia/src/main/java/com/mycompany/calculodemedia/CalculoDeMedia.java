package com.mycompany.calculodemedia;

import javax.swing.JOptionPane;
public class CalculoDeMedia {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
        int nota1 = Integer.parseInt(lerNota());
        int nota2 = Integer.parseInt(lerNota());
        double mediaAluno = calcularMedia(nota1, nota2);
        if(mediaAluno >= 7){
            JOptionPane.showMessageDialog(null, "O aluno "+ nome+ " foi aprovado com a média"+ mediaAluno);
        }else{
            JOptionPane.showMessageDialog(null, "O aluno "+ nome+ " ficou com a média "+mediaAluno +" por isso foi reprovado");
        }
    }
    public static String lerNota(){
        return JOptionPane.showInputDialog(null, "Digite a nota:");
    }
    public static double calcularMedia(int n1, int n2){
        int soma = n1 + n2;
        double media = soma / 2;
        return media;
    }
}
