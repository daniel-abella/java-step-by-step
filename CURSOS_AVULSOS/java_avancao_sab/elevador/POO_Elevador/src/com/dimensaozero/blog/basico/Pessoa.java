package com.dimensaozero.blog.basico;


/**
 * Esta classe é um Bean que ira guardar apenas informações de uma pessoa
 * terá atributos encapsulado e com métodos get e set
 * 
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
 * @see <a href=http://java.sun.com/javase/6/docs/api/ >Guia de Referência da linguagem java 1.6 - JAVADOC </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/painting/step1.html >Saiba mais sobre JPanel </a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html >Saiba mais sobre componentes gráficos</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/table.html >Para mais informações sobre JTable</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html >Saiba mais sobre exception</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html >Saiba mais sobre layouts</a>
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formatação</a>
 * @version 1.0
 * */
public class Pessoa
{
   /**
    * Numero de atributos desta classe, é utilizado na exibição das pessoas no elevador no JTable
    * */
   public static int NUMERO_DE_CAMPOS = 2;
   
   /** Nome da pessoa */
   private String nome;
   /** Idade da Pessoa */
   private int idade;
   
   /** Tenho um construtor padrão com dois parâmetros, toda Pessoa criada
    * no mínimo tem que ter nome e idade 
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
