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
import Models.Demande;
import Models.ParticipationF;


@WebServlet(name = "consult_part_financement", urlPatterns = {"*.consult_part_financement"})

public class consult_part_FINANCEMENT extends HttpServlet{

	
	private IParticipation partDAO;
	@Override
	public void init() throws ServletException {
		
		partDAO=new ParticipationImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ParticipationF> partsF=new ArrayList<ParticipationF>();
		HttpSession session = request.getSession();
		int dona_id =  (int) session.getAttribute("dona_id");
		
		partsF=partDAO.getAllParticipationF(dona_id);
		request.setAttribute("partF_List", partsF);
		request.getRequestDispatcher("./Participation/consult_part_financement.jsp").forward(request, response);

	}
	
	
}
