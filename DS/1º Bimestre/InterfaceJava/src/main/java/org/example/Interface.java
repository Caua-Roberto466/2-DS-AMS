package org.example;
import javax.swing.*;
import java.awt.*;
public class Interface extends JFrame {
    JLabel titulo, rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField nome, cpf, rg, endereco, cidade, estado, cep;
    public Interface(){
        super("Interface do usuário");
        Container tela = getContentPane();
        tela.setLayout(null);

        titulo = new JLabel("Cadastro de Cliente");
        titulo.setForeground(Color.red);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titulo.setBounds(100, 10, 200, 20);
        tela.add(titulo);
        tela.setBackground(Color.lightGray);

        //Rotulos
        rotulo1 = new JLabel("Nome:");
        rotulo2 = new JLabel("CPF:");
        rotulo3 = new JLabel("RG:");
        rotulo4 = new JLabel("Endereço:");
        rotulo5 = new JLabel("Cidade:");
        rotulo6 = new JLabel("Estado:");
        rotulo7 = new JLabel("CEP:");
        //Fontes
        rotulo1.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo2.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo3.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo4.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo5.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo6.setFont(new Font("Aria", Font.BOLD, 15));
        rotulo7.setFont(new Font("Aria", Font.BOLD, 15));
        //Coordenadas
        rotulo1.setBounds(20, 40, 60, 20);
        rotulo2.setBounds(20, 60, 60, 20);
        rotulo3.setBounds(20, 80, 60, 20);
        rotulo4.setBounds(20, 100, 80, 20);
        rotulo5.setBounds(20, 120, 60, 20);
        rotulo6.setBounds(20, 140, 60, 20);
        rotulo7.setBounds(20, 160, 60, 20);
        //Adicionando na tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);

        //Textos
        nome = new JTextField(100);
        cpf = new JTextField(12);
        rg = new JTextField(15);
        endereco = new JTextField(150);
        cidade = new JTextField(80);
        estado = new JTextField(2);
        cep = new JTextField(9);
        //Coordenadas
        nome.setBounds(70, 40, 90, 20);
        cpf.setBounds(57, 60, 60, 20);
        rg.setBounds(49, 80, 60, 20);
        endereco.setBounds(96, 100, 120, 20);
        cidade.setBounds(77, 120, 60, 20);
        estado.setBounds(75, 140, 60, 20);
        cep.setBounds(58, 160, 60, 20);
        //Adicionando na tela
        tela.add(nome);
        tela.add(cpf);
        tela.add(rg);
        tela.add(endereco);
        tela.add(cidade);
        tela.add(estado);
        tela.add(cep);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
