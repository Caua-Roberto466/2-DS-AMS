package com.mycompany.exerciciometodosint;

import javax.swing.JOptionPane;
public class ExercicioMetodosInt {

    public static void main(String[] args) {
        int a; //Cria a variável que vai receber o número
        a = Integer.parseInt(digitar()); //Atribui a função digitar() em uma variável convertida para int
        dobrar(a); //Chama a função dobrar() com a variável 'a' sendo um prâmetro
    }
    static String digitar(){ //Cria a função digitar() como uma String
        return JOptionPane.showInputDialog(null, "Digite um número: "); //Retorna JOptionPane como valor String
    }
    static void dobrar(int n){ //Cria a função que vai dobrar o valor, sendo o valor dobrado um parâmetro
        int d = n * 2; //faz a conta que vai dobrar o valor da variável
        JOptionPane.showMessageDialog(null, "O dobro de " + n + " é " + d); //Exibe uma mensagem falando quanto é o dobro do número
    }
}
