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
 * Esta material foi criado para fins de estudo de alguns dos recursos gráficos que a linguagem Java possui, 
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
 * @see <a href=http://java.sun.com/javase/6/docs/api/ >Guia de Referência da linguagem Java 1.6 - JAVADOC </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/painting/step1.html >Saiba mais sobre JPanel </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html >Saiba mais sobre componentes gráficos</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/table.html >Para mais informações sobre JTable</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html >Saiba mais sobre exception</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html >Saiba mais sobre layouts</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formatação</a>
 * @version 1.0
 */
public class IncluiPessoaPanel extends JPanel
{
   /* Declaração de componentes gráficos */
   //JLabel - descricao dos campos
   private JLabel nomeJL;
   private JLabel idadeJL;
   /* JTextField - Caixa de texto que o usuário ira entrar com as informações 
    * Vamos precisar de métodos get e set para esses campos, mas PRESTE ATENÇÃO
    * nos métodos get e set, eles são um pouco diferente do comum
    * */
   private JTextField nomeJTX;
   private JTextField idadeJTX;
   
   /** O construtores será vazio mas tem uma importante função, criar e inicializar 
    * todos os componentes gráficos no momento que a classe for instanciada */
   public IncluiPessoaPanel()
   {
      //metodo que cria os componentes logo que criar o objeto
      criarComponentesGraficos();
   }
   
   /**
    * Este método ira CRIAR todos os componentes gráficos e adicionar no painel
    */
   public void criarComponentesGraficos()
   {
      //Instanciar os JLabel
      nomeJL = new JLabel("Nome");
      idadeJL = new JLabel("Idade");
      //Instanciar os JTextField com valores vazio
      nomeJTX = new JTextField("");
      idadeJTX = new JTextField("");
      
      //como esta classe é um painel porque extend JPanel posso adicionar nela mesmo um layout
      this.setLayout(new GridLayout(2,2)); //Crio e ja adiciono um GridLayout com 2 linhas e 2 colunas
      
      /* Agora é só adicionar os componentes no painel, no caso deste Layout, a ordem em
       * que os componentes são adicionados determina sua posição */
      this.add(nomeJL);
      this.add(nomeJTX);
      this.add(idadeJL);
      this.add(idadeJTX);
   }
   
   /**
    * Metodo que verifica a consistências dos dados inseridos pelo usuário
    * @return FALSE se houver algum valor invalido ou não digitado
    */
   public boolean validarDadosInseridosPeloUsuario()
   {
      if (this.getNome().equals(""))
      {
         //Falta digitar o nome       
         JOptionPane.showMessageDialog(this, "Digite o nome","Inválido",JOptionPane.WARNING_MESSAGE);
         return false;
      }
      if (this.getIdade() == 0)
      {
         //Falta digitar uma idade ou foi digitado uma idade invalida         
         JOptionPane.showMessageDialog(this, "Idade incorreta","Inválido",JOptionPane.WARNING_MESSAGE);
         return false;
      }
      return true;
   }
   
   /**
    * 
    * Este método retorna o valor digitado na caixa de texto nome. 
    * ao invés de getNomeJTF() por exemplo ele se chama getNome() para ser mais sugestivo.
    * @return Nome digitado no campo gráfico da janela
    */
   public String getNome()
   {
      return nomeJTX.getText().trim();
   }
   
   /**
    * Recebe um texto como parâmetro e coloca na caixa de texto
    * @param nome - novo valor a ser colocado no componente gráfico
    */
   public void setNome(String nome)
   {
      nomeJTX.setText(nome);
   }
   
   /**
    * Esse método retorna a idade digitada na caixa de texto.
    * ATENÇÃO: Aqui acontecem duas coisas importante, primeiro é verificado
    * se o usuário digitou alguma coisa, caso não tenha digitado nada! o método
    * retorna Zero. Caso tenha digitado alguma coisa já é convertido para inteiro
    * este valor e retornado. No entanto o valor digitado poderia ser uma letra
    * então é feito um TRATAMENTO DE EXCESSÃO para que: Se houver erro na conversão retorne zero.
    * 
    * Saiba mais sobre Tratamento de Exceção: http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html
    * @return int - idade digitada no componente gráfico. Se houver erro na conversão do valor digitado para numero inteiro, retorna ZERO.
    */
   public int getIdade()
   {
      /*  O trim() serve para remover espaços em branco do texto 
       * Leia sobre o trim e outros métodos no javadoc: http://java.sun.com/javase/6/docs/api/java/lang/String.html#trim()
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
            /* Faço a conversão de String par int, se 'valorDigitado' for invalido vai lançar uma exceção
             * do tipo NumberFormatException 
             */
            return Integer.parseInt(valorDigitado);
         }catch(NumberFormatException nfe)
         {
            //Deu erro na conversão
            return 0;
         }
      }
   }
   
   /**
    * Recebe um texto como parâmetro e atribui a caixa de texto idade
    * @param texto - String texto - Coloca um valor no componente gráfico. 
    */
   public void setIdade(String texto)
   {
      this.idadeJTX.setText(texto);
   }
   
}//fim class
