package com.MVCREG.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MVCREG.model.REGService;
import com.MVCREG.model.REGServiceImpl;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		REGService service = new REGServiceImpl();
		service.getConnection();
		service.DeletebyId(id);
		ResultSet result = service.getAllTasks();
		request.setAttribute("res", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/Show.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
