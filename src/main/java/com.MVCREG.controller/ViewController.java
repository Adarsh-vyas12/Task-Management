package com.MVCREG.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MVCREG.model.REGService;
import com.MVCREG.model.REGServiceImpl;

@WebServlet("/view")
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(10);

		if (session.getAttribute("userEmail") != null) {
			REGService service = new REGServiceImpl();
			service.getConnection();
			ResultSet result = service.getAllTasks();
			request.setAttribute("res", result);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Show.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
