package com.my.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답형식지정하기
		response.setContentType("application/json;charset=utf-8");
		// 응답 출력스트림얻기
		PrintWriter out = response.getWriter();
		
		// 요청전달데이터 얻기
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals(pwd)) {
			out.print("{\"status\":1}");
		} else {
			out.print("{\"status\":-1}");
		}
	}
}
