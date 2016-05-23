package com.dimensaozero.blog.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import com.dimensaozero.blog.basico.Elevador;
import com.dimensaozero.blog.basico.Pessoa;
import com.dimensaozero.blog.gui.uteis.PessoasTableModel;
import com.dimensaozero.blog.gui.uteis.Uteis;


/**
 * Este � o painel principal do elevador, a janela onde existem todos
 * os bot�es, eventos etc. O JPanel � como uma lousa onde se adiciona v�rios componentes. 
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
 * */
public class TelaPrincipalPanel extends JPanel implements ActionListener
{
   /** O Elevador sera manipulado por esta janela, ent�o � necess�rio ter
    * um atributo elevador na janela */
   private Elevador elevador;
   
   /* Estamos declarando aqui os componentes gr�ficos da tela
    * Esses bot�es responder�o a eventos do usu�rio.
    * Conhe�a outros componentes gr�ficos em: http://java.sun.com/docs/books/tutorial/uiswing/components/button.html
    *  */
   
   private JButton subirJB;
   private JButton descerJB;
   private JButton removerJB;
   private JButton incluirPessoaJB;
   
   /** Os andares sera representado por componentes do tipo JLabel */
   JLabel[] andares;
   
   /** Obrigar a ser passado um elevador a janela quando ela for criada 
    * @param elevador */
   public TelaPrincipalPanel(Elevador elevador)
   {
      //inicializo o atributo elevador da classe com o par�metro passado
      this.elevador = elevador;  
      //N�o esquecer de chamar o m�todo que cria os componentes logo que criar o objeto
      criarComponentesGraficos();
   }
   

   /**
    * Este m�todo ira CRIAR todos os componentes graficos e adicionar no painel
    * 
    * @see {@link <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html>Saiba mais sobre layouts</a>}
    */
   private void criarComponentesGraficos()
   {
      
      /* Cria o painel que vai guardar os Jlabels */
      JPanel predioPanel = new JPanel();
      predioPanel.setBorder(BorderFactory.createTitledBorder("Hotel"));
      /* Todo painel deve ter um layout, o layout determina a disposi��o
       * Dos componentes dentro dele. Aqui usamos o GridLayout mas existe
       * muito outros. Saber como funciona esse e outros layouts � essencial para 
       * a cria��o de janelas.
       * 
       * 
       * */
      int linha = Elevador.NUMERO_MAXIMO_ANDAR;
      int coluna = 1;
      GridLayout layout = new GridLayout(linha,coluna);
      //Adicionar layout no painel
      predioPanel.setLayout(layout);
      
      
      //criar um array de Jlabel com o tamanho do andar
      andares = new JLabel[Elevador.NUMERO_MAXIMO_ANDAR];
      
      //Inicializar todos os componentes
      for (int i=Elevador.NUMERO_MAXIMO_ANDAR-1;i>=0;i--) //note que este � um loop decrescente
      {
         String descricao = i+"� Andar";
         if (i ==0)
            descricao = "T�rreo";
         andares[i] = new JLabel(descricao,JLabel.CENTER); //Note no segundo parametro passado, que serve para centralizar a descricao
         //permite que os label sejam pintados
         andares[i].setOpaque(true);
         andares[i].setBackground(Color.WHITE);
         andares[i].setBorder(BorderFactory.createEtchedBorder());
         //adiciona o label (nosso andar) no painel (nosso predio)
         predioPanel.add(andares[i]);
      }
      
      /* Carrega as imagens para colocar nos bot�es - as imagens se encontram no pacote resource
       * Caso voc� adicione ou altere as imagens no projeto do eclipse � necess�rio fazer
       * um  PROJECT -> BUILD WORKSPACE ou CTRL+B e at� mesmo um REFRESH (F5) no seu projeto
       * para que essa nova imagem seja enviada para a pasta bin do eclipse. Voc� tb pode
       * copi�-la manualmente basta ir na pasta do projeto, localizar a pasta bin e copiar a 
       * imagem para o pacote correto.
       *
       */
      ImageIcon setaSubirIcon = Uteis.loadImageIcon("imagens/up.png", TelaPrincipalPanel.class);
      ImageIcon setaDescerIcon = Uteis.loadImageIcon("imagens/down.png", TelaPrincipalPanel.class);
      ImageIcon incluirIcon = Uteis.loadImageIcon("imagens/kuzer.png", TelaPrincipalPanel.class);
      ImageIcon removerIcon = Uteis.loadImageIcon("imagens/trashcan_full.png", TelaPrincipalPanel.class);
      
      //Inicialiar botoes      
      subirJB = new JButton(setaSubirIcon);  
      descerJB = new JButton(setaDescerIcon);
      removerJB = new JButton(removerIcon);
      incluirPessoaJB = new JButton(incluirIcon);  
      
      //Importante, neste ponto estou adicionando evento ao bot�o, s� posso usar a instru��o
      //this dentro desse m�todo porque esta classe implementa ActionListener
      subirJB.addActionListener(this);   
      descerJB.addActionListener(this);
      removerJB.addActionListener(this);
      incluirPessoaJB.addActionListener(this);
      
      /* Neste exemplo j� crio o painel passando como par�metro o layout que ser� usado 
       * O resultado � o mesmo do exemplo acima do predioPanel mas aqui n�o � necess�rio 
       * ficar declarando vari�veis 
       * */
      JPanel painelBotoes = new JPanel(new GridLayout(4,1));      
      BorderLayout l = new BorderLayout();
      this.setLayout(l);
      this.add(predioPanel,BorderLayout.CENTER);      
      //Adicionar botoes no painel de botoes
      painelBotoes.add(subirJB);
      painelBotoes.add(descerJB);
      painelBotoes.add(incluirPessoaJB);
      painelBotoes.add(removerJB);
      
      
      this.setLayout(new BorderLayout());
      this.add(predioPanel,BorderLayout.CENTER);
      this.add(painelBotoes,BorderLayout.WEST);

         
      
   }
   
   /**
    * Faz o elevador subir de andar
    * Chama o m�todo que atualiza a interface gr�fica e a classe elevador
    * */
   private void subirElevador()
   {
      //Colocar o andar atual na caracter�stica padr�o
      int andarAtual = elevador.getAndarAtual();
      int andarDesejado = andarAtual+1;
      try
      {
         /* Utilizamos aqui o tratamento de exce��o, caso o m�todo locomoveElevador
          * lan�ar um ArrayIndexOutOfBoundsException siguinifica que o elevador subiu alem do permitido */ 
         this.locomoveElevador(andarAtual,andarDesejado);
         //essa linha n�o � executada se um erro ocorrer.
         elevador.setAndarAtual(andarDesejado);
      }catch(ArrayIndexOutOfBoundsException ex)
      {
         //em caso de erro (exception) o fluxo de execu��o vai cair neste bloco
         JOptionPane.showMessageDialog(this,"Andar m�ximo atingido.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      
   }
   /**
    * Faz o elevador descer de andar
    * Chama o m�todo que atualiza a interface gr�fica e a classe elevador
    * */
   private void descerElevador()
   {
      //Colocar o andar atual na caracter�stica padr�o
      int andarAtual = elevador.getAndarAtual();
      int andarDesejado = andarAtual-1;
      try
      {
         /* Utilizamos aqui o tratamento de exce��o, caso o m�todo locomoveElevador
          * lan�ar um ArrayIndexOutOfBoundsException siguinifica que o elevador desceu alem do permitido */
         this.locomoveElevador(andarAtual,andarDesejado);
         //essa linha n�o � executada se um erro ocorrer.
         elevador.setAndarAtual(andarDesejado);
      }catch(ArrayIndexOutOfBoundsException ex)
      {
          //em caso de erro (exception) o fluxo de execu��o vai cair neste bloco
         JOptionPane.showMessageDialog(this,"Andar m�nimo atingido.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      
   }
   
   /**
    * Este m�todo locomoveElevador apenas atualiza a cor do "andar" (JLabel)
    * o andar onde o elevador esta pinta de branco e o andar para onde o elevador
    * vai pinta de vermelho.
    * A import�ncia de colocar os c�digos em m�todos � poder reutilizar
    * esse m�todo por exemplo sera usado tanto no m�todo subirElevador() quando no 
    * m�todo descerElevador()
    * 
    * 
    * @param andarAtual - o andar em que o elevador se encontra - utilizado para pintar de branco
    * @param andarDesejado - o andar em que se deseja locomover o elevador
    * @throws ArrayIndexOutOfBoundsException
    * IMPORTENTE: Estamos utilizando aqui um conceito importante em linguagem Java, exce��es.
    * As exce��es, mais conhecido como exception � um recurso poderoso da linguagem
    * o m�todo locomoveElevador lan�a um ArrayIndexOutOfBoundsException, um ArrayIndexOutOfBoundsException
    * � lan�ado toda vez que se acessa uma posi��o do Array inferior ou maior que seu tamanho.
    * a instru��o throws for�a a utiliza��o de try-catch no local em que este m�todo esta
    * sendo chamado. Veja os m�todos subirElevador e descerElevador.
    * Saiba mais sobre exception em: http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html
    * */
   private void locomoveElevador(int andarAtual, int andarDesejado) throws ArrayIndexOutOfBoundsException
   {

      //Mudar a cor do Andar desejado e o tipo de borda
      andares[andarDesejado].setBackground(Color.RED);
      andares[andarDesejado].setBorder(BorderFactory.createRaisedBevelBorder());
      //muda a cor do andar atual para a forma padr�o, branco
      andares[andarAtual].setBackground(Color.WHITE);
      andares[andarAtual].setBorder(BorderFactory.createEtchedBorder());
   }
   
   /**
    * Respons�vel por adicionar pessoas no elevador
    * Neste m�todo ser� exibida a janela para o usu�rio incluir valores,
    * ao clicar em OK a pessoa ser� adicionada no elevador
    * 
    * Observar a l�gica desse m�todo. Se o usu�rio digitou valores inv�lidos na janela
    * ela ser� sempre exibida at� que se clique em cancelar ou arrume os valores.
    */
   private void adicionarPessoaNoElevador()
   {
      //Instanciar (criar o objeto) a janela gr�fica que vai permitir a inclus�o de pessoas
      IncluiPessoaPanel incluiPessoaPanel = new IncluiPessoaPanel();
      
      //Essa vari�vel determina se a janela vai continuar aberta
      boolean manterJanelaAberta = true;
      
      while (manterJanelaAberta)
      {
         /* Declaro um Array quer representara o nome dos bot�es, este � s� um exemplo de como � poss�vel
          * personalizar os componentes gr�ficos em java.
          * */       
         Object[] options = {"Adicionar", "Sair"};
         /* A vari�vel 'ret' vai guardar um NUMERO quer representa a op��o do bot�o que o usu�rio clicou
          * O numero da op��o esta ligado ao tipo de op��o passado como par�metro, usamos OK_CANCEL_OPTION aqui.
          * */        
         int ret = JOptionPane.showOptionDialog(
                  this,                          //Componente gr�fico que dispara a janela
                  incluiPessoaPanel,             //Painel que ser� exibido no centro da janela
                  "Inclus�o de pessoas",         //Descri��o que aparece no titulo
                  JOptionPane.OK_CANCEL_OPTION,  //Tipo de op��es da janela
                  JOptionPane.PLAIN_MESSAGE,     //�cone que aparecera na janela, neste caso nenhum
                  null,                          //�cone personalizado
                  options,                       //Op��es dos bot�es
                  options[0]);                   //Op��o com foco padr�o

         
         if (ret == JOptionPane.OK_OPTION)
         { //Usu�rio clicou em OK (nosso adicionar)
            /* IMPORTANTE: Aqui � chamado o m�todo de validar dados da janela, se retornar TRUE 
             * Siguinifica que os dados digitados foram correto e pode passar para o pr�ximo passo dentro do if
             * */            
            if (incluiPessoaPanel.validarDadosInseridosPeloUsuario())
            {
               //Com os dados validado posso utiliza-los - Crio o objeto Pessoa
               Pessoa pessoa = new Pessoa(incluiPessoaPanel.getNome(),incluiPessoaPanel.getIdade());
               /* Aqui se adiciona a pessoa no elevador. IMPORTENTE: A valida��o que verifica se o elevador esta cheio ou n�o 
                * � feita dentro da classe Elevador, poderia ser retirado de l� e colocado aqui. mas n�o � necess�rio
                * */ 
               elevador.adicionaPessoa(pessoa);
               
               //Apos adicionado, limpar os valroes da janela
               incluiPessoaPanel.setNome("");
               incluiPessoaPanel.setIdade("");
            }
         }
         else
         {//Usu�rio clicou em Cancelar (nosso sair)
            manterJanelaAberta = false; //isso far� que saia do loop
         }
      }
   }
   /**
    * Exibe a lista de pessoa no elevador e possibilita a sele��o para exclus�o
    * N�o � foco desse tutorial explicar o uso de JTable, TableModel e JScrollPane
    * eles foram adicionado neste exemplo apenas para possibilitar ao Aluno sua investiga��o e posterior estudo.
    * Para mais informa��es sobre JTable: http://java.sun.com/docs/books/tutorial/uiswing/components/table.html
    * */
   public void removerPessoa()
   {
      //Toda tabela deve ter um modelo, em hajajava este modelo � um table model que recebe o conte�do da tabela
      PessoasTableModel pessoasTableModel = new PessoasTableModel(elevador.getListaDePessoa());
      //Cria-se a tabela passando o modelo como par�metro
      JTable tabela = new JTable(pessoasTableModel);
      //configura a tabela para permitir a sele��o de apenas uma linha por vez
      tabela.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
      //coloca a tabela em um scroll
      JScrollPane scroll = new JScrollPane(tabela);
      //Adiciona o scroll para ser exibido, ou seja, a janela vai aparecer
     
    //Essa vari�vel determina se a janela vai continuar aberta
      boolean manterJanelaAberta = true;
      
      while (manterJanelaAberta)
      {
         /* Declaro um Array quer representara o nome dos bot�es, este � s� um exemplo de como � poss�vel
          * personalizar os componentes gr�ficos em java.
          * */       
         Object[] options = {"Remover", "Sair"};
         /* A vari�vel 'ret' vai guardar um NUMERO quer representa a op��o do bot�o que o usu�rio clicou
          * O numero da op��o esta ligado ao tipo de op��o passado como parametro, usamos OK_CANCEL_OPTION aqui.
          * */        
         int ret = JOptionPane.showOptionDialog(
                  this,                          //Componente gr�fico que dispara a janela
                  scroll,                        //scroll que sera exibido no centro da janela
                  "Retirada de pessoas do Elevador",         //Descri��o que aparece no titulo
                  JOptionPane.OK_CANCEL_OPTION,  //Tipo de op��es da janela
                  JOptionPane.PLAIN_MESSAGE,     //�cone que aparecera na janela, neste caso nenhum
                  null,                          //�cone personalizado
                  options,                       //Op��es dos bot�es
                  options[0]);                   //Op��o com foco padr�o

         
         if (ret == JOptionPane.OK_OPTION)
         { 
            //As vari�veis booleanas abaixo foram criada apenas para melhor entendimento do aluno
            boolean exiteAlgumaLinhaSelecionada = tabela.getSelectedRow() >= 0;
            boolean existePessoasNaLista = elevador.getListaDePessoa().size() > 0;
            boolean aLinhaSelecionadaEhMenorQueOTamanhoDaLista = tabela.getSelectedRow() < elevador.getListaDePessoa().size();
            if (exiteAlgumaLinhaSelecionada && existePessoasNaLista && aLinhaSelecionadaEhMenorQueOTamanhoDaLista )
            {
               Pessoa pessoa = elevador.getListaDePessoa().get(tabela.getSelectedRow());
               //retira a pessoa da listaDePessoa (do elevador)
               elevador.getListaDePessoa().remove(pessoa);               
               //Atualiza a exibi��o da tabela ap�s a remo��o
               tabela.revalidate();
               tabela.repaint();
            }
            else
            {
               JOptionPane.showMessageDialog(this,"Selecione uma pessoa","Aviso",JOptionPane.WARNING_MESSAGE);
            }
         }
         else
         {
            manterJanelaAberta = false;
         }
      }
         
         
   }
   /**
    * Essa classe implementa ActionListener ent�o ela sabe "ouvir" eventos de clique
    * toda vez que clicarem em um bot�o � aqui que (RestricaoCirculacaoParcialVia) proprietarioListaRestricoes.getListaDeRestricoes().get(tabelaRestricoesJT.getSelectedRow());e ira cair
    * Todo componente grafico tem eventos, portanto � necess�rio saber usa-los.
    * Saiba mais sobre componentes gr�ficos: http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html
    */
   public void actionPerformed(ActionEvent e)
   {
      //Nos if abaixo � verificado em qual bot�o o usu�rio clicou, 
      // e para cada bot�o algo deve acontecer
      //Primeiro quero saber se o usu�rio quer incluir uma nova pessoa
      if (e.getSource() == incluirPessoaJB)
      {
         this.adicionarPessoaNoElevador();
      }
      else
      {
         
         if (e.getSource() == subirJB)
         {
           //vou chamar um m�todo Subir ao inv�s de encher esse espa�o com c�digo - � melhor criar um m�todo e separar o c�digo
           this.subirElevador();
         }else if (e.getSource() == descerJB)
         {
            //vou chamar o m�todo descer 
            this.descerElevador();
         }else if (e.getSource() == removerJB)
         {
            this.removerPessoa();
         }
      }
      
   }
   
}
