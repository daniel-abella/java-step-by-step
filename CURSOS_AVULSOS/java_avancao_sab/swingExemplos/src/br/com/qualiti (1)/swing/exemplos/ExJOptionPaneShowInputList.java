package br.com.qualiti.swing.exemplos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExJOptionPaneShowInputList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Frame simples");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocation(300, 200);
		frame.setVisible(true);

		Object retorno = JOptionPane.showInputDialog(frame,
				"Escolha uma fruta", "Preparação de vitaminas Java",
				JOptionPane.QUESTION_MESSAGE,
				new ImageIcon("imagens/bolha.gif"), new String[] { "Mamão",
						"Banana", "Maçã" }, "Maçã");

		JOptionPane.showMessageDialog(frame, retorno, "Fruta escolhida",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
