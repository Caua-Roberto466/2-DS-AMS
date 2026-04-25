package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InterfaceDaSenha extends JFrame {
    JPasswordField senha;
    JLabel rotulo;
    public InterfaceDaSenha(){
        super("Interface com senha");
        Container tela = getContentPane();
        setLayout(null);

        rotulo = new JLabel("Senha: ");
        senha = new JPasswordField(10);

        rotulo.setBounds(30, 40, 60,20);
        senha.setBounds(30, 80, 120, 30);

        tela.add(rotulo);
        tela.add(senha);

        setSize(300, 200);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
