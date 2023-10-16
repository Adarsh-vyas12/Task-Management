package com.MVCREG.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MVCREG.model.REGService;
import com.MVCREG.model.REGServiceImpl;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
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
		service.Registration(email, password);
		request.setAttribute("a", "Your Details Has Been Submitted");
		RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
		rd.forward(request, response);
	}

}
