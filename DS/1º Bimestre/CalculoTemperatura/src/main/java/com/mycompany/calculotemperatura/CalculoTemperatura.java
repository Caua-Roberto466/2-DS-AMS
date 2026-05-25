package com.mycompany.calculotemperatura;

import javax.swing.JOptionPane;
public class CalculoTemperatura {

    public static void main(String[] args) {
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o que deseja fazer:"
                + "\n1 - Fahrenheit para Celcius"
                + "\n2 - Kelvin para Celsius"));
        
        switch(escolha){
            case 1:
                double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit:"));
                double celsius = converterFahrenheit(fahrenheit);
                JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + celsius);
                break;
            case 2:
                double kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Kelvin:"));
                double tempCel = converterKelvin(kelvin);
                JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + tempCel);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
    public static double converterFahrenheit(double fah){
        double cel = (fah - 32) * 5/9;
        return cel;
    }
    public static double converterKelvin(double kel){
        double cel = kel - 273.15;
        return cel;
    }
}
