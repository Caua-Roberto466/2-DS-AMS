package org.example;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {
    JLabel rtlLado1, rtlLado2, rtlLado3, rtlTriangulo;
    JTextField txtLado1, txtLado2, txtLado3;
    JButton btnVerificar;
    public Interface(){
        super("Tipo de triângulo");
        Container tela = getContentPane();
        tela.setLayout(null);

        //Instâncias
        rtlLado1 = new JLabel("Lado 1:");
        rtlLado2 = new JLabel("Lado 2:");
        rtlLado3 = new JLabel("Lado 3:");
        rtlTriangulo = new JLabel("");

        txtLado1 = new JTextField(3);
        txtLado2 = new JTextField(3);
        txtLado3 = new JTextField(3);

        btnVerificar = new JButton("Verificar tipo");

        //Design
        //SetBounds
        rtlLado1.setBounds(20, 20, 60, 20);
        txtLado1.setBounds(90, 20, 80, 20);

        rtlLado2.setBounds(20, 55, 60, 20);
        txtLado2.setBounds(90, 55, 80, 20);

        rtlLado3.setBounds(20, 90, 60, 20);
        txtLado3.setBounds(90, 90, 80, 20);

        btnVerificar.setBounds(20, 130, 150, 20);

        rtlTriangulo.setBounds(220, 70, 150, 25);

        //Adicionando componentes ao container
        tela.add(rtlLado1);
        tela.add(txtLado1);
        tela.add(rtlLado2);
        tela.add(txtLado2);
        tela.add(rtlLado3);
        tela.add(txtLado3);
        tela.add(btnVerificar);
        tela.add(rtlTriangulo);

        btnVerificar.addActionListener(e -> {
            double lado1 = Double.parseDouble(txtLado1.getText());
            double lado2 = Double.parseDouble(txtLado2.getText());
            double lado3 = Double.parseDouble(txtLado3.getText());

            if(lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado1 + lado3 < lado2){
                rtlTriangulo.setText("Valores inválidos");
            }else{
                if (lado1 == lado2 && lado1 == lado3){
                    rtlTriangulo.setText("Triângulo Equilátero");
                }else if (lado1 != lado2 && lado2 != lado3 && lado2 !=lado3){
                    rtlTriangulo.setText("Triângulo Escaleno");
                }else{
                    rtlTriangulo.setText("Triângulo Isóceles");
                }
            }

            txtLado1.setText("");
            txtLado1.requestFocus();
            txtLado2.setText("");
            txtLado3.setText("");


        });

        setVisible(true);
        setSize(370, 230);
        setLocationRelativeTo(null);
    }
}
