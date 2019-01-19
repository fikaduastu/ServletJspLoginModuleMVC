package com.fikadu.web.dao;

import com.fikadu.web.model.Student;

public class StudentDao {
	
	public Student checkLogin(String username,String password) {
		Student s1 = new Student();
		if (username.equals("fikadu") && password.equals("adufik")) {
			s1.setUsername(username);
			s1.setPassword(password);
			s1.setDept("cse");
			s1.setYear(2015);
			return s1;
		}
		return s1;
		
	}
}
