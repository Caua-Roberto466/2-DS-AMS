/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocarro;

/**
 *
 * @author Babaloo
 */
public class ExemploCarro {

    public static void main(String[] args) {
        //Criando o objeto
        Carro umCarro = new Carro();
        
        //Definindo os atributos
        umCarro.modelo = "Gol";
        umCarro.cor = "Preto";
        umCarro.motor = "1.0";
        
        //Exibindo valores
        System.out.println("Modelo do carro: " + umCarro.modelo + " Cor do carro: " + umCarro.cor + " Motor do carro: " + umCarro.motor);
        
        //Chamando métodos
        umCarro.ligar();
        umCarro.desligar();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.mudarMarcha();
        
        umCarro = null;
    }
}
