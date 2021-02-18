package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Implenetation.DonateurImpl;
import DAO.interfaces.IDonateur;
import Models.Donateur;

@WebServlet(name = "register_dona", urlPatterns = {"*.register_dona"})
public class register_dona_Servlet extends HttpServlet
{
	//1)Injection des dépendences
	private IDonateur donaDao;

	@Override
	public void init() throws ServletException {
		
		donaDao=new DonateurImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Donateur/register_donateur.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String password=request.getParameter("password");
		String telephone=request.getParameter("telephone");
		String ville=request.getParameter("ville");
		///////////////////////////////////////////////////////
		
		Donateur donateur=donaDao.insertDonnateur(new Donateur(email,fname,lname,password,telephone,ville));
		request.setAttribute("donnateur", donateur);
		request.getRequestDispatcher("/Donateur/confirmation_register_donateur.jsp").forward(request, response);
	}
}
