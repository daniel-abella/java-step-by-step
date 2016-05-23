package qualiti.banco.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import qualiti.banco.fachada.Fachada;
import qualiti.banco.clientes.*;
import qualiti.banco.contas.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

public class ServletCriarConta extends HttpServlet {
  private static final String CONTENT_TYPE = "text/html";
  private Fachada fachada = Fachada.obterInstancia();;
  //Initialize global variables
  public void init() throws ServletException {
  }

  //Process the HTTP Get request
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType(CONTENT_TYPE);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head><title>ServletCriarConta</title></head>");
    out.println("<body>");
    String cpf = request.getParameter("cpf");
    String numero = request.getParameter("numero");
    String tipo = request.getParameter("tipo");
    if (cpf.equals("") || numero.equals("")) {
      out.println("Dados inválidos");
    }
    else {
      try {
        Cliente cliente = fachada.procurarCliente(cpf);
        ContaAbstrata c = null;
        if (tipo.equals("normal")) {
           c = new Conta(numero,cliente);
        }
        else if (tipo.equals("poupanca")) {
           c = new Poupanca(numero,cliente);
        }
        else if (tipo.equals("imposto")) {
           c = new ContaImposto(numero,cliente);
        }
        else if (tipo.equals("bonificada")) {
           c = new ContaBonificada(numero,cliente);
        }
        fachada.cadastrar(c);
        out.println("Operação realizada com sucesso!");
      }
      catch (ClienteInexistenteException ex) {
        out.println("Cliente inexistente");
      }
      catch (ContaExistenteException ex) {
        out.println("A conta já existe!");
      }
      catch (Exception ex) {
        out.print("A operação não pode ser realizada com sucesso!");
        ex.printStackTrace(out);
      }
    }



    out.print("<BR><a href=/RespostaServlet/criarconta.html>Criar outra conta</a>");
    out.print("<BR><a href=/RespostaServlet/menuAdm.html>Volta ao menu principal</a>");
    out.println("</body></html>");
  }
  //Clean up resources
  public void destroy() {
  }
}