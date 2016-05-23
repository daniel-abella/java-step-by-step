package e03;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet(name="ParametrosServlet",
urlPatterns={"/ParametrosServlet"})
public class ParametrosServlet extends HttpServlet {
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

		Map<String, String[]> parametrosMap =  request.getParameterMap();


		parametros.append("Exerc�cio 03 <br>");

		for (String key : parametrosMap.keySet()) {

			parametros.append("<br>");
			parametros.append(key);
			parametros.append("<br>");

			String[] valores = parametrosMap.get(key);

			if(valores != null){
				for (String valor : valores) {
					parametros.append("&nbsp;&nbsp;&nbsp;&nbsp;");
					parametros.append(valor);
					parametros.append("<br>");
				}
			}

		}



		request.setAttribute("mensagemResposta", parametros.toString());
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/resposta/resposta.jsp");
		dispatcher.forward(request, response);
	}

}
