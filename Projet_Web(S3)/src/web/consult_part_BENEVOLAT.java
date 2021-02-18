package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Implenetation.ParticipationImpl;
import DAO.interfaces.IParticipation;
import Models.ParticipationB;

@WebServlet(name = "consult_part_benevolat", urlPatterns = {"*.consult_part_benevolat"})

public class consult_part_BENEVOLAT extends HttpServlet {

	private IParticipation partDAO;
	@Override
	public void init() throws ServletException {
		partDAO=new ParticipationImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ParticipationB> partsB=new ArrayList<ParticipationB>();
		HttpSession session = request.getSession();
		int dona_id =  (int) session.getAttribute("dona_id");
		
		partsB=partDAO.getAllParticipationB(dona_id);
		request.setAttribute("partB_List", partsB);
		request.getRequestDispatcher("./Participation/consult_part_benevolat.jsp").forward(request, response);

	}
}
