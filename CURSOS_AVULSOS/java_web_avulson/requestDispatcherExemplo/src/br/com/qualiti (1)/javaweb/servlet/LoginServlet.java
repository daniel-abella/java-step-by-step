package br.com.qualiti.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.Gson;

@WebServlet(urlPatterns = { "/login" },
			name="Login")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		response.setContentType("text/text");
		PrintWriter out = response.getWriter();

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		RequestResult requestResult = null;

		if(login.equals("eumesmo") && password.equals("1234")){

			requestResult = new RequestResult(true, "Bem vindo, Fulano !");
		} else{
			requestResult = new RequestResult(false, "login ou senha inválidos !");
		}

		Gson gson = new Gson();
		out.write(gson.toJson(requestResult));
	}
}
