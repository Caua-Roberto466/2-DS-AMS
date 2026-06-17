package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Interface extends JFrame {
    JLabel titulo;
    JRadioButton pedra, papel, tesoura;
    ButtonGroup grupo;
    JButton jogar;
    public Interface(){
        super("Pedra, papel, tesoura");
        Container tela = getContentPane();
        tela.setLayout(null);

        titulo = new JLabel("Pedra, papel ou tesoura?");

        pedra = new JRadioButton("Pedra");
        papel = new JRadioButton("Papel");
        tesoura = new JRadioButton("Tesoura");

        grupo = new ButtonGroup();
        grupo.add(pedra);
        grupo.add(papel);
        grupo.add(tesoura);

        jogar = new JButton("Jogar");

        jogar.addActionListener(e -> {
            int player = -1;
            String mensagem = "";

            if(pedra.isSelected()){
                player = 0;
            }else if(papel.isSelected()){
                player = 1;
            }else if(tesoura.isSelected()){
                player = 2;
            }

            int mac = escolhaMac(0, 2);

            if(player == 0 && mac == 0){
                mensagem = "Você jogou pedra e eu pedra, empate";
            }else if(player == 0 && mac == 1){
                mensagem = "Você jogou pedra e eu papel, eu ganhei";
            }else if(player == 0 && mac == 2){
                mensagem = "Você jogou pedra e eu tesoura, você ganhou";
            }else if(player == 1 && mac == 0){
                mensagem = "Você jogou papel e eu pedra, você ganhou";
            }else if(player == 1 && mac == 1){
                mensagem = "Você jogou papel e eu papel, empate";
            }else if(player == 1 && mac == 2){
                mensagem = "Você jogou papel e eu tesoura, eu ganhei";
            }else if(player == 2 && mac == 0){
                mensagem = "Você jogou tesoura e eu pedra, eu ganhei";
            }else if(player == 2 && mac == 1){
                mensagem = "Você jogou tesoura e eu papel, você ganhou";
            }else if(player == 2 && mac == 2){
                mensagem = "Você jogou tesoura e eu tesoura, empate";
            }else{
                mensagem = "Selecione uma opção antes de jogar!";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        });

        titulo.setBounds(20, 10, 200, 20);
        pedra.setBounds(20, 35, 100, 20);
        papel.setBounds(20, 60, 100, 20);
        tesoura.setBounds(20, 85, 100, 20);
        jogar.setBounds(20, 115, 160, 20);

        //Adicionando componentes ao container
        tela.add(titulo);
        tela.add(pedra);
        tela.add(papel);
        tela.add(tesoura);
        tela.add(jogar);

        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
    }
    public static int escolhaMac(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
