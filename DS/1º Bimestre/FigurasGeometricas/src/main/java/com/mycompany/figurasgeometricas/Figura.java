package com.mycompany.figurasgeometricas;

public class Figura {
    double valor1;
    double valor2;
    
    static double calcularCirculo(double raio){
        double pi = Math.PI;
        double raioQuadrado = Math.pow(raio, 2);
        return pi * raioQuadrado;
    }
    static double calcularQuadrado(double lado){
        return lado * lado;
    }
    static double calcularRetangulo(double base, double altura){
        return base * altura;
    }
}
