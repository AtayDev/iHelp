package web;
import DAO.Implenetation.*;

import Models.Association;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Implenetation.AssociationImpl;
import DAO.interfaces.*;


@WebServlet(name = "sign_up_ass", urlPatterns = {"*.sign_up_ass"})
public class sign_up_ass_Servlet extends HttpServlet {
	
	//1-Injection des dépendences
	private IAssociation assDAO;
	@Override
	public void init() throws ServletException {
		assDAO= new AssociationImpl();
	}
	
	//@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/Association/register_association.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String telephone=request.getParameter("telephone");
		String adresse =request.getParameter("adresse");
		String description=request.getParameter("description");
		String image=request.getParameter("image");
		String rib=request.getParameter("rib");
		///////////////////////////////////////////////
		Association ass=assDAO.insertAssociation(new Association(nom,email,password,telephone,adresse,description,image,rib));;
		
		request.setAttribute("association", ass);
		request.getRequestDispatcher("/Association/confirmation_register_association.jsp").forward(request, response);
		}
		
}

