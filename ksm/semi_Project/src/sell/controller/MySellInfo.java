package sell.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myPage.model.vo.Member;
import sell.model.service.MySellService;
import sell.model.vo.Product;

/**
 * Servlet implementation class MySellInfo
 */
@WebServlet("/MySellList.me")
public class MySellInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
		

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySellInfo() {
        super();
        

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int maxPage = 1;
		
		maxPage = new MySellService().pageCount();
		
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();

		
		
		
		int pNo = Integer.parseInt(request.getParameter("pageNo"));
		
		ArrayList<Product> list = new MySellService().selectList(pNo, userId);
		
		request.setAttribute("list", list);
		request.setAttribute("maxPage", maxPage);
		
		request.getRequestDispatcher("views/sell/mySellListView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
