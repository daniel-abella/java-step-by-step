package listararquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

/**
 * Servlet implementation class ListaArquivosServlet
 */
@WebServlet(
		name = "listaArquivosServlet",
		urlPatterns = { "/listaArquivos" },
		initParams = {
				@WebInitParam(name = "driverDefault",
						      value = "C:")
		})
public class ListaArquivosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String diretorioParametro = request.getParameter("diretorio");
		String extensaoParametro = request.getParameter("extensao");

		File diretorio = new File(diretorioParametro);

		Collection<File> arquivos = FileUtils.listFiles(
							diretorio,
							new String[]{extensaoParametro},
							false);

		List<File> arquivosList = new ArrayList<File>(arquivos);

		request.setAttribute("arquivos", arquivosList);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher(
						"jsp/listaArquivos.jsp");

		dispatcher.forward(request, response);

//		OutputStream resposta = response.getOutputStream();
//
//		for (File arquivo : arquivos) {
//			byte[] byteArrayFile = FileUtils.readFileToByteArray(file);
//		}







	}

}
