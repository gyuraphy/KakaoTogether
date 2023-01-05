package controller.member;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.board.BoardDTO;
import dto.board.PageDTO;
import dto.donation.MydonationDTO;
import dto.member.MemberDTO;
import service.board.BoardService;
import service.board.BoardServiceImpl;
import service.donation.DonationService;
import service.donation.DonationServiceImpl;
import service.member.MemberService;
import service.member.MemberServiceImpl;

@WebServlet("/mypage/mydonation")
public class MyDonationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String next = "";
		HashMap<String, Object> map = new HashMap<String, Object>();
		DonationService service = new DonationServiceImpl();
		HttpSession session = request.getSession();
		int writer = ((MemberDTO) session.getAttribute("login")).getIdx();
		
		try {
			List<MydonationDTO> list = service.selectMyDonation(writer);
			request.setAttribute("MydonationList", list);
			next = "/mydonation.jsp";
		} catch (Exception e) {
			next = "/Error500";
			e.printStackTrace();
		}
		request.getRequestDispatcher(next).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
