package com.mycompany.exerciciometodos;

import javax.swing.JOptionPane;
public class ExercicioMetodos {

    public static void main(String[] args) {
        int t; //Declara a variável do tamanho
        String p; //Declara a variável da palavra digitada
        p = digitar(); //Aribui o dialogo para uma variável
        t = tamanho(p); //Atribui o valor de t com a função tamanho com o parâmetro sendo a palavra da variável p
        JOptionPane.showMessageDialog(null,p+"  possui "+t+" caracteres"); //exibe o tamanho da plavara na tela
    }
    static String digitar(){
        return JOptionPane.showInputDialog(null, "Digite uma palavra: "); //Retorna o JOptionPane como valor String da função
    }
    static int tamanho(String x){ //define a função que identifica o tamanho da string
        return x.length(); //retorna o tamanho da String
    }
}
