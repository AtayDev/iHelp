package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Implenetation.DonateurImpl;
import DAO.interfaces.IDonateur;
import Models.Donateur;

@WebServlet(name = "profile_donateur", urlPatterns = {"*.profile_donateur_servlet"})

public class profile_DONATEUR extends HttpServlet{
	
	private IDonateur donaDAO;
	@Override
	public void init() throws ServletException {
		donaDAO=new DonateurImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Donateur donateur=new Donateur();
		HttpSession session=request.getSession();
		int donateur_id=(int) session.getAttribute("dona_id");
		
		
		donateur=donaDAO.getDonateurById(donateur_id);
		request.setAttribute("donateur_Profile", donateur);
		request.getRequestDispatcher("./Donateur/Mon_Profile.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		int donateur_id=(int) session.getAttribute("dona_id");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String telephone=request.getParameter("telephone");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String ville=request.getParameter("ville");
		
		
		donaDAO.updateDonnateur(new Donateur(donateur_id,email,password,fname,lname,telephone,ville));
		
		if(donaDAO.updateDonnateur(new Donateur(donateur_id,email,password,fname,lname,telephone,ville))) {
			System.out.println("Profile Donateur Updated Avec succés!");
			request.getRequestDispatcher("./Donateur/confirmation_profile_Donateur.jsp").forward(request, response);
		}
		else {
			System.out.println("Profile Donateur FAILED To Update");
			
		}
		

		
	}

}
