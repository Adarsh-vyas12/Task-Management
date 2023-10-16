package com.MVCREG.model;

import java.sql.ResultSet;

public interface REGService {

	public void getConnection();

	public boolean verifyLogin(String UserName, String Password);

	public void Registration(String email, String password);

	public void createTask(String title, String description, String due_date, String status);

	public ResultSet getAllTasks();

	public void DeletebyId(String id);

	public void updateTask(String id, String status);
}
