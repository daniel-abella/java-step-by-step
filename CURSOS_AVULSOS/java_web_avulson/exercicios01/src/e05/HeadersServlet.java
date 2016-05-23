package e05;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet(name="HeadersServlet",
urlPatterns={"/HeadersServlet"})
public class HeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {






		StringBuilder parametros = new StringBuilder();

		parametros.append("Exercício 05 <br>");

		Enumeration<String> headersNames =  request.getHeaderNames();

		while(headersNames.hasMoreElements()){
			String name = headersNames.nextElement();

			parametros.append("<br>");
			parametros.append(name);
			parametros.append("&nbsp;");
			parametros.append(request.getHeader(name));

		}

		request.setAttribute("mensagemResposta", parametros.toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/resposta/resposta.jsp");
		dispatcher.forward(request, response);
	}

}
