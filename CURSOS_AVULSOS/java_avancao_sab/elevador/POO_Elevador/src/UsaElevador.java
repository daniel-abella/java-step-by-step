import javax.swing.JFrame;

import com.dimensaozero.blog.basico.Elevador;
import com.dimensaozero.blog.gui.TelaPrincipalPanel;


/**
 * Classe Usa elevador, Responsável pela inicialização da aplicação
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
 * @see <a href=http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html >Saiba mais sobre como criar campos com formatacao</a>
 * @version 1.0
 * */
public class UsaElevador
{
   
   /* EXERCICIOS SUGERIDO PARA ESTE EXEMPLO
    * 
    * Desafio 1:
    * O campo idade de IncluiPessoaPanel aceita letras e números, faça que apenas numero seja permitidos.
    * Saiba mais sobre como criar campos com formatação: http://java.sun.com/docs/books/tutorial/uiswing/components/formattedtextfield.html
    * 
    * Desafio 2:
    * Colocar no botão uma segunda imagem que será trocada quando o usuário passar o mouse sobre o botão
    * O JButton tem uma propriedade que faz isso. As Imagens já estão no pacote imagens com o sufixo _preto.
    * 
    * Deafio 3: 
    * Faça com que o elevador tenha também um limite de peso.
    * Você terá que adicionar um novo campo em IncluiPessoaPanel (e atualizar os métodos de validação)
    * Também terá que adicionar um novo atributo em Pessoa
    * e modificar a classe Elevador para que faça as devidas validações
    * 
    * Desafio 4:
    * Criar uma tela de login para a aplicação
    */
   
   /**
    * Método que torna a classe UsaElevador Inicializavel
    * 
    * @param args - Lista de Argumentos passado como parâmetro pelo console. Esta aplicação não os utiliza
    */
   public static void main(String[] args)
   {
      //Cria o elevador
      Elevador elevador = new Elevador();
      //Cria o CONTEUDO da janela principal
      TelaPrincipalPanel janelaPrincipalPanel = new TelaPrincipalPanel(elevador);
      //Cria a janela que será exibida
      JFrame janela = new JFrame("Exemplo Elevador");
      //adiciona na janela que será exibida a janela principal
      janela.add(janelaPrincipalPanel);
      //Sai da aplicação caso seja clicado no X de fechar
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      int pixel = 15; //determinei 15px por andar. Casso essa constante seja mudada a janela será redimensionada
      janela.setSize(Elevador.NUMERO_MAXIMO_ANDAR*pixel, 400);      
      //Essa simples linha, centraliza a janela na tela
      janela.setLocationRelativeTo(null);
      janela.setVisible(true);
   }
   

}
