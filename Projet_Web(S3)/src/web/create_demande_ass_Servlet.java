package web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import DAO.Implenetation.AssociationImpl;
import DAO.Implenetation.DemandeImpl;

import DAO.interfaces.IAssociation;
import DAO.interfaces.IDemande;

import Models.*;

@WebServlet(name = "create_demande_ass", urlPatterns = {"*.create_demande_ass"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50)
public class create_demande_ass_Servlet extends HttpServlet{
	
	public static final String UPLOAD_DIR = "images";
	public String dbFileName = "";
	private IAssociation assLogin_Dao;
	private IDemande demDao;
	@Override
	public void init() throws ServletException {
		
		demDao=new DemandeImpl();
		assLogin_Dao= new AssociationImpl() ;

	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("./Demande/create_demande.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Demande demande=new Demande();
		//login_ass las = (login_ass)request.getSession().getAttribute("ass_id");
		//demande.setDemandeur_id(login_ass_Impl.x);
		HttpSession session=request.getSession();
		
		
		int demandeur_id =  (int) session.getAttribute("ass_id");
		System.out.println(demandeur_id);
		//demande.setDemandeur_id(demandeur_id);
		String titre=request.getParameter("titre");
		String ville=request.getParameter("ville");
		String description=request.getParameter("description");
		String dateDebut=request.getParameter("date_debut");
		String dateFin=request.getParameter("date_fin");
		
		//	image related SECTION
		Part part=request.getPart("file");
		String fileName = extractFileName(part);
		String applicationPath = getServletContext().getRealPath("");
	    String uploadPath = applicationPath + File.separator + UPLOAD_DIR;
	    System.out.println("applicationPath:" + applicationPath);
	    File fileUploadDirectory = new File(uploadPath);
	    if (!fileUploadDirectory.exists()) {
	          fileUploadDirectory.mkdirs();
	    }
	    String savePath = uploadPath + File.separator + fileName;
	    System.out.println("savePath: " + savePath);
	    String sRootPath = new File(savePath).getAbsolutePath();
	    System.out.println("sRootPath: " + sRootPath);
	    part.write(savePath + File.separator);
	    File fileSaveDir1 = new File(savePath);
	    dbFileName = UPLOAD_DIR + File.separator + fileName;
        part.write(savePath + File.separator);
		
		    
		//////////////////////////////////////
		String Statut=request.getParameter("dem_statut");
		String Type=request.getParameter("dem_type");
		double montantBut=Double.parseDouble(request.getParameter("montant_but"));
		int nbBenevolesBut=Integer.parseInt(request.getParameter("nbBenevoles_but"));
		String heureDebut=request.getParameter("heure_debut");
		String heureFin=request.getParameter("heure_fin");
		String adresseBenevolat=request.getParameter("adresse_benevolat");
		
		//Demande demande=new Demande();
		
		//le id du demandeur provient du Session
		///////////////////////////////////////////////////////////////////
		demande=demDao.insertDemande(new Demande(demandeur_id,titre,ville,description,dateDebut,dateFin,dbFileName,savePath,Statut,Type,adresseBenevolat, montantBut,nbBenevolesBut,heureDebut,heureFin,adresseBenevolat));
		
		request.setAttribute("demande", demande);
		session.setAttribute("demande", demande);
		request.getRequestDispatcher("./Demande/confirmation_demande.jsp").forward(request, response);
	}
	
	 private String extractFileName(Part part) {//This method will print the file name.
	        String contentDisp = part.getHeader("content-disposition");
	        String[] items = contentDisp.split(";");
	        for (String s : items) {
	            if (s.trim().startsWith("filename")) {
	                return s.substring(s.indexOf("=") + 2, s.length() - 1);
	            }
	        }
	        return "";
	 }
	
}
