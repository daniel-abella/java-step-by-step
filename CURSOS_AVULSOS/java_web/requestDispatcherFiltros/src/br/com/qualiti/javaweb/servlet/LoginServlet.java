package br.com.qualiti.javaweb.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(
			urlPatterns = { "/login" },
			name="Login")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String p=request.getParameter("userPass");
		if(p.equals("servlet")){
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);

		}
		else{
			out.print("Sorry username or password error!");

			RequestDispatcher rdMensagem=request.getRequestDispatcher("mensagem.html");
			rdMensagem.include(request, response);

			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
