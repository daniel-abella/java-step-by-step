package listararquivos;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet(name = "downloadServlet",
	urlPatterns = { "/download" })
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		String path = request.getParameter("path");
		OutputStream resposta = response.getOutputStream();

		File arquivoDownload = new File(path);

		byte[] arquivoDownloadBytes =
				FileUtils.readFileToByteArray(arquivoDownload);

        response.setContentType("application/force-download");
        response.setHeader("Content-Transfer-Encoding",
        		URLConnection.guessContentTypeFromName(path));
        response.setHeader("Content-Disposition",
        		"attachment; filename=\"" +
                              arquivoDownload.getName()+ "\"");

		resposta.write(arquivoDownloadBytes);

		resposta.flush();
	}

}
