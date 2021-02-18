package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Implenetation.DemandeImpl;
import DAO.interfaces.IDemande;
import Models.Demande;

@WebServlet(name = "filterByRating_servlet", urlPatterns = {"*.filterByRating_servlet"})

public class filterByRating extends HttpServlet{
	
	private IDemande demandeDAO;
	@Override
	public void init() throws ServletException {
		demandeDAO=new DemandeImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Demande> demandes=new ArrayList<Demande>();
		demandes=demandeDAO.getDemandeByRating();
		request.setAttribute("demandesByRating", demandes);
		request.getRequestDispatcher("./Demande/demandesByRating.jsp").forward(request, response);
				
		
		
	}
}
