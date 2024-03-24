package com.my.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.exception.FindException;
import com.my.service.ProductService;
import com.my.vo.Product;


public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("서블릿 진입 성공");
		ProductService service = new ProductService();
		try {
			List<Product> list = service.findAll();
			request.setAttribute("list", list);
			String path = "/productlistresult.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(path);
			rd.forward(request, response);
		} catch (FindException e) {
			e.printStackTrace();
		}
	}

}
