package br.com.qualiti.javaweb.filter;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.commons.io.FileUtils;

/**
 * Servlet Filter implementation class LogaParametrosRequest
 */
@WebFilter(
	     filterName="LogaParametros"
		,dispatcherTypes = {DispatcherType.REQUEST }
		,urlPatterns = { "*.deu" }
		,initParams = {
				@WebInitParam(name = "arquivoLogRequest",
						      value = "/log/request.log",
						      description = "logs do request")
		})
public class LogaParametrosRequest implements Filter {

	private FilterConfig filterConfig;

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request,
			ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		System.out.println("LogaParametrosRequest.doFilter()");

		String initParameter =
				filterConfig.getInitParameter("arquivoLogRequest");

		String path =
				filterConfig.getServletContext().
				getRealPath(initParameter);


		File file = new File(path);
		Map<String, String[]> parametros =
				request.getParameterMap();

		for (String nome : parametros.keySet()) {

			String[] valores = parametros.get(nome);

			FileUtils.write(file, nome+"\n", true);

			for (String valor : valores) {
				FileUtils.write(file, "\t\t"+valor+"\n", true);
			}
		}

		chain.doFilter(request, response);
		
		System.out.println();
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}

}
