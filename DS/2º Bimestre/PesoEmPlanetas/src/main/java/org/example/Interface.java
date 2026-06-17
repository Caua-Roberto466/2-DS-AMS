package org.example;
import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {
    JLabel rtlPeso;
    JTextField txtPeso;
    JButton btnCalcular;
    JLabel rtlSelecione;
    JRadioButton mercurio, venus, marte, jupiter, saturno, urano;
    ButtonGroup grupo;

    public Interface(){
        super("Peso nos planetas");
        Container tela = getContentPane();
        tela.setLayout(null);

        //Instâncias
        rtlPeso = new JLabel("Peso na Terra (kg):");
        txtPeso = new JTextField(5);
        btnCalcular = new JButton("Calcular Peso");

        rtlSelecione = new JLabel("Selecione o Planeta:");
        mercurio = new JRadioButton("Mercúrio");
        venus = new JRadioButton("Vênus");
        marte = new JRadioButton("Marte");
        jupiter = new JRadioButton("Júpiter");
        saturno = new JRadioButton("Saturno");
        urano = new JRadioButton("Urano");

        grupo = new ButtonGroup();
        grupo.add(mercurio);
        grupo.add(venus);
        grupo.add(marte);
        grupo.add(jupiter);
        grupo.add(saturno);
        grupo.add(urano);

        //SetBounds
        rtlPeso.setBounds(20, 20, 120, 20);
        txtPeso.setBounds(150, 20, 80, 20);
        btnCalcular.setBounds(240, 20, 130, 20);

        rtlSelecione.setBounds(20, 60, 150, 20);

        mercurio.setBounds(20, 85, 100, 20);
        venus.setBounds(20, 110, 100, 20);
        marte.setBounds(140, 85, 100, 20);
        jupiter.setBounds(140, 110, 100, 20);
        saturno.setBounds(260, 85, 100, 20);
        urano.setBounds(260, 110, 100, 20);

        //Adicionando na tela
        tela.add(rtlPeso);
        tela.add(txtPeso);
        tela.add(btnCalcular);
        tela.add(rtlSelecione);
        tela.add(mercurio);
        tela.add(venus);
        tela.add(marte);
        tela.add(jupiter);
        tela.add(saturno);
        tela.add(urano);

        btnCalcular.addActionListener(e -> {
            double pesoTerra = Double.parseDouble(txtPeso.getText());
            double gravidade = 0;
            String planeta = "";

            if(mercurio.isSelected()){
                gravidade = 0.37;
                planeta = "Mercúrio";
            }else if(venus.isSelected()){
                gravidade = 0.88;
                planeta = "Vênus";
            }else if(marte.isSelected()){
                gravidade = 0.38;
                planeta = "Marte";
            }else if(jupiter.isSelected()){
                gravidade = 2.64;
                planeta = "Júpiter";
            }else if(saturno.isSelected()){
                gravidade = 1.15;
                planeta = "Saturno";
            }else if(urano.isSelected()){
                gravidade = 1.17;
                planeta = "Urano";
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um planeta!");
                return;
            }

            double pesoPlaneta = (pesoTerra / 10) * gravidade;
            JOptionPane.showMessageDialog(null, "O seu peso em " + planeta + " é: " + pesoPlaneta + " kg");
        });

        setVisible(true);
        setSize(400, 200);
        setLocationRelativeTo(null);
    }
}