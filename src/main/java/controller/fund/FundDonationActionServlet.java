package controller.fund;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.board.BoardDTO;
import service.board.BoardService;
import service.board.BoardServiceImpl;
import service.cheer.CheerService;
import service.cheer.CheerServiceImpl;
import service.donation.DonationService;
import service.donation.DonationServiceImpl;


@WebServlet("/donation.action")
public class FundDonationActionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String next = "";
		String cIdx = request.getParameter("cIdx");
		String mIdx = request.getParameter("mIdx");
		String price = request.getParameter("price");
		String comment = request.getParameter("comment");
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("content_idx", cIdx);
		map.put("member_idx", mIdx);
		map.put("price", Integer.parseInt(price));
		map.put("comment", comment);
		
		DonationService service = new DonationServiceImpl();
		try {
			int num = service.insertDonation(map);
			next = "/fund/now/content?idx="+cIdx;
		} catch (Exception e) {
			next = "/Error500";
			e.printStackTrace();
		}
		
		response.sendRedirect(next);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
