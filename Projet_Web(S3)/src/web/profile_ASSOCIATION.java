package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Implenetation.AssociationImpl;
import DAO.interfaces.IAssociation;
import Models.Association;



@WebServlet(name = "profile_association", urlPatterns = {"*.profile_association_servlet"})

public class profile_ASSOCIATION extends HttpServlet{
	
	private IAssociation assDAO;
	@Override
	public void init() throws ServletException {
		assDAO=new AssociationImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Association ass=new Association();
		HttpSession session=request.getSession();
		int ass_id=(int) session.getAttribute("ass_id");
		
		
		
		ass=assDAO.getAssociationById(ass_id);
		request.setAttribute("ass_Profile", ass);
		request.getRequestDispatcher("./Association/Mon_Profile_Ass.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		int ass_id=(int) session.getAttribute("ass_id");
		
		String nom=request.getParameter("nom");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String telephone=request.getParameter("telephone");
		String adresse =request.getParameter("adresse");
		String ville=request.getParameter("ville");
		String description=request.getParameter("description");
		String rib=request.getParameter("rib");
		
		
		assDAO.updateAssociation(new Association(ass_id,nom,email,password,telephone,adresse,ville,description,rib));
		
		
		  if(assDAO.updateAssociation(new
		  Association(ass_id,nom,email,password,telephone,adresse,ville,description,rib
		  ))) { System.out.println("Profile Association Updated Avec succés!");
		  request.getRequestDispatcher(
		  "./Association/confirmation_profile_Association.jsp").forward(request,
		  response); } else {
		  System.out.println("Profile Association FAILED To Update");
		  
		  }
		 
		

		
	}

}
