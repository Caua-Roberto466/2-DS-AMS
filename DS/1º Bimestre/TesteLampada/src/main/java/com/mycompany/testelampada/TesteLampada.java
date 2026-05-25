package com.mycompany.testelampada;

import javax.swing.JOptionPane;
public class TesteLampada {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que fazer com a lâmpada: "
            + "\n1 - Acender"
            + "\n2 - Apagar"
            + "\n3 - Ver estado"));

        switch(escolha){
            case 1:
                lampada.acender(lampada.estadoDaLampada);
                break;
            case 2:
                lampada.apagar(lampada.estadoDaLampada);
                break;
            case 3:
                lampada.mostrarEstado(lampada.estadoDaLampada);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
