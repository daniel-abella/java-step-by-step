package br.com.qualiti.swing.exemplos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExJOptiConfirmDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    JFrame frame = new JFrame("Frame simples");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400,300);
	    frame.setLocation(300,200);
	    frame.setVisible(true);

		String resposta = JOptionPane.showInputDialog(frame,    		    "Entre com um valor");


		JOptionPane.showMessageDialog(frame,
				"Valor Informado:\n" + resposta,
				"Erro",JOptionPane.ERROR_MESSAGE);
	}

}