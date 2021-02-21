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

import DAO.Implenetation.AssociationImpl;
import DAO.Implenetation.DemandeImpl;
import DAO.interfaces.IAssociation;
import DAO.interfaces.IDemande;
import Models.Association;
import Models.Demande;


@WebServlet(name = "login", urlPatterns = {"*.login_ass"})
public class login_ass_Servlet extends HttpServlet{
	
	private IAssociation assLogin_Dao;
	private IDemande demandeDao;
	@Override
	public void init() throws ServletException {
		assLogin_Dao= new AssociationImpl() ;
		demandeDao=new DemandeImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./Association/login_association.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//1) lire les donnés saisie
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Association ass=new Association();
		ass.setEmailAss(email);
		ass.setPasswordAss(password);
		boolean flag=assLogin_Dao.Check_login_ass(ass);
		if(flag) {
			 HttpSession session = request.getSession();
             session.setAttribute("ass_email", ass.getEmailAss()); 
             session.setAttribute("ass_name", ass.getNomAss());
             session.setAttribute("ass_id", ass.getIdAss());
             System.out.println(session.getAttribute("ass_id"));
             //session.setAttribute("assId", ls.getId_ass());
             //System.out.println(session.getAttribute("assId"));
         		List<Demande> demandes=new ArrayList<Demande>();
         		demandes=demandeDao.getAllDemands();
         		request.setAttribute("demandesList", demandes);
             request.getRequestDispatcher("./Association/home_association.jsp").forward(request, response);
             
		}
		else {
			request.getRequestDispatcher("./Association/login_association.jsp").forward(request, response);
		}
		
		
	}
}
