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
import DAO.Implenetation.DonateurImpl;
import DAO.interfaces.IDemande;
import DAO.interfaces.IDonateur;
import Models.Demande;
import Models.Donateur;

@WebServlet(name = "auth_dona", urlPatterns = {"*.auth_dona"})
public class auth_dona_Servlet extends HttpServlet {
	
	//1)Injection des dépendences
	private IDonateur donaLogin_Dao;
	private IDemande demandeDao;
	@Override
	public void init() throws ServletException {
		donaLogin_Dao=new DonateurImpl();
		demandeDao=new DemandeImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("./Donateur/login_donateur.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1)Lire les données
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Donateur donateur=new Donateur();
		donateur.setDona_email(email);
		donateur.setDona_password(password);
		boolean flag=donaLogin_Dao.Check_login_dona(donateur);
		if(flag) {
			
			HttpSession session=request.getSession();
			session.setAttribute("dona_email", donateur.getDona_email());
			session.setAttribute("dona_fname",donateur.getDona_fname());
			session.setAttribute("dona_id", donateur.getDona_id());
			List<Demande> demandes=new ArrayList<Demande>();
			demandes=demandeDao.getAllDemands();
			request.setAttribute("demandesList", demandes);
			request.getRequestDispatcher("./Donateur/home_donateur.jsp").forward(request, response);
			
		}
		else {
			request.getRequestDispatcher("./Donateur/login_donateur.jsp").forward(request, response);
		}
	}
}
