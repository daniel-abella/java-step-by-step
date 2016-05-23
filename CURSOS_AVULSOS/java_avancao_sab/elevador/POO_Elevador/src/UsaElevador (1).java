import javax.swing.JFrame;

import com.dimensaozero.blog.basico.Elevador;
import com.dimensaozero.blog.gui.TelaPrincipalPanel;


/**
 * Classe Usa elevador, Respons�vel pela inicializa��o da aplica��o
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
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formatacao</a>
 * @version 1.0
 * */
public class UsaElevador
{
   
   /* EXERCICIOS SUGERIDO PARA ESTE EXEMPLO
    * 
    * Desafio 1:
    * O campo idade de IncluiPessoaPanel aceita letras e n�meros, fa�a que apenas numero seja permitidos.
    * Saiba mais sobre como criar campos com formata��o: http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html
    * 
    * Desafio 2:
    * Colocar no bot�o uma segunda imagem que ser� trocada quando o usu�rio passar o mouse sobre o bot�o
    * O JButton tem uma propriedade que faz isso. As Imagens j� est�o no pacote imagens com o sufixo _preto.
    * 
    * Deafio 3: 
    * Fa�a com que o elevador tenha tamb�m um limite de peso.
    * Voc� ter� que adicionar um novo campo em IncluiPessoaPanel (e atualizar os m�todos de valida��o)
    * Tamb�m ter� que adicionar um novo atributo em Pessoa
    * e modificar a classe Elevador para que fa�a as devidas valida��es
    * 
    * Desafio 4:
    * Criar uma tela de login para a aplica��o
    */
   
   /**
    * M�todo que torna a classe UsaElevador Inicializavel
    * 
    * @param args - Lista de Argumentos passado como par�metro pelo console. Esta aplica��o n�o os utiliza
    */
   public static void main(String[] args)
   {
      //Cria o elevador
      Elevador elevador = new Elevador();
      //Cria o CONTEUDO da janela principal
      TelaPrincipalPanel janelaPrincipalPanel = new TelaPrincipalPanel(elevador);
      //Cria a janela que ser� exibida
      JFrame janela = new JFrame("Exemplo Elevador");
      //adiciona na janela que ser� exibida a janela principal
      janela.add(janelaPrincipalPanel);
      //Sai da aplica��o caso seja clicado no X de fechar
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      int pixel = 15; //determinei 15px por andar. Casso essa constante seja mudada a janela ser� redimensionada
      janela.setSize(Elevador.NUMERO_MAXIMO_ANDAR*pixel, 400);      
      //Essa simples linha, centraliza a janela na tela
      janela.setLocationRelativeTo(null);
      janela.setVisible(true);
   }
   

}
