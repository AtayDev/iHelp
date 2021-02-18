package DAO;

import java.sql.Connection;

import DAO.Implenetation.AssociationImpl;
import Models.Association;

public class testConnection {

	public static void main(String[] args) {
		AssociationImpl dao=new AssociationImpl();
		
	    //Association ass1=dao.insertAssociation(new Association("saada","saada@gmail.com","123456","0674141865","Agdal rabat", "Nous sommes une association","image.jpg","54551515151"));
	    //Association ass2=dao.insertAssociation(new Association("HAPPY","saada@gmail.com","123456","0674141865","Agdal rabat", "Nous sommes une association","image.jpg","54551515151"));
		Connection connection=SingletonConnection.getConnection();
		if(connection != null) {
			System.out.println("Connection etablie!");
		}
		//System.out.println(ass1.toString());
		//System.out.println(ass2.toString());
	}

}
