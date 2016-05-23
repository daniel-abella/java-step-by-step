package com.dimensaozero.blog.basico;


/**
 * Esta classe � um Bean que ira guardar apenas informa��es de uma pessoa
 * ter� atributos encapsulado e com m�todos get e set
 * 
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
 * @see <a href=http://java.sun.com/javase/6/docs/api/ >Guia de Refer�ncia da linguagem java 1.6 - JAVADOC </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/painting/step1.html >Saiba mais sobre JPanel </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html >Saiba mais sobre componentes gr�ficos</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/table.html >Para mais informa��es sobre JTable</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html >Saiba mais sobre exception</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html >Saiba mais sobre layouts</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formata��o</a>
 * @version 1.0
 * */
public class Pessoa
{
   /**
    * Numero de atributos desta classe, � utilizado na exibi��o das pessoas no elevador no JTable
    * */
   public static int NUMERO_DE_CAMPOS = 2;
   
   /** Nome da pessoa */
   private String nome;
   /** Idade da Pessoa */
   private int idade;
   
   /** Tenho um construtor padr�o com dois par�metros, toda Pessoa criada
    * no m�nimo tem que ter nome e idade 
    * 
    * @param nome - nome da pessoa que vai entrar no elevador
    * @param idade - idade da pessoa que vai entrar no elevador
    * */
   public Pessoa(String nome, int idade)
   {
      this.nome = nome;
      this.idade = idade;
   }
   /** Retorna o nome da pessoa
    * @return nome da pessoa
    * */
   public String getNome()
   {
      return nome;
   }
   /**
    * Coloca um nome no objeto
    * @param nome - novo valor a ser colocado no atributo nome
    * */
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   /** Retorna a idade da pessoa
    * @return idade da pessoa
    * */
   public int getIdade()
   {
      return idade;
   }
   /**
    * Coloca uma idade no objeto
    * @param idade - novo valor a ser colocado no atributo nome
    * */
   public void setIdade(int idade)
   {
      this.idade = idade;
   }
   
}
