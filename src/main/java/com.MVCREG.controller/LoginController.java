package com.MVCREG.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MVCREG.model.REGService;
import com.MVCREG.model.REGServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		REGService service = new REGServiceImpl();
		service.getConnection();
		boolean verifyLogin = service.verifyLogin(email, password);
		if (verifyLogin) {
			HttpSession session = request.getSession(true);
			session.setAttribute("userEmail", email);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Menu.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "invalid UserName/Password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

}
