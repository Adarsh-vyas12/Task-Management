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

@WebServlet("/create")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Create.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(30);

		if (session.getAttribute("userEmail") != null) {
			String title = request.getParameter("title");
			String description = request.getParameter("description");
			String due_date = request.getParameter("date");
			String status = request.getParameter("status");
			REGService service = new REGServiceImpl();
			service.getConnection();
			service.createTask(title, description, due_date, status);
			request.setAttribute("b", "New task has been created");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Create.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
	}

}
