import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Interface extends JFrame {
    JLabel rtlCodigo, rtlNome, rtlEndereco, rtlBairro, rtlCidade, rtlEstado, rtlCep, rtlSexo, rtlCelular, rtlTelefone, rtlAniversario, rtlDataCadastro;
    JFormattedTextField ftfCodigo, ftfCep, ftfCelular, ftfTelefone, ftfAniversario, ftfDataCadastro;
    MaskFormatter mscCodigo,  mscCep, mscCelular, mscTelefone, mscAniversario, mscDataCadastro;
    JTextField txtNome, txtEndereco, txtBairro, txtCidade;
    JComboBox cbxEstados;
    String[] estados = {"Acre", "Amapá", "Amazonas", "Pará", "Rondônia", "Roraima", "Tocantins", "Alagoas", "Bahia", "Ceará", "Maranhão", "Paraíba", "Pernambuco", "Piauí", "Rio Grande do Norte", "Sergipe", "Distrito Federal", "Goiás", "Mato Grosso", "Mato Grosso do Sul", "Espírito Santo", "Minas Gerais", "São Paulo", "Rio de Janeiro" +
            "Rio Grande do Sul", "Paraná", "Santa Catarina"};
    ImageIcon iconCadastrar, iconLimpar, iconFechar;
    JRadioButton rbtnMasculino, rbtnFeminino;
    ButtonGroup sexo;
    JButton btnCadastrar, btnFechar, btnLimpar;

    public Interface(){
        //Inicialização da tela
        super("Cadastre o cliente");
        Container tela = getContentPane();
        setLayout(null);

        //Instãncias
        //JLabels
        rtlCodigo = new JLabel("Código do cliente:");
        rtlNome = new JLabel("Nome Completo:");
        rtlEndereco = new JLabel("Endereço:");
        rtlBairro = new JLabel("Bairro:");
        rtlCidade = new JLabel("Cidade:");
        rtlEstado = new JLabel("Estado:");
        rtlCep = new JLabel("CEP:");
        rtlSexo = new JLabel("Sexo:");
        rtlCelular = new JLabel("Celular:");
        rtlTelefone = new JLabel("Telefone");
        rtlAniversario = new JLabel("Data do Aniversário:");
        rtlDataCadastro = new JLabel("Data do Cadastro");

        //Textos padrões
        txtNome = new JTextField("Nome Completo");
        txtEndereco = new JTextField("Nome da Rua");
        txtBairro = new JTextField("Nome do Bairro");
        txtCidade = new JTextField("Nome da Cidade");

        //placeholder dos textos padrões
        txtNome.setForeground(Color.GRAY);
        txtEndereco.setForeground(Color.GRAY);
        txtBairro.setForeground(Color.GRAY);
        txtCidade.setForeground(Color.GRAY);


        txtNome.addFocusListener(new FocusListener() { //Adiciona um evento quando o campo é selecionado ou quando ele sai do foco
            @Override //Vai sobrescrever o original
            public void focusGained(FocusEvent focusEvent) { //Cria a função para quando ele for selecionado
                if (txtNome.getText().equals("Nome Completo")) { //Se o texto do campo for igual ao que ele foi setano na instância
                    txtNome.setText(""); //define o texto como vazio
                    txtNome.setForeground(Color.BLACK); //Muda a cor para preto
                }
            }
            @Override
            public void focusLost(FocusEvent focusEvent) { //Cria a função quando ele sai de foco
                if (txtNome.getText().isEmpty()){ //Se o campo estiver vazio
                    txtNome.setText("Nome Completo"); //ele define o texto como padrão da instância
                    txtNome.setForeground(Color.GRAY); //muda a cor para cinza
                }
            }
        });

        txtEndereco.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (txtEndereco.getText().equals("Nome da Rua")) {
                    txtEndereco.setText("");
                    txtEndereco.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent focusEvent) {
                if (txtEndereco.getText().isEmpty()){
                    txtEndereco.setText("Nome da Rua");
                    txtEndereco.setForeground(Color.GRAY);
                }
            }
        });

        txtBairro.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (txtBairro.getText().equals("Nome do Bairro")) {
                    txtBairro.setText("");
                    txtBairro.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent focusEvent) {
                if (txtBairro.getText().isEmpty()){
                    txtBairro.setText("Nome do Bairro");
                    txtBairro.setForeground(Color.GRAY);
                }
            }
        });

        txtCidade.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (txtCidade.getText().equals("Nome da Cidade")) {
                    txtCidade.setText("");
                    txtCidade.setForeground(Color.BLACK);
                }
            }
            @Override
            public void focusLost(FocusEvent focusEvent) {
                if (txtCidade.getText().isEmpty()){
                    txtCidade.setText("Nome do Bairro");
                    txtCidade.setForeground(Color.GRAY);
                }
            }
        });

        //Mascaras
        try{
            mscCodigo = new MaskFormatter("#######");
            mscCep = new MaskFormatter("#####-###");
            mscCelular = new MaskFormatter("(##) #####-####");
            mscTelefone = new MaskFormatter("(##) #####-####");
            mscAniversario = new MaskFormatter("##/##/##");
            mscDataCadastro = new MaskFormatter("##/##/##");

            //Caractere do placeholder
            mscCodigo.setPlaceholderCharacter('X');
            mscCep.setPlaceholderCharacter('x');
            mscCelular.setPlaceholderCharacter('x');
            mscTelefone.setPlaceholderCharacter('x');
            mscAniversario.setPlaceholderCharacter('x');
            mscDataCadastro.setPlaceholderCharacter('x');
        } catch (Exception e) {}

        //Campos de texto formatados
        ftfCodigo = new JFormattedTextField(mscCodigo);
        ftfCep = new JFormattedTextField(mscCep);
        ftfCelular = new JFormattedTextField(mscCelular);
        ftfTelefone = new JFormattedTextField(mscTelefone);
        ftfAniversario = new JFormattedTextField(mscAniversario);
        ftfDataCadastro = new JFormattedTextField(mscDataCadastro);

        //ComboBOx
        cbxEstados = new JComboBox<>(estados);
        cbxEstados.setMaximumRowCount(7);
        cbxEstados.setSelectedIndex(-1);

        //Radions Buttons
        rbtnMasculino = new JRadioButton("Masculino");
        rbtnFeminino = new JRadioButton("Feminino");
        sexo = new ButtonGroup();
        sexo.add(rbtnMasculino);
        sexo.add(rbtnFeminino);

        //ImageIcons
        iconCadastrar = new ImageIcon("cadastro.png");
        iconCadastrar.setImage(iconCadastrar.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));

        iconLimpar = new ImageIcon("limpar.png");
        iconLimpar.setImage(iconLimpar.getImage().getScaledInstance(19, 19, Image.SCALE_SMOOTH));

        iconFechar = new ImageIcon("fechar.png");
        iconFechar.setImage(iconFechar.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        //Botões
        btnCadastrar = new JButton(iconCadastrar);
        btnFechar = new JButton(iconFechar);
        btnLimpar = new JButton(iconLimpar);

        //Eventos dos botões
        btnFechar.addActionListener(e ->{
            int status = JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar o programa?"
                    ,"Mensagem de Saída", JOptionPane.YES_NO_OPTION);

            if (status == JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        });

        btnLimpar.addActionListener(e -> {
            ftfCodigo.setText("");
            ftfCep.setText(null);
            ftfCelular.setText(null);
            ftfTelefone.setText(null);
            ftfAniversario.setText(null);
            ftfDataCadastro.setText(null);

            txtNome.setText("Nome Completo");
            txtNome.setForeground(Color.GRAY);
            txtEndereco.setText("Nome da Rua");
            txtEndereco.setForeground(Color.GRAY);
            txtBairro.setText("Nome do Bairro");
            txtBairro.setForeground(Color.GRAY);
            txtCidade.setText("Nome da Cidade");
            txtCidade.setForeground(Color.GRAY);

            rbtnMasculino.setSelected(false);
            rbtnFeminino.setSelected(false);

            cbxEstados.setSelectedIndex(-1);

            ftfCodigo.requestFocus();
        });

        btnCadastrar.addActionListener(e -> {
            String cod, nome, end, bair, cid, est, cep, sex="", cel, tel, ani, data;
            cod = ftfCodigo.getText();
            nome = txtNome.getText();
            end = txtEndereco.getText();
            bair = txtBairro.getText();
            cid = txtCidade.getText();
            est = txtEndereco.getText();
            cep = ftfCep.getText();
            if(rbtnMasculino.isSelected()){
                sex = rbtnMasculino.getText();
            }else if(rbtnFeminino.isSelected()){
                sex = rbtnFeminino.getText();
            }
            cel = ftfCelular.getText();
            tel = ftfTelefone.getText();
            ani = ftfAniversario.getText();
            data = ftfDataCadastro.getText();

            JOptionPane.showMessageDialog(null, "Informações do cadastro:" +
                    "\nCódigo do Cliente: "+cod+
                    "\nNome do Cliente: "+nome+
                    "\nEndereço: "+end+
                    "\nBairro: "+bair+
                    "\nCidade: "+cid+
                    "\nEstado: "+est+
                    "\nCEP: "+cep+
                    "\nSexo: "+sex+
                    "\nCelular: "+cel+
                    "\nTelefone: "+tel+
                    "\nAniversário: "+ani+
                    "\nData de Cadastro: "+data);
        });

        //SetBounds
        //Labels
        rtlCodigo.setBounds(40, 30, 150, 25);
        rtlNome.setBounds(40, 68, 150, 25);
        rtlEndereco.setBounds(40, 106, 150, 25);
        rtlBairro.setBounds(40, 144, 150, 25);
        rtlCidade.setBounds(40, 182, 150, 25);
        rtlCep.setBounds(40, 258, 150, 25);
        rtlEstado.setBounds(40, 220, 150, 25);
        rtlSexo.setBounds(40, 296, 150, 25);
        rtlCelular.setBounds(40, 334, 150, 25);
        rtlTelefone.setBounds(40, 372, 150, 25);
        rtlAniversario.setBounds(40, 410, 150, 25);
        rtlDataCadastro.setBounds(40, 448, 150, 25);

        //Textos
        txtNome.setBounds(200, 68, 240, 25);
        txtEndereco.setBounds(200, 106, 240, 25);
        txtBairro.setBounds(200, 144, 240, 25);
        txtCidade.setBounds(200, 182, 240, 25);

        //Campos de textos
        ftfCodigo.setBounds(200, 30, 240, 25);
        ftfCep.setBounds(200, 258, 240, 25);
        ftfCelular.setBounds(200, 334, 240, 25);
        ftfTelefone.setBounds(200, 372, 240, 25);
        ftfAniversario.setBounds(200, 410, 240, 25);
        ftfDataCadastro.setBounds(200, 448, 240, 25);

        //ComboBox
        cbxEstados.setBounds(200, 220, 240, 25);

        //Radion Buttons
        rbtnMasculino.setBounds(200, 296, 110, 25);
        rbtnFeminino.setBounds(315, 296, 110, 25);

        //Botões
        btnCadastrar.setBounds(40, 496, 130, 30);
        btnLimpar.setBounds(185, 496, 130, 30);
        btnFechar.setBounds(330, 496, 130, 30);

        //adicionando na tela
        //Adicionando os Labels
        tela.add(rtlCodigo);
        tela.add(rtlNome);
        tela.add(rtlEndereco);
        tela.add(rtlBairro);
        tela.add(rtlCidade);
        tela.add(rtlEstado);
        tela.add(rtlCep);
        tela.add(rtlSexo);
        tela.add(rtlCelular);
        tela.add(rtlTelefone);
        tela.add(rtlAniversario);
        tela.add(rtlDataCadastro);

        //Textos
        tela.add(txtNome);
        tela.add(txtEndereco);
        tela.add(txtBairro);
        tela.add(txtCidade);

        //Adicionando os campos formatados
        tela.add(ftfCodigo);
        tela.add(cbxEstados);
        tela.add(ftfCep);
        tela.add(rbtnMasculino);
        tela.add(rbtnFeminino);
        tela.add(ftfCelular);
        tela.add(ftfTelefone);
        tela.add(ftfAniversario);
        tela.add(ftfDataCadastro);

        //Grupo
        tela.add(rbtnMasculino);
        tela.add(rbtnFeminino);

        //ComboBox
        tela.add(cbxEstados);

        //Adicionando os botões
        tela.add(btnCadastrar);
        tela.add(btnLimpar);
        tela.add(btnFechar);

        //Configurações da tela
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(false);
    }
}
