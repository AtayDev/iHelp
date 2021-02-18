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



import DAO.Implenetation.DemandeImpl;
import DAO.interfaces.IDemande;
import Models.Demande;

@WebServlet(name = "consult_demande_ass", urlPatterns = {"*.consult_demande_ass"})
public class consult_demande_ass_Servlet extends HttpServlet {
	
	private IDemande demandeDao;
	@Override
	public void init() throws ServletException {
		demandeDao=new DemandeImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Demande> demandes=new ArrayList<Demande>();
		HttpSession session = request.getSession();
		int demandeur_id =  (int) session.getAttribute("ass_id");
		
		demandes=demandeDao.getAllDemandsOfAssociation(demandeur_id);
		/*for(Demande d: demandes) {
			System.out.println(d.toString());
		}*/
		
		request.setAttribute("demandesList", demandes);
		request.getRequestDispatcher("./Demande/consult_demande.jsp").forward(request, response);
	}

}
