package qualiti.banco.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import qualiti.banco.fachada.Fachada;
import qualiti.banco.clientes.Cliente;
import qualiti.banco.contas.*;

public class ServletListarContas extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html";

    //Initialize global variables
    public void init() throws ServletException {
    }

    //Process the HTTP Get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    //Process the HTTP Post request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fachada fachada = Fachada.obterInstancia();

        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>ServletListarContas</title></head>");
        out.println("<body>");
        out.println("<h1>PQT Internet Banking</h1><hr>");
        out.println("<br><h2>Listar Contas</h2>");

        try {
            Collection contas = fachada.pesquisarTodasContas();
            if (contas.size()==0) {
                out.println("<p>O banco não possui contas cadastradas!</p>");
            } else {
                Iterator it = contas.iterator();
                while (it.hasNext()) {
                    ContaAbstrata c = (ContaAbstrata) it.next();
                    out.println("<table border=\"1\">");
                    out.println("<tr><td>Conta no.</td><td>"+c.getNumero()+"</td></tr>");
                    out.println("<tr><td>Titular (CPF)</td><td>"+c.getCliente().getCpf()+"</td></tr>");
                    out.println("<tr><td>Tipo de Conta</td>");
                    if (c instanceof ContaBonificada) {
                        out.println("<td>Bonificada</td></tr>");
                    }
                    else if (c instanceof ContaImposto) {
                        out.println("<td>Imposto</td></tr>");
                    }
                    else if (c instanceof Poupanca) {
                        out.println("<td>Poupança</td></tr>");
                    }
                    else {
                        out.println("<td>Normal</td></tr>");
                    }
                    out.println("<tr><td>Saldo em "+(new Date())+"</td><td>"+c.getSaldo()+"</td></tr>");
                    out.println("</table><br>");
                }
            }
        }
        catch (Exception ex) {
            out.println("<H1>A operacao nao pode ser realizada com sucesso!");
            ex.printStackTrace();
        }


        out.print("<BR><a href=/RespostaServlet/menuAdm.html>Volta ao menu principal</a>");
        out.println("</body></html>");
    }

    //Clean up resources
    public void destroy() {
    }
}