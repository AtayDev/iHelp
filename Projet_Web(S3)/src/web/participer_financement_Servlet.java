package web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.SingletonConnection;
import DAO.Implenetation.DemandeImpl;
import DAO.Implenetation.ParticipationImpl;
import DAO.interfaces.IDemande;
import DAO.interfaces.IParticipation;
import Models.Demande;
import Models.ParticipationF;

@WebServlet(name = "participer_financement_servlet", urlPatterns = {"*.participer_financement_servlet"})
public class participer_financement_Servlet extends HttpServlet{

	private IParticipation partDAO;
	private IDemande demDAO;
	@Override
	public void init() throws ServletException {
		partDAO=new ParticipationImpl();
		demDAO=new DemandeImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./Participation/participation_financement_form.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParticipationF partf=new ParticipationF();
		
		HttpSession session=request.getSession();
		
		int donateur_id=(int) session.getAttribute("dona_id");
		int reference=Integer.parseInt(request.getParameter("reference"));
		double montant=Double.parseDouble(request.getParameter("montant"));
		int rating=Integer.parseInt(request.getParameter("rating"));
		
		partf=partDAO.insertParticipationF(new ParticipationF(donateur_id,reference,montant));
		demDAO.updateDemandeF(new Demande(montant,rating,reference));
		if(demDAO.updateDemandeF(new Demande(montant,rating,reference))) {
			System.out.println("Le table des demandes est updated avec succés");
			
			 
		}
		else {
			System.out.println("le table des demandes NOT updated");
		}
		request.setAttribute("partf", partf);
		request.getRequestDispatcher("./Participation/confirmation_financement.jsp").forward(request, response);
	}
		
}
