package com.dimensaozero.blog.gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Este painel ira conter os campos onde o usuario ira entrar com os dados da pessoa
 * 
 * <br>
 * <br>
 * <b>
 * Esta material foi criado para fins de estudo de alguns dos recursos gr�ficos que a linguagem Java possui, 
 * procurou-se faz�-lo de uma forma did�tica e comentada para que o aluno iniciante tenha maior facilidade no entendimento.
 * Pontos de melhoria e corre��es podem ser encontrado com uma an�lise mais critica da aplica��o.
 * <font color=RED>N�o h� restri��es quanto a reprodu��o ou utiliza��o deste material desde que citado o autor (Prof. Eduardo Costa) e origem do material (Blog Dimens�o Tech) como refer�ncia</font>.
 * <br>
 * Espera-se que iniciantes possam aperfei�oar este pequeno exemplo da melhor forma poss�vel, promovendo assim o aprendizado. 
 * </b>
 *  
 * @author <b>Prof. Eduardo Costa</b> <br>
 *  <a href=http://www.linkedin.com/in/educosta>Linkedin do autor</a><br>
 *  <a href=http://blog.dimensaozero.com>Fonte do material - Blog Dimens�o Tech</a>
 * 
 * @see <a href=http://java.sun.com/javase/6/docs/api/ >Guia de Refer�ncia da linguagem Java 1.6 - JAVADOC </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/painting/step1.html >Saiba mais sobre JPanel </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html >Saiba mais sobre componentes gr�ficos</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/table.html >Para mais informa��es sobre JTable</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html >Saiba mais sobre exception</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html >Saiba mais sobre layouts</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formata��o</a>
 * @version 1.0
 */
public class IncluiPessoaPanel extends JPanel
{
   /* Declara��o de componentes gr�ficos */
   //JLabel - descricao dos campos
   private JLabel nomeJL;
   private JLabel idadeJL;
   /* JTextField - Caixa de texto que o usu�rio ira entrar com as informa��es 
    * Vamos precisar de m�todos get e set para esses campos, mas PRESTE ATEN��O
    * nos m�todos get e set, eles s�o um pouco diferente do comum
    * */
   private JTextField nomeJTX;
   private JTextField idadeJTX;
   
   /** O construtores ser� vazio mas tem uma importante fun��o, criar e inicializar 
    * todos os componentes gr�ficos no momento que a classe for instanciada */
   public IncluiPessoaPanel()
   {
      //metodo que cria os componentes logo que criar o objeto
      criarComponentesGraficos();
   }
   
   /**
    * Este m�todo ira CRIAR todos os componentes gr�ficos e adicionar no painel
    */
   public void criarComponentesGraficos()
   {
      //Instanciar os JLabel
      nomeJL = new JLabel("Nome");
      idadeJL = new JLabel("Idade");
      //Instanciar os JTextField com valores vazio
      nomeJTX = new JTextField("");
      idadeJTX = new JTextField("");
      
      //como esta classe � um painel porque extend JPanel posso adicionar nela mesmo um layout
      this.setLayout(new GridLayout(2,2)); //Crio e ja adiciono um GridLayout com 2 linhas e 2 colunas
      
      /* Agora � s� adicionar os componentes no painel, no caso deste Layout, a ordem em
       * que os componentes s�o adicionados determina sua posi��o */
      this.add(nomeJL);
      this.add(nomeJTX);
      this.add(idadeJL);
      this.add(idadeJTX);
   }
   
   /**
    * Metodo que verifica a consist�ncias dos dados inseridos pelo usu�rio
    * @return FALSE se houver algum valor invalido ou n�o digitado
    */
   public boolean validarDadosInseridosPeloUsuario()
   {
      if (this.getNome().equals(""))
      {
         //Falta digitar o nome       
         JOptionPane.showMessageDialog(this, "Digite o nome","Inv�lido",JOptionPane.WARNING_MESSAGE);
         return false;
      }
      if (this.getIdade() == 0)
      {
         //Falta digitar uma idade ou foi digitado uma idade invalida         
         JOptionPane.showMessageDialog(this, "Idade incorreta","Inv�lido",JOptionPane.WARNING_MESSAGE);
         return false;
      }
      return true;
   }
   
   /**
    * 
    * Este m�todo retorna o valor digitado na caixa de texto nome. 
    * ao inv�s de getNomeJTF() por exemplo ele se chama getNome() para ser mais sugestivo.
    * @return Nome digitado no campo gr�fico da janela
    */
   public String getNome()
   {
      return nomeJTX.getText().trim();
   }
   
   /**
    * Recebe um texto como par�metro e coloca na caixa de texto
    * @param nome - novo valor a ser colocado no componente gr�fico
    */
   public void setNome(String nome)
   {
      nomeJTX.setText(nome);
   }
   
   /**
    * Esse m�todo retorna a idade digitada na caixa de texto.
    * ATEN��O: Aqui acontecem duas coisas importante, primeiro � verificado
    * se o usu�rio digitou alguma coisa, caso n�o tenha digitado nada! o m�todo
    * retorna Zero. Caso tenha digitado alguma coisa j� � convertido para inteiro
    * este valor e retornado. No entanto o valor digitado poderia ser uma letra
    * ent�o � feito um TRATAMENTO DE EXCESS�O para que: Se houver erro na convers�o retorne zero.
    * 
    * Saiba mais sobre Tratamento de Exce��o: http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html
    * @return int - idade digitada no componente gr�fico. Se houver erro na convers�o do valor digitado para numero inteiro, retorna ZERO.
    */
   public int getIdade()
   {
      /*  O trim() serve para remover espa�os em branco do texto 
       * Leia sobre o trim e outros m�todos no javadoc: http://java.sun.com/javase/6/docs/api/java/lang/String.html#trim()
       * */
      String valorDigitado = idadeJTX.getText().trim();
      if (valorDigitado.equals(""))
      {
         //Se o usuario nao digitou nada.
         return 0;
      }
      else
      {
         try
         {
            /* Fa�o a convers�o de String par int, se 'valorDigitado' for invalido vai lan�ar uma exce��o
             * do tipo NumberFormatException 
             */
            return Integer.parseInt(valorDigitado);
         }catch(NumberFormatException nfe)
         {
            //Deu erro na convers�o
            return 0;
         }
      }
   }
   
   /**
    * Recebe um texto como par�metro e atribui a caixa de texto idade
    * @param texto - String texto - Coloca um valor no componente gr�fico. 
    */
   public void setIdade(String texto)
   {
      this.idadeJTX.setText(texto);
   }
   
}//fim class
