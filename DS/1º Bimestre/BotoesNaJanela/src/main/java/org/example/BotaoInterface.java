package org.example;

import javax.swing.*;
import java.awt.*;
public class BotaoInterface extends JFrame{
    JButton botao1, botao2, botao3;
    ImageIcon icone;
    public BotaoInterface(){
        super("Interface com botão");
        Container tela = getContentPane();
        tela.setLayout(null);

        //Primeiro botão
        botao1 = new JButton("Procurar");
        botao1.setBounds(80, 20, 120, 20);
        tela.add(botao1);

        //Segundo botão
        icone = new ImageIcon("pasta.png");
        botao2 = new JButton("Abrir",icone);
        botao2.setBounds(80, 70, 120, 20);
        tela.add(botao2);

        //Terceiro Botão
        botao3 = new JButton(icone);
        botao3.setBounds(80, 120, 120, 20);
        tela.add(botao3);

        setSize(300,200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
