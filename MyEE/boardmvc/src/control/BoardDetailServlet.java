package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.exception.FindException;
import com.my.service.RepBoardService;
import com.my.vo.RepBoard;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private RepBoardService service = new RepBoardService();

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "/WEB-INF/views/error.jsp";

		// 1. 요청 전달데이터 얻기
		String strBoard_no = request.getParameter("board_no");
		int board_no = Integer.parseInt(strBoard_no);
		try {
			RepBoard board = service.findByBoard_no(board_no);
			request.setAttribute("board", board);
			path = "/WEB-INF/views/detail.jsp";
		} catch (FindException e) {
			request.setAttribute("exception", e);
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	}

}
