package com.mycompany.exerciciometodos;

import java.util.Date;
public class Funcionario {
    String nome = "";
    Date data = new Date();
    double salario = 0;
    
    static void informarSalario(double salario){
        System.out.println("Meu salario e: " + salario);
    }
    static void informarIdade(Date data){
        Date dataAtual = new Date();
        int anoAtual = dataAtual.getYear();
        int nasc = data.getYear();
        int idade = anoAtual - nasc;
        System.out.println("Tenho " + " anos de idade");
    }
}
