import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
    JLabel rtlTitulo, rtlResumo;
    JButton btnCadastrar, btnFechar;
    public Inicio(){
        super("Cadastro de Cliente");
        setLayout(null);
        Container tela = getContentPane();

        rtlTitulo = new JLabel("Cadastro de cliente");
        rtlResumo = new JLabel("Com nosso sistema você tem sabe que são seus clientes");

        btnCadastrar = new JButton("Cadastrar");
        btnFechar = new JButton("Fechar");

        //SetBounds
        rtlTitulo.setBounds(20, 20, 360, 30);
        rtlResumo.setBounds(20, 60, 340, 50);

        btnCadastrar.setBounds(50, 160, 130, 40);
        btnFechar.setBounds(200, 160, 130, 40);

        rtlTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        rtlResumo.setFont(new Font("Arial", Font.PLAIN, 12));

        //Botão de Cadastrar
        btnCadastrar.addActionListener(e ->{
            Interface cadastro = new Interface();
            cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cadastro.setVisible(true);
            setVisible(false);
            dispose();
        });

        //Botão de fechar
        btnFechar.addActionListener(e -> {
            int status = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar o programa?"
            ,"Mensagem de Saída", JOptionPane.YES_NO_OPTION);

            if (status == JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        });

        //Adicionando na tela
        tela.add(rtlTitulo);
        tela.add(rtlResumo);
        tela.add(btnCadastrar);
        tela.add(btnFechar);

        setLocationRelativeTo(null);
        setVisible(true);
        setSize(400, 300);
    }
}
