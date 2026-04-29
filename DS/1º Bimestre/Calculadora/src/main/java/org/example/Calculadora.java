package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField numero1, numero2;
    JButton somar, sub, multi, div, raiz;

    public Calculadora(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);

        //Rotulos
        rotulo1 = new JLabel("1º Número");
        rotulo2 = new JLabel("2º Número");
        exibir = new JLabel("");

        rotulo1.setBounds(50, 20, 80, 20);
        rotulo2.setBounds(50, 60, 80, 20);
        exibir.setBounds(100, 200, 100, 20);


        //Campos de textos
        numero1 = new JTextField(6);
        numero2 = new JTextField(6);

        numero1.setBounds(50, 40, 300, 20);
        numero2.setBounds(50, 80, 300, 20);

        //Botoões
        somar = new JButton("Somar");
        sub = new JButton("Subtrair");
        multi = new JButton("Multiplicar");
        div = new JButton("Dividir");
        raiz = new JButton("Raiz Quadrada");

        somar.setBounds(30, 120, 70, 20);
        sub.setBounds(120, 120, 100, 20);
        multi.setBounds(270, 120, 100, 20);
        div.setBounds(390, 120, 100, 20);
        raiz.setBounds(300, 150, 70, 20);

        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int soma;
                        int num1 = Integer.parseInt(numero1.getText());
                        int num2 = Integer.parseInt(numero2.getText());
                        soma = num1 + num2;
                        exibir.setText("A soma é: "+soma);
                    }
                }
        );
        sub.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int sub;
                        int num1 = Integer.parseInt(numero1.getText());
                        int num2 = Integer.parseInt(numero2.getText());
                        sub = num1 - num2;
                        exibir.setText("A subtração é: "+sub);
                    }
                }
        );
        multi.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int mul;
                        int num1 = Integer.parseInt(numero1.getText());
                        int num2 = Integer.parseInt(numero2.getText());
                        mul = num1 * num2;
                        exibir.setText("A multiplicação é: "+mul);
                    }
                }
        );
        div.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int div;
                        int num1 = Integer.parseInt(numero1.getText());
                        int num2 = Integer.parseInt(numero2.getText());
                        div = num1 / num2;
                        exibir.setText("A divisão é: "+div);
                    }
                }
        );
        raiz.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int soma;
                        int num1 = Integer.parseInt(numero1.getText());
                        int num2 = Integer.parseInt(numero2.getText());
                        soma = num1 + num2;
                        double raiz = Math.sqrt(soma);
                        exibir.setText("A soma é: "+raiz);
                    }
                }
        );

        //Adicionando
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);

        tela.add(numero1);
        tela.add(numero2);

        tela.add(somar);
        tela.add(sub);
        tela.add(multi);
        tela.add(div);
        tela.add(raiz);

        setSize(600, 370);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
