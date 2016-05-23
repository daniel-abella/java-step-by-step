package br.com.qualiti.banco.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import repositorios.RepositorioCliente;
import br.com.qualiti.banco.TbCliente;

public class JanelaPrincipal {

	private JFrame frame;
	private JTable table;
	private JButton btnA;
	private JButton btnNewButton;
	RepositorioCliente repositorio = new RepositorioCliente();
	private JButton btnNovo;
	private JButton btnEditar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					JanelaPrincipal window = new JanelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		table = new JTable();
		table.setModel(getDefaultTableModel());
		frame.getContentPane().add(table, BorderLayout.CENTER);

		btnA = new JButton("Zerar");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetarTabela();
			}

		});
		frame.getContentPane().add(btnA, BorderLayout.WEST);

		btnNewButton = new JButton("Listar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarClientes();
			}


		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);

		btnNovo = new JButton("Novo");
		frame.getContentPane().add(btnNovo, BorderLayout.EAST);

		btnEditar = new JButton("Editar");
		frame.getContentPane().add(btnEditar, BorderLayout.NORTH);
	}

	private void resetarTabela() {
		table.setModel(getDefaultTableModel());

	}

	private void carregarClientes() {

		List<TbCliente> clientes = repositorio.list();
		Object[][] dadosClientes = new Object[clientes.size()][2];

		for (int i = 0; i < dadosClientes.length; i++) {
			dadosClientes[i] = new String[]{clientes.get(i).getCpf(),clientes.get(i).getNome()};

		}


		String[] colunas = new String[] { "CPF", "Nome" };

		DefaultTableModel tableModel = gerarTableModel(dadosClientes, colunas);

		table.setModel(tableModel);
	}



	private DefaultTableModel getDefaultTableModel() {

		Object[][] dados = new Object[][] {{null, null }, };
		String[] colunas = new String[] { "CPF", "Nome" };

		return gerarTableModel(dados, colunas);
	}

	private DefaultTableModel gerarTableModel(Object[][] dados, String[] colunas) {
		return new DefaultTableModel(dados,	colunas) {
			Class[] columnTypes = new Class[] { String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		};
	}

}