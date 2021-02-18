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

@WebServlet(name = "filterByType_servlet", urlPatterns = {"*.filterByType_servlet"})
public class filterByType_Servlet extends HttpServlet {
	
	private IDemande demandeDAO;
	@Override
	public void init() throws ServletException {
		demandeDAO=new DemandeImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Demande> demandes=new ArrayList<Demande>();
		String type=request.getParameter("type");
		demandes=demandeDAO.getDemandeByType(type);
		
		request.setAttribute("demandesByType", demandes);
		request.getRequestDispatcher("./Demande/demandesByType.jsp").forward(request, response);
	}
}
