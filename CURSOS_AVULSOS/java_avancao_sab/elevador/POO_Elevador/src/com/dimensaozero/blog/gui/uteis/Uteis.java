package com.dimensaozero.blog.gui.uteis;

import java.net.URL;

import javax.swing.ImageIcon;
/**
 * Esta classe vai armazenar alguns metodos que podem ser uteis
 * para essa aplicacao e reaproveitado em outras
 * 
 * <br>
 * <br>
 * <b>
 * Esta materal foi criado para fins de estudo de alguns dos recursos gráficos que a linguagem java possui, 
 * procurou-se faze-lo de uma forma didática e comentada para que o aluno iniciante tenha maior facilidade no entendimento.
 * Pontos de melhoria e correções podem ser encontrado com uma análise mais critica da aplicação.
 * <font color=RED>Não há restrições quanto a reprodução ou utilização deste material desde que citado o autor (Prof. Eduardo Costa) e origem do material (Blog Dimensão Tech) como refêrencia</font>.
 * <br>
 * Espera-se que iniciantes possam apefeiçoar este pequeno exemplo da melhor forma possível, promovendo assim o aprendizado. 
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
public class Uteis
{
   /**
    * Faz a leitura de uma imagem que esteja na mesma pasta de uma determinada classe
    * @param filename - o nome do arquivod a imagem ex. logo.jpg ou resources/logo.gif para indicar que a imagem esta em um subdiretorio (outro pacote)
    * */
   public static ImageIcon loadImageIcon(String filename, Object caller)
   {
      try
      {
         URL url;
         if (caller instanceof Class)
         {
            url = ((Class) caller).getResource(filename);
            if (url == null)
               throw (new Error("Erro ao ler imagem: " + filename + " Local: " + caller.toString()));
         } else
         {
            url = caller.getClass().getResource(filename);
            if (url == null)
               throw (new Error("Erro ao ler imagem: " + filename + " Local:" + caller.getClass().toString()));
         }
         ImageIcon aux = new ImageIcon(url, "");
         return aux;
      } catch (Exception e)
      {
         e.printStackTrace();
         return null;
      }
   }
}
