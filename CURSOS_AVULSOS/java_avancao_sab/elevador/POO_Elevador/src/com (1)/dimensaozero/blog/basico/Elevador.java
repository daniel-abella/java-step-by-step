package com.dimensaozero.blog.basico;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Representa as caracteristica de um elevador. 
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
public class Elevador
{
   /**
    * Guarda o número máximo de pessoas que o elevador comporta. Este número é fixo em 8 pessoas e nunca será alterado.
    * Public - para ser acessível por qualquer outra classe do projeto
    * static - Para que seja um atributo de classe e não de objeto (Leia sobre isso se tiver duvida)
    * final  - Porque é uma constante, seu valor nunca deve ser mudado
    * int    - tipo da variável
    * */
   public static final int CAPACIDADE_MAXIMA = 8; //Para aumentar a capacidade do elevador mude aqui
   /**
    * Guarda o número máximo de andar em que o elevador pode chegar. Este número é fixo em 14 andares e nunca será alterado.
    */
   public static  int NUMERO_MAXIMO_ANDAR = 14;   //Para aumentar a quantidade de andar do elevador mude aqui
   /**
    * Guarda o número do andar em que o elevador se encontra.
    * private - visível apenas a esta classe, será necessário um método get que outras classes
    * acessem o valor dessa variável e um método set para que estes valores sejam mudados
    */
   private int andarAtual;
   
   /** Construtor Padrão, não recebe parâmetros porem inicializa o ArrayList listaDePessoa */
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
    * Server para modificar a variável que representa o andar que o valor se encontra
    * @param andarAtual 
    */
   public void setAndarAtual(int andarAtual)
   {
      this.andarAtual = andarAtual;
      System.out.println("Andou para o "+andarAtual+"º andar.");
   }

   /**
    * Guarda em uma lista de todas as Pessoas que entraram no elevador. 
    * A quantidade de elementos dessa lista será o número de pessoas presente dentro do elevador.
    * Note que este ArrayList pode Conter Várias classes do tipo Pessoa
    * @return listaDePessoa
    * */
   private ArrayList<Pessoa> listaDePessoa;
   

   /**
    * No nosso exercício esse método chamava: verificaCapaciadeMaxima
    * @return Retorna falso se a quantidade de pessoa no elevador for menor que a capacidade máxima do contrario retorna true. 
    */
   public boolean elevadorLotado()
   {
      return listaDePessoa.size() >= CAPACIDADE_MAXIMA;
   }
   
   /**
    * Recebe como parâmetro um objeto Pessoa e a adiciona na lista de pessoas do elevador. 
    * Antes de adicionar uma nova pessoa no elevador algumas consistências devem ser checadas. 
    * Deve ser verificado se o elevador já esta em sua capacidade máxima, se verdade, 
    * não permitir que seja adicionado mais pessoas no elevador e emitir 
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
         //Se o elevador não esta lotado então adicionar a pessoa na lista e emitir a mensagem que conseguiu.
         listaDePessoa.add(pessoa);
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" entrou no elevador.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
   }
   
   /**
    * Recebe como parâmetro um objeto Pessoa e a retira da lista de pessoa do elevador. 
    * Caso a pessoa que deve ser retirada não esteja presente no elevador deve ser 
    * impressa a mensagem '<NOME DA PESSOA> não esta no elevador.' 
    * caso contrário imprimir a mensagem '<NOME DA PESSOA> saiu do elevador'.
    * @param pessoa - pessoa a ser removida do elevador
    */
   public void removePessoa(Pessoa pessoa)
   {
      //Determina qual mensagem será exibida para o usuário
      boolean encontrou = false;
      
      for (Pessoa pessoaDaLista: listaDePessoa)
      {
         //Se encontrou na lista (ou seja no elevador) uma pessoa com o mesmo nome daquela passada como parâmetro
         if (pessoa.getNome().equals(pessoaDaLista.getNome()))
         {
            
            /* 
             * Vai remover e sair do for
             * note que no método remove(..) é passado o objeto pessoa, é possível também passar um inteiro 
             * correspondente a posição do item na lista. Duvida procure pela classe ArrayList no JavaDoc
             */
            listaDePessoa.remove(pessoaDaLista); 
            encontrou = true; //ativar essa variável para poder emitir a mensagem no final do método
            break; //abortar o FOR (aborta o FOR e não o METODO...)
         }
      }//fim for
      
      if (encontrou)
      {
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" saiu do elevador.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
         JOptionPane.showMessageDialog(null,pessoa.getNome()+" não esta no elevador.","Aviso",JOptionPane.WARNING_MESSAGE);
      }
   }
   
   /**
    * Retorna o numero de pessoas que esta no elevador, ou seja, o numero de elementos presente na lista de pessoas.
    * No nosso exercício esse método se chamava: obtém numero pessoas: 
    * @return int - numero de pessoas presente no elevador. É o tamanho da listaDePessoa.
    */
   public int getNumeroDePessoas()
   {
      /* Note que não é necessário fazer um for para contar a quantidade de item dentro da lista, como faríamos
       * Se fosse um Array, o ArrayList já possui um método que retorna a quantidade de elementos presente.
       */
      return listaDePessoa.size();
   }
   
   /** Retorna a lista de pessoas no elevador 
    * @return ArrayList que contém todas as pessoas
    * */
   public ArrayList<Pessoa> getListaDePessoa()
   {
      return listaDePessoa;
   }
}
