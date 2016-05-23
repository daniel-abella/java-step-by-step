package br.com.qualiti.javaweb.filter;

import java.io.File;
import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;

/**
 * Servlet Filter implementation class TimeRequestFilter
 */
@WebFilter(filterName="Time"
,dispatcherTypes = {
				DispatcherType.REQUEST}
		    ,urlPatterns = { "/*" }
			,initParams = {
					@WebInitParam(name = "arquivoLogTempo",
								  value = "/log/tempo.log",
								  description = "Arquivom de logo do  tempo das requisições")
			}
		)
public class TimeRequestFilter implements Filter {


	private FilterConfig filterConfig;

    /**
     * Default constructor.
     */
    public TimeRequestFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("TimeRequestFilter.doFilter()");

		long inicio = System.currentTimeMillis();
		chain.doFilter(request, response);
		long fim = System.currentTimeMillis();

		String initParameter = filterConfig.getInitParameter("arquivoLog");
		String path = filterConfig.getServletContext().getRealPath(initParameter);
		FileUtils.write(new File(path), request.getRemoteHost()+" - "+ (fim-inicio)+"" , true);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}

}
