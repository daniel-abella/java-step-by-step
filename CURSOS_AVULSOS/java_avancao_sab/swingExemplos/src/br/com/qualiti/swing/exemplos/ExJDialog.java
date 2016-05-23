package br.com.qualiti.swing.exemplos;

import javax.swing.*;

public class ExJDialog {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Frame simples");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);
    frame.setLocation(300,200);
    frame.setVisible(true);

    JDialog caixa = new JDialog(frame);
    caixa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    caixa.setBounds(350,250,300,150);
    caixa.setTitle("Entrada de dados");
    caixa.setModal(true);
    caixa.setResizable(false);
    caixa.setVisible(true);

  }
}

