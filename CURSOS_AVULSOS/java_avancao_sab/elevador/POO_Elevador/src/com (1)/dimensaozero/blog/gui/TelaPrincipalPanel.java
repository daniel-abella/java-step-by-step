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
 * Este é o painel principal do elevador, a janela onde existem todos
 * os botões, eventos etc. O JPanel é como uma lousa onde se adiciona vários componentes. 
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
 * */
public class TelaPrincipalPanel extends JPanel implements ActionListener
{
   /** O Elevador sera manipulado por esta janela, então é necessário ter
    * um atributo elevador na janela */
   private Elevador elevador;
   
   /* Estamos declarando aqui os componentes gráficos da tela
    * Esses botões responderão a eventos do usuário.
    * Conheça outros componentes gráficos em: http://java.sun.com/docs/books/tutorial/uiswing/components/button.html
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
      //inicializo o atributo elevador da classe com o parâmetro passado
      this.elevador = elevador;  
      //Não esquecer de chamar o método que cria os componentes logo que criar o objeto
      criarComponentesGraficos();
   }
   

   /**
    * Este método ira CRIAR todos os componentes graficos e adicionar no painel
    * 
    * @see {@link <a href=http://java.sun.com/docs/books/tutorial/uiswing/layout/using.html>Saiba mais sobre layouts</a>}
    */
   private void criarComponentesGraficos()
   {
      
      /* Cria o painel que vai guardar os Jlabels */
      JPanel predioPanel = new JPanel();
      predioPanel.setBorder(BorderFactory.createTitledBorder("Hotel"));
      /* Todo painel deve ter um layout, o layout determina a disposição
       * Dos componentes dentro dele. Aqui usamos o GridLayout mas existe
       * muito outros. Saber como funciona esse e outros layouts é essencial para 
       * a criação de janelas.
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
      for (int i=Elevador.NUMERO_MAXIMO_ANDAR-1;i>=0;i--) //note que este é um loop decrescente
      {
         String descricao = i+"º Andar";
         if (i ==0)
            descricao = "Térreo";
         andares[i] = new JLabel(descricao,JLabel.CENTER); //Note no segundo parametro passado, que serve para centralizar a descricao
         //permite que os label sejam pintados
         andares[i].setOpaque(true);
         andares[i].setBackground(Color.WHITE);
         andares[i].setBorder(BorderFactory.createEtchedBorder());
         //adiciona o label (nosso andar) no painel (nosso predio)
         predioPanel.add(andares[i]);
      }
      
      /* Carrega as imagens para colocar nos botões - as imagens se encontram no pacote resource
       * Caso você adicione ou altere as imagens no projeto do eclipse é necessário fazer
       * um  PROJECT -> BUILD WORKSPACE ou CTRL+B e até mesmo um REFRESH (F5) no seu projeto
       * para que essa nova imagem seja enviada para a pasta bin do eclipse. Você tb pode
       * copiá-la manualmente basta ir na pasta do projeto, localizar a pasta bin e copiar a 
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
      
      //Importante, neste ponto estou adicionando evento ao botão, só posso usar a instrução
      //this dentro desse método porque esta classe implementa ActionListener
      subirJB.addActionListener(this);   
      descerJB.addActionListener(this);
      removerJB.addActionListener(this);
      incluirPessoaJB.addActionListener(this);
      
      /* Neste exemplo já crio o painel passando como parâmetro o layout que será usado 
       * O resultado é o mesmo do exemplo acima do predioPanel mas aqui não é necessário 
       * ficar declarando variáveis 
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
    * Chama o método que atualiza a interface gráfica e a classe elevador
    * */
   private void subirElevador()
   {
      //Colocar o andar atual na característica padrão
      int andarAtual = elevador.getAndarAtual();
      int andarDesejado = andarAtual+1;
      try
      {
         /* Utilizamos aqui o tratamento de exceção, caso o método locomoveElevador
          * lançar um ArrayIndexOutOfBoundsException siguinifica que o elevador subiu alem do permitido */ 
         this.locomoveElevador(andarAtual,andarDesejado);
         //essa linha não é executada se um erro ocorrer.
         elevador.setAndarAtual(andarDesejado);
      }catch(ArrayIndexOutOfBoundsException ex)
      {
         //em caso de erro (exception) o fluxo de execução vai cair neste bloco
         JOptionPane.showMessageDialog(this,"Andar máximo atingido.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      
   }
   /**
    * Faz o elevador descer de andar
    * Chama o método que atualiza a interface gráfica e a classe elevador
    * */
   private void descerElevador()
   {
      //Colocar o andar atual na característica padrão
      int andarAtual = elevador.getAndarAtual();
      int andarDesejado = andarAtual-1;
      try
      {
         /* Utilizamos aqui o tratamento de exceção, caso o método locomoveElevador
          * lançar um ArrayIndexOutOfBoundsException siguinifica que o elevador desceu alem do permitido */
         this.locomoveElevador(andarAtual,andarDesejado);
         //essa linha não é executada se um erro ocorrer.
         elevador.setAndarAtual(andarDesejado);
      }catch(ArrayIndexOutOfBoundsException ex)
      {
          //em caso de erro (exception) o fluxo de execução vai cair neste bloco
         JOptionPane.showMessageDialog(this,"Andar mínimo atingido.","Aviso",JOptionPane.INFORMATION_MESSAGE);
      }
      
   }
   
   /**
    * Este método locomoveElevador apenas atualiza a cor do "andar" (JLabel)
    * o andar onde o elevador esta pinta de branco e o andar para onde o elevador
    * vai pinta de vermelho.
    * A importância de colocar os códigos em métodos é poder reutilizar
    * esse método por exemplo sera usado tanto no método subirElevador() quando no 
    * método descerElevador()
    * 
    * 
    * @param andarAtual - o andar em que o elevador se encontra - utilizado para pintar de branco
    * @param andarDesejado - o andar em que se deseja locomover o elevador
    * @throws ArrayIndexOutOfBoundsException
    * IMPORTENTE: Estamos utilizando aqui um conceito importante em linguagem Java, exceções.
    * As exceções, mais conhecido como exception é um recurso poderoso da linguagem
    * o método locomoveElevador lança um ArrayIndexOutOfBoundsException, um ArrayIndexOutOfBoundsException
    * é lançado toda vez que se acessa uma posição do Array inferior ou maior que seu tamanho.
    * a instrução throws força a utilização de try-catch no local em que este método esta
    * sendo chamado. Veja os métodos subirElevador e descerElevador.
    * Saiba mais sobre exception em: http://java.sun.com/docs/books/tutorial/essential/exceptions/definition.html
    * */
   private void locomoveElevador(int andarAtual, int andarDesejado) throws ArrayIndexOutOfBoundsException
   {

      //Mudar a cor do Andar desejado e o tipo de borda
      andares[andarDesejado].setBackground(Color.RED);
      andares[andarDesejado].setBorder(BorderFactory.createRaisedBevelBorder());
      //muda a cor do andar atual para a forma padrão, branco
      andares[andarAtual].setBackground(Color.WHITE);
      andares[andarAtual].setBorder(BorderFactory.createEtchedBorder());
   }
   
   /**
    * Responsável por adicionar pessoas no elevador
    * Neste método será exibida a janela para o usuário incluir valores,
    * ao clicar em OK a pessoa será adicionada no elevador
    * 
    * Observar a lógica desse método. Se o usuário digitou valores inválidos na janela
    * ela será sempre exibida até que se clique em cancelar ou arrume os valores.
    */
   private void adicionarPessoaNoElevador()
   {
      //Instanciar (criar o objeto) a janela gráfica que vai permitir a inclusão de pessoas
      IncluiPessoaPanel incluiPessoaPanel = new IncluiPessoaPanel();
      
      //Essa variável determina se a janela vai continuar aberta
      boolean manterJanelaAberta = true;
      
      while (manterJanelaAberta)
      {
         /* Declaro um Array quer representara o nome dos botões, este é só um exemplo de como é possível
          * personalizar os componentes gráficos em java.
          * */       
         Object[] options = {"Adicionar", "Sair"};
         /* A variável 'ret' vai guardar um NUMERO quer representa a opção do botão que o usuário clicou
          * O numero da opção esta ligado ao tipo de opção passado como parâmetro, usamos OK_CANCEL_OPTION aqui.
          * */        
         int ret = JOptionPane.showOptionDialog(
                  this,                          //Componente gráfico que dispara a janela
                  incluiPessoaPanel,             //Painel que será exibido no centro da janela
                  "Inclusão de pessoas",         //Descrição que aparece no titulo
                  JOptionPane.OK_CANCEL_OPTION,  //Tipo de opções da janela
                  JOptionPane.PLAIN_MESSAGE,     //Ícone que aparecera na janela, neste caso nenhum
                  null,                          //Ícone personalizado
                  options,                       //Opções dos botões
                  options[0]);                   //Opção com foco padrão

         
         if (ret == JOptionPane.OK_OPTION)
         { //Usuário clicou em OK (nosso adicionar)
            /* IMPORTANTE: Aqui é chamado o método de validar dados da janela, se retornar TRUE 
             * Siguinifica que os dados digitados foram correto e pode passar para o próximo passo dentro do if
             * */            
            if (incluiPessoaPanel.validarDadosInseridosPeloUsuario())
            {
               //Com os dados validado posso utiliza-los - Crio o objeto Pessoa
               Pessoa pessoa = new Pessoa(incluiPessoaPanel.getNome(),incluiPessoaPanel.getIdade());
               /* Aqui se adiciona a pessoa no elevador. IMPORTENTE: A validação que verifica se o elevador esta cheio ou não 
                * é feita dentro da classe Elevador, poderia ser retirado de lá e colocado aqui. mas não é necessário
                * */ 
               elevador.adicionaPessoa(pessoa);
               
               //Apos adicionado, limpar os valroes da janela
               incluiPessoaPanel.setNome("");
               incluiPessoaPanel.setIdade("");
            }
         }
         else
         {//Usuário clicou em Cancelar (nosso sair)
            manterJanelaAberta = false; //isso fará que saia do loop
         }
      }
   }
   /**
    * Exibe a lista de pessoa no elevador e possibilita a seleção para exclusão
    * Não é foco desse tutorial explicar o uso de JTable, TableModel e JScrollPane
    * eles foram adicionado neste exemplo apenas para possibilitar ao Aluno sua investigação e posterior estudo.
    * Para mais informações sobre JTable: http://java.sun.com/docs/books/tutorial/uiswing/components/table.html
    * */
   public void removerPessoa()
   {
      //Toda tabela deve ter um modelo, em hajajava este modelo é um table model que recebe o conteúdo da tabela
      PessoasTableModel pessoasTableModel = new PessoasTableModel(elevador.getListaDePessoa());
      //Cria-se a tabela passando o modelo como parâmetro
      JTable tabela = new JTable(pessoasTableModel);
      //configura a tabela para permitir a seleção de apenas uma linha por vez
      tabela.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
      //coloca a tabela em um scroll
      JScrollPane scroll = new JScrollPane(tabela);
      //Adiciona o scroll para ser exibido, ou seja, a janela vai aparecer
     
    //Essa variável determina se a janela vai continuar aberta
      boolean manterJanelaAberta = true;
      
      while (manterJanelaAberta)
      {
         /* Declaro um Array quer representara o nome dos botões, este é só um exemplo de como é possível
          * personalizar os componentes gráficos em java.
          * */       
         Object[] options = {"Remover", "Sair"};
         /* A variável 'ret' vai guardar um NUMERO quer representa a opção do botão que o usuário clicou
          * O numero da opção esta ligado ao tipo de opção passado como parametro, usamos OK_CANCEL_OPTION aqui.
          * */        
         int ret = JOptionPane.showOptionDialog(
                  this,                          //Componente gráfico que dispara a janela
                  scroll,                        //scroll que sera exibido no centro da janela
                  "Retirada de pessoas do Elevador",         //Descrição que aparece no titulo
                  JOptionPane.OK_CANCEL_OPTION,  //Tipo de opções da janela
                  JOptionPane.PLAIN_MESSAGE,     //Ícone que aparecera na janela, neste caso nenhum
                  null,                          //Ícone personalizado
                  options,                       //Opções dos botões
                  options[0]);                   //Opção com foco padrão

         
         if (ret == JOptionPane.OK_OPTION)
         { 
            //As variáveis booleanas abaixo foram criada apenas para melhor entendimento do aluno
            boolean exiteAlgumaLinhaSelecionada = tabela.getSelectedRow() >= 0;
            boolean existePessoasNaLista = elevador.getListaDePessoa().size() > 0;
            boolean aLinhaSelecionadaEhMenorQueOTamanhoDaLista = tabela.getSelectedRow() < elevador.getListaDePessoa().size();
            if (exiteAlgumaLinhaSelecionada && existePessoasNaLista && aLinhaSelecionadaEhMenorQueOTamanhoDaLista )
            {
               Pessoa pessoa = elevador.getListaDePessoa().get(tabela.getSelectedRow());
               //retira a pessoa da listaDePessoa (do elevador)
               elevador.getListaDePessoa().remove(pessoa);               
               //Atualiza a exibição da tabela após a remoção
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
    * Essa classe implementa ActionListener então ela sabe "ouvir" eventos de clique
    * toda vez que clicarem em um botão é aqui que (RestricaoCirculacaoParcialVia) proprietarioListaRestricoes.getListaDeRestricoes().get(tabelaRestricoesJT.getSelectedRow());e ira cair
    * Todo componente grafico tem eventos, portanto é necessário saber usa-los.
    * Saiba mais sobre componentes gráficos: http://java.sun.com/docs/books/tutorial/uiswing/events/intro.html
    */
   public void actionPerformed(ActionEvent e)
   {
      //Nos if abaixo é verificado em qual botão o usuário clicou, 
      // e para cada botão algo deve acontecer
      //Primeiro quero saber se o usuário quer incluir uma nova pessoa
      if (e.getSource() == incluirPessoaJB)
      {
         this.adicionarPessoaNoElevador();
      }
      else
      {
         
         if (e.getSource() == subirJB)
         {
           //vou chamar um método Subir ao invés de encher esse espaço com código - é melhor criar um método e separar o código
           this.subirElevador();
         }else if (e.getSource() == descerJB)
         {
            //vou chamar o método descer 
            this.descerElevador();
         }else if (e.getSource() == removerJB)
         {
            this.removerPessoa();
         }
      }
      
   }
   
}
