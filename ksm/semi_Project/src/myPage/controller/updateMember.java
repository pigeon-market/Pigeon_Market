package myPage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myPage.model.service.MemberService;
import myPage.model.vo.Member;

/**
 * Servlet implementation class updateMember
 */
@WebServlet("/updateMember.me")
public class updateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		Member mem = new Member(userId, userPwd, phone, email, address);
		
		int result = new MemberService().updateMember(mem);
		
		
		// 이쪽은 수정해야함
		if(result > 0) {
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "회원변경이 완료되었습니다. /n 다시 로그인해주세요");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "회원정보변경이 실패하였습니다.");
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
