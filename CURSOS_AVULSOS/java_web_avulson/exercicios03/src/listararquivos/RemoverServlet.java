package listararquivos;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

@WebServlet(name = "removerServlet",
urlPatterns = { "/remover" })
public class RemoverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String diretorio = null;

	public void init() {
		ServletContext sc = getServletContext();
		diretorio = sc.getRealPath("/WEB-INF/tmp");
		File criaDirTmp = new File(diretorio);
		if (!criaDirTmp.exists()) {
			criaDirTmp.mkdir();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse res)
			throws ServletException, IOException {
		String retorno = "ok"; // Convencao em caso de sucesso

		try {

			String diretorioParametro = request.getParameter("diretorio");
			String nomeArquivo = request.getParameter("nomeArquivo");

			FileUtils.deleteQuietly(new File(diretorioParametro+"/"+nomeArquivo));

		} catch (Exception e) {
			res.sendError(500);
			return;
		}


		RequestDispatcher dispatcher
		= request.getRequestDispatcher("/listaArquivos");

		dispatcher.forward(request, res);
	}

	public static boolean copy(InputStream origem, OutputStream destino) {
		boolean copia = true;
		int bytes = -1;
		byte[] buffer = new byte[4096];
		try {
			while (copia) {
				bytes = origem.read(buffer, 0, 4096);
				if (bytes == -1)
					break;
				destino.write(buffer, 0, bytes);
			}
			destino.flush();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		ServletContext sc = getServletContext();
		String path = sc.getRealPath("/WEB-INF");
		PrintWriter pw = res.getWriter();
		pw.println(path);
	}

	public void doDelete(HttpServletRequest req, HttpServletResponse res) {
		emptyDir();
	}

	private void emptyDir() {
		File dir = new File(diretorio);
		for (File file : dir.listFiles()) {
			file.delete();
		}
	}
}