package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField numero1, numero2;
    JButton somar, sub, multi, div, raiz;
    ImageIcon isoma, isub, imulti, idiv, iraiz;

    public Calculadora(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);

        //Imagens
        isoma = new ImageIcon("soma.png");
        isub = new ImageIcon("subtracao.png");
        imulti = new ImageIcon("multi.png");
        idiv = new ImageIcon("divi.png");
        iraiz = new ImageIcon("raiz.png");

        //Rotulos
        rotulo1 = new JLabel("1º Número");
        rotulo2 = new JLabel("2º Número");
        exibir = new JLabel("");

        rotulo1.setBounds(50, 20, 80, 20);
        rotulo2.setBounds(50, 60, 80, 20);
        exibir.setBounds(50, 200, 300, 20);

        exibir.setFont(exibir.getFont().deriveFont(24f));

        //Campos de textos
        numero1 = new JTextField(6);
        numero2 = new JTextField(6);

        numero1.setBounds(50, 40, 300, 20);
        numero2.setBounds(50, 80, 300, 20);

        //Botoões
        somar = new JButton(isoma);
        sub = new JButton(isub);
        multi = new JButton(imulti);
        div = new JButton(idiv);
        raiz = new JButton(iraiz);

        somar.setBounds(59, 120, 40, 40);
        sub.setBounds(119, 120, 40, 40);
        multi.setBounds(179, 120, 40, 40);
        div.setBounds(239, 120, 40, 40);
        raiz.setBounds(299, 120, 40, 40);

        somar.setBackground(new Color(46, 165, 220));
        sub.setBackground(new Color(46, 165, 220));
        multi.setBackground(new Color(46, 220, 220));
        div.setBackground(new Color(46, 220, 220));
        raiz.setBackground(new Color(46, 220, 148));

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
                        exibir.setText("A raiz quadrada é: "+raiz);
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

        setSize(400, 280);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
