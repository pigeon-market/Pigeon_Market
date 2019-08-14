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
 * Servlet implementation class deleteMemberServlet
 */
@WebServlet("/delete.me")
public class deleteMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = ((Member)request.getSession().getAttribute("loginUser")).getUserId();
		
		int result = new MemberService().deleteMember(userId);
		
		if(result > 0 ) { // 회원탈퇴에 성공한 경우
			request.getSession().removeAttribute("loginUser");
			request.getSession().setAttribute("msg", "회원 탈퇴가 완료되었습니다. 복구 관련 사항은 관리자에게 문의하세요.");
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("msg", "회원 탈퇴에 실패했습니다.");
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
