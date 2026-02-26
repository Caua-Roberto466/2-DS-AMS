package com.mycompany.exercicioum.exemplopessoa;

public class ExercicioUmExemploPessoa {

    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa();
        
        //Atribui valores
        novaPessoa.nome = "Carlos";
        novaPessoa.sexo = "Masculino";
        novaPessoa.pais = "Brasl";
        
        System.out.println("\nO nome dessa pesosa é: "+novaPessoa.nome + " seu sexo é: "+ novaPessoa.sexo + " e seu país é: "+ novaPessoa.pais);
        
        novaPessoa.pessoaAndar();
        novaPessoa.pessoaFala();
        novaPessoa.pessoaCorre();
        novaPessoa.pessoaEstuda();
        novaPessoa.pessoaBrinca();
    }
}
