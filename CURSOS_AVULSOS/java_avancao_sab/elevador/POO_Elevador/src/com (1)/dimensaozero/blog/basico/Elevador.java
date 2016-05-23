package com.dimensaozero.blog.basico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Representa as caracteristica de um elevador. 
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
public class Elevador
{
   /**
    * Guarda o n�mero m�ximo de pessoas que o elevador comporta. Este n�mero � fixo em 8 pessoas e nunca ser� alterado.
    * Public - para ser acess�vel por qualquer outra classe do projeto
    * static - Para que seja um atributo de classe e n�o de objeto (Leia sobre isso se tiver duvida)
    * final  - Porque � uma constante, seu valor nunca deve ser mudado
    * int    - tipo da vari�vel
    * */
   public static final int CAPACIDADE_MAXIMA = 8; //Para aumentar a capacidade do elevador mude aqui
   /**
    * Guarda o n�mero m�ximo de andar em que o elevador pode chegar. Este n�mero � fixo em 14 andares e nunca ser� alterado.
    */
   public static  int NUMERO_MAXIMO_ANDAR = 14;   //Para aumentar a quantidade de andar do elevador mude aqui
   /**
    * Guarda o n�mero do andar em que o elevador se encontra.
    * private - vis�vel apenas a esta classe, ser� necess�rio um m�todo get que outras classes
    * acessem o valor dessa vari�vel e um m�todo set para que estes valores sejam mudados
    */
   private int andarAtual;
   
   /** Construtor Padr�o, n�o recebe par�metros porem inicializa o ArrayList listaDePessoa */
   public Elevador()
   {
      //Inicializa a lista de pessoas - vazia
      listaDePessoa = new ArrayList<Pessoa>();
   }
   
   /**
    * Serve para obter o andar que o elevador se encontra
    * @return int - andar em que o elevador se encontra
    */
   public int getAndarAtual()
   {
      return andarAtual;
   }

   /**
    * Server para modificar a vari�vel que representa o andar que o valor se encontra
    * @param andarAtual 
    */
   public void setAndarAtual(int andarAtual)
   {
      this.andarAtual = andarAtual;
      System.out.println("Andou para o "+andarAtual+"� andar.");
   }

   /**
    * Guarda em uma lista de todas as Pessoas que entraram no elevador. 
    * A quantidade de elementos dessa lista ser� o n�mero de pessoas presente dentro do elevador.
    * Note que este ArrayList pode Conter V�rias classes do tipo Pessoa
    * @return listaDePessoa
    * */
   private ArrayList<Pessoa> listaDePessoa;
   

   /**
    * No nosso exerc�cio esse m�todo chamava: verificaCapaciadeMaxima
    * @return Retorna falso se a quantidade de pessoa no elevador for menor que a capacidade m�xima do contrario retorna true. 
    */
   public boolean elevadorLotado()
   {
      return listaDePessoa.size() >= CAPACIDADE_MAXIMA;
   }
   
   /**
    * Recebe como par�metro um objeto Pessoa e a adiciona na lista de pessoas do elevador. 
    * Antes de adicionar uma nova pessoa no elevador algumas consist�ncias devem ser checadas. 
    * Deve ser verificado se o elevador j� esta em sua capacidade m�xima, se verdade, 
    * n�o permitir que seja adicionado mais pessoas no elevador e emitir 
    * a mensagem 'Elevador lotado', caso contrario adicionar a pessoa no elevador e 
    * emitir a mensagem '<NOME DA PESSOA> entrou no elevador'.
    * @param pessoa - Pessoa a ser adicionado no elevador
    */
   public void adicionaPessoa(Pessoa pessoa)
   {
      //verifica antes se o elevador esta ou nao lotado
      if (this.elevadorLotado())
      {
         JOptionPane.showMessageDialog(null,"Elevador lotado!","Aviso",JOptionPane.WARNING_MESSAGE);
      }
      else
      {
         //Se o elevador n�o esta lotado ent�o adicionar a pessoa na lista e emitir a mensagem que conseguiu.
         listaDePessoa.add(pessoa);
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" entrou no elevador.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
   }
   
   /**
    * Recebe como par�metro um objeto Pessoa e a retira da lista de pessoa do elevador. 
    * Caso a pessoa que deve ser retirada n�o esteja presente no elevador deve ser 
    * impressa a mensagem '<NOME DA PESSOA> n�o esta no elevador.' 
    * caso contr�rio imprimir a mensagem '<NOME DA PESSOA> saiu do elevador'.
    * @param pessoa - pessoa a ser removida do elevador
    */
   public void removePessoa(Pessoa pessoa)
   {
      //Determina qual mensagem ser� exibida para o usu�rio
      boolean encontrou = false;
      
      for (Pessoa pessoaDaLista: listaDePessoa)
      {
         //Se encontrou na lista (ou seja no elevador) uma pessoa com o mesmo nome daquela passada como par�metro
         if (pessoa.getNome().equals(pessoaDaLista.getNome()))
         {
            
            /* 
             * Vai remover e sair do for
             * note que no m�todo remove(..) � passado o objeto pessoa, � poss�vel tamb�m passar um inteiro 
             * correspondente a posi��o do item na lista. Duvida procure pela classe ArrayList no JavaDoc
             */
            listaDePessoa.remove(pessoaDaLista); 
            encontrou = true; //ativar essa vari�vel para poder emitir a mensagem no final do m�todo
            break; //abortar o FOR (aborta o FOR e n�o o METODO...)
         }
      }//fim for
      
      if (encontrou)
      {
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" saiu do elevador.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" n�o esta no elevador.","Aviso",JOptionPane.WARNING_MESSAGE);
      }
   }
   
   /**
    * Retorna o numero de pessoas que esta no elevador, ou seja, o numero de elementos presente na lista de pessoas.
    * No nosso exerc�cio esse m�todo se chamava: obt�m numero pessoas: 
    * @return int - numero de pessoas presente no elevador. � o tamanho da listaDePessoa.
    */
   public int getNumeroDePessoas()
   {
      /* Note que n�o � necess�rio fazer um for para contar a quantidade de item dentro da lista, como far�amos
       * Se fosse um Array, o ArrayList j� possui um m�todo que retorna a quantidade de elementos presente.
       */
      return listaDePessoa.size();
   }
   
   /** Retorna a lista de pessoas no elevador 
    * @return ArrayList que cont�m todas as pessoas
    * */
   public ArrayList<Pessoa> getListaDePessoa()
   {
      return listaDePessoa;
   }
}
