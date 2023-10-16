package com.MVCREG.model;

import java.sql.*;

public class REGServiceImpl implements REGService {
	private Connection con;
	private Statement stmnt;

	@Override
	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc", "root", "9926");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean verifyLogin(String UserName, String Password) {
		try {
			ResultSet result = stmnt
					.executeQuery("select * from login where email='" + UserName + "'and password='" + Password + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void Registration(String email, String password) {
		try {
			stmnt.executeUpdate("insert into login values('" + email + "','" + password + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void createTask(String title, String description, String due_date, String status) {
		try {
			stmnt.executeUpdate("insert into Tasks(title,description,due_date,status)values('" + title + "','"
					+ description + "','" + due_date + "','" + status + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet getAllTasks() {
		try {
			ResultSet result = stmnt.executeQuery("select * from Tasks");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void DeletebyId(String id) {
		try {
			stmnt.executeUpdate("delete from Tasks where task_id='" + id + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateTask(String id, String status) {
		try {
			stmnt.executeUpdate("update Tasks set status='" + status + "'where task_id='" + id + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
