package br.com.qualiti.banco.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import repositorios.RepositorioCliente;
import br.com.qualiti.banco.TbCliente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JanelaPrincipal02 {

	private JFrame frame;
	private RepositorioCliente repositorio = new RepositorioCliente();
	private JTable table;
	private JPanel panel;
	private JLabel lblCpf;
	private JTextField textCpf;
	private JLabel lblNome;
	private JTextField textNome;
	private JButton btnSalvar;
	private JButton btnDeletar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal02 window = new JanelaPrincipal02();
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
	public JanelaPrincipal02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("Listar Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				table.setModel(getClientesTableModel());
			}

		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);

		table = new JTable(){
				Class[] columnTypes = new Class[] {
					String.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}

				boolean[] columnEditables = new boolean[] {
					false,false
				};

				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			};



		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (e.getClickCount() == 2) {
					JTable target = (JTable) e.getSource();
					int row = target.getSelectedRow();

					String cpfSelecionado = (String)target.getModel().getValueAt(row, 0);
					String nomeSelecionado = (String)target.getModel().getValueAt(row, 1);

					textCpf.setText(cpfSelecionado);
					textNome.setText(nomeSelecionado);
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {
		        if (e.getButton() == MouseEvent.BUTTON3) {
		            int col = table.columnAtPoint(e.getPoint());
		            int row = table.rowAtPoint(e.getPoint());
		            exibirDialog("clicada a linha "+row);
		        }
			}
		});
		table.setModel(getDefaultTableModel());
		table.getColumnModel().getColumn(1).setMinWidth(50);

		table.setAutoscrolls(true);

		frame.getContentPane().add(table, BorderLayout.CENTER);

		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		lblCpf = new JLabel("CPF:");
		panel.add(lblCpf);

		textCpf = new JTextField();
		panel.add(textCpf);
		textCpf.setColumns(10);

		lblNome = new JLabel("Nome");
		panel.add(lblNome);

		textNome = new JTextField();
		panel.add(textNome);
		textNome.setColumns(10);

		btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvarCliente();
				table.setModel(getClientesTableModel());

			}

		});
		panel.add(btnSalvar);

		btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				removerCliente();
				table.setModel(getClientesTableModel());
			}

		});
		panel.add(btnDeletar);
	}


	private void removerCliente() {
		TbCliente cliente = repositorio.procurar(textCpf.getText());
		repositorio.remover(cliente);
		limparDadosFormulario();
	}

	private void limparDadosFormulario() {
		textCpf.setText("");
		textNome.setText("");
	}

	private void salvarCliente() {


		TbCliente cliente = repositorio.procurar(textCpf.getText());

		if(cliente == null){
			cliente = new TbCliente();
			cliente.setCpf(textCpf.getText());
			cliente.setNome(textNome.getText());
			repositorio.inserir(cliente);
		}else{
			cliente.setNome(textNome.getText());
			repositorio.modificar(cliente);
		}

		limparDadosFormulario();
	}

	private DefaultTableModel getClientesTableModel() {

		List<TbCliente> clientes  = repositorio.list();

		Object[][] matrixDadosTabela = new Object[clientes.size()][2];

		for (int i = 0; i < matrixDadosTabela.length; i++) {

			matrixDadosTabela[i] = new String[]{clientes.get(i).getCpf(),clientes.get(i).getNome()};
		}

		return gerarTableModel(matrixDadosTabela);
	}

	private DefaultTableModel getDefaultTableModel() {
		Object[][] matrixDadosTabela = new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
		};

		return gerarTableModel(matrixDadosTabela);
	}

	private DefaultTableModel gerarTableModel(Object[][] matrixDadosTabela) {

		return new DefaultTableModel(
			matrixDadosTabela,
			new String[] {
				"CPF", "Nome"
			}
		);
	}

	private void exibirDialog(String mensagem) {

		JOptionPane.showMessageDialog(frame,
				mensagem,
				"Erro",JOptionPane.ERROR_MESSAGE);

	}
}
