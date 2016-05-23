package br.com.qualiti.banco.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ComboBoxModel;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class JanelaPrincipal03 {

	private JFrame frame;
	private RepositorioCliente repositorio = new RepositorioCliente();
	private JTable table;
	private JPanel panel;
	private JLabel lblCliente;
	private JLabel lblTipo;
	private JButton btnSalvar;
	private JButton btnDeletar;
	private JComboBox comboBoxClientes;
	private JComboBox comboBoxTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal03 window = new JanelaPrincipal03();
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
	public JanelaPrincipal03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {

			}
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		frame.setBounds(100, 100, 496, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnListarContas = new JButton("Listar Contas");
		btnListarContas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				table.setModel(getClientesTableModel());
			}

		});
		frame.getContentPane().add(btnListarContas, BorderLayout.SOUTH);

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

					//textCpf.setText(cpfSelecionado);
					//textNome.setText(nomeSelecionado);
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

		lblCliente = new JLabel("Cliente");
		panel.add(lblCliente);

		comboBoxClientes = new JComboBox();
		comboBoxClientes.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
				comboBoxClientes.setModel(getClientesModel());
			}
		});

		panel.add(comboBoxClientes);

		lblTipo = new JLabel("Tipo");
		panel.add(lblTipo);

		btnSalvar = new JButton("salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvarCliente();
				table.setModel(getClientesTableModel());
			}
		});

		comboBoxTipo = new JComboBox();
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Poupan\u00E7a", "Conta Corrente"}));
		panel.add(comboBoxTipo);
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
//		TbCliente cliente = repositorio.procurar(textCpf.getText());
//		repositorio.remover(cliente);
//		limparDadosFormulario();
	}

	private void limparDadosFormulario() {
		//textCpf.setText("");
		//textNome.setText("");
	}

	private void salvarCliente() {


//		TbCliente cliente = repositorio.procurar(textCpf.getText());
//
//		if(cliente == null){
//			cliente = new TbCliente();
//			cliente.setCpf(textCpf.getText());
//			cliente.setNome(textNome.getText());
//			repositorio.inserir(cliente);
//		}else{
//			cliente.setNome(textNome.getText());
//			repositorio.modificar(cliente);
//		}
//
//		limparDadosFormulario();
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


	private ComboBoxModel getClientesModel() {

		TbCliente cliente = new TbCliente();

		new DefaultComboBoxModel(new Object[] {cliente});


		return null;
	}
}
