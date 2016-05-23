package com.dimensaozero.blog.gui.uteis;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import com.dimensaozero.blog.basico.Pessoa;


/**
 * Não é foco desse tutorial explicar o uso de JTable, 
 * 
 * <br>
 * <br>
 * <b>
 * Esta material foi criado para fins de estudo de alguns dos recursos gráficos que a linguagem java possui, 
 * procurou-se fazê-lo de uma forma didática e comentada para que o aluno iniciante tenha maior facilidade no entendimento.
 * Pontos de melhoria e correções podem ser encontrado com uma análise mais critica da aplicação.
 * <font color=RED>Não há restrições quanto a reprodução ou utilização deste material desde que citado o autor (Prof. Eduardo Costa) e origem do material (Blog Dimensão Tech) como referência</font>.
 * <br>
 * Espera-se que iniciantes possam aperfeiçoar este pequeno exemplo da melhor forma possível, promovendo assim o aprendizado. 
 * </b>
 *  
 * @author <b>Prof. Eduardo Costa</b> <br>
 *  <a href=http://www.linkedin.com/in/educosta>Linkedin do autor</a><br>
 *  <a href=http://blog.dimensaozero.com>Fonte do material - Blog Dimensão Tech</a>
 * 
 * @see <a href=http://java.sun.com/javase/6/docs/api/ >Guia de Referência da linguagem java 1.6 - JAVADOC </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/painting/step1.html >Saiba mais sobre JPanel </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html >Saiba mais sobre componentes gráficos</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/table.html >Para mais informações sobre JTable</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html >Saiba mais sobre exception</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html >Saiba mais sobre layouts</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formatação</a>
 * @version 1.0
 * */
public class PessoasTableModel implements TableModel
{
   ArrayList<Pessoa> listaDePessoa;
   String[] nomeDasColunas = new String[]{"Nome", "Idade"};
   static final int NOME = 0;
   static final int IDADE = 1;
   public int getColumnCount()
   {
      return nomeDasColunas.length;
   }
   public PessoasTableModel(ArrayList<Pessoa> listaDePessoa)
   {
      this.listaDePessoa = listaDePessoa;
   }
   public int getRowCount()
   {
      return listaDePessoa.size();
   }
   public boolean isCellEditable(int arg0, int arg1)
   {
      return false;
   }
   public Class getColumnClass(int arg0)
   {
      return String.class;
   }
   public Object getValueAt(int row, int col)
   {
      Pessoa pessoa = (Pessoa) listaDePessoa.get(row);
      if (col == NOME)
      {
         return pessoa.getNome();
      } else if (col == IDADE)
      {
         return pessoa.getIdade();
      }
      return "";
   }
   public void setValueAt(Object arg0, int arg1, int arg2)
   {
   }
   public String getColumnName(int arg0)
   {
      return nomeDasColunas[arg0];
   }
   public void addTableModelListener(TableModelListener l)
   {
   }
   public void removeTableModelListener(TableModelListener l)
   {
   }
}
