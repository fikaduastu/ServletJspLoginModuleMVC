package com.fikadu.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fikadu.web.dao.StudentDao;
import com.fikadu.web.model.Student;
@WebServlet("/login")
public class GetLoginController extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		StudentDao dao = new StudentDao();
		Student st = dao.checkLogin(username,password);
		if(username.equals(st.getUsername()) && password.equals(st.getPassword())) {
			HttpSession session = request.getSession();
			session.setAttribute("student", st);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("Username or password is incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request,response);
		}
	}
}
