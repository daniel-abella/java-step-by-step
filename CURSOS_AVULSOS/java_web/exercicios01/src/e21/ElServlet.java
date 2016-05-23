package e21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet(name="ElServlet",
urlPatterns={"/ElServlet"})
public class ElServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean lista = "true".equals(request.getParameter("enviarRespostaComoLista"));

		List<String> listagem = new ArrayList<String>();


		if(lista){
			listagem.add("Agora");
			listagem.add("veio");
			listagem.add("uma");
			listagem.add("lista");
			listagem.add("de");
			listagem.add("verdade");
			request.setAttribute("listagem", listagem);
		}


		request.setAttribute("lista", lista);


		request.setAttribute("mensagemResposta", "Exerc�cio 01 - GET");

		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/resposta/resposta.jsp");

		dispatcher.forward(request, response);
	}

}