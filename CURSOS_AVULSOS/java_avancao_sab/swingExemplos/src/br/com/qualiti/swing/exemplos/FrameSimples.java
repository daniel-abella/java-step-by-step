package br.com.qualiti.swing.exemplos;

import javax.swing.*;

public class FrameSimples {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Frame simples");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);
    frame.setLocation(300,200);
    frame.setVisible(true);
  }
}

