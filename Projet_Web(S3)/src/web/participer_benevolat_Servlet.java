package web;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Implenetation.DemandeImpl;
import DAO.Implenetation.ParticipationImpl;
import DAO.interfaces.IDemande;
import DAO.interfaces.IParticipation;
import Models.Demande;
import Models.ParticipationB;
import Models.ParticipationF;


@WebServlet(name = "participer_benevolat_servlet", urlPatterns = {"*.participer_benevolat_servlet"})
public class participer_benevolat_Servlet extends HttpServlet{

	private IParticipation partDAO;
	private IDemande demDAO;
	@Override
	public void init() throws ServletException {
		partDAO=new ParticipationImpl();
		demDAO=new DemandeImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./Participation/participation_benevolat_form.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rd = new Random();
		double x=rd.nextDouble();
		ParticipationB partb=new ParticipationB();
		HttpSession session=request.getSession();
		
		int donateur_id=(int) session.getAttribute("dona_id");
		int reference=Integer.parseInt(request.getParameter("reference"));
		int benevolat=Integer.parseInt(request.getParameter("benevolat"));
		int rating=Integer.parseInt(request.getParameter("rating"));
		partb=partDAO.insertParticipationB(new ParticipationB(donateur_id,reference,benevolat));
		demDAO.updateDemandeB(new Demande(benevolat,rating,reference,x));
		
		request.setAttribute("partb", partb);
		request.getRequestDispatcher("./Participation/confirmation_benevolat.jsp").forward(request, response);
	}
}
