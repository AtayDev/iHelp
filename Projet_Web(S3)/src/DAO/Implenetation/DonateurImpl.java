package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.SingletonConnection;
import DAO.interfaces.IDonateur;
import Models.Donateur;

public class DonateurImpl implements IDonateur {

	@Override
	public Donateur insertDonnateur(Donateur donateur) {
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO DONATEUR(dona_email,dona_fname,dona_lname,dona_password,dona_telephone,dona_ville) values (?,?,?,?,?,?)");
	    	 ps.setString(1,donateur.getDona_email());
	    	 ps.setString(2,donateur.getDona_fname());
	         ps.setString(3,donateur.getDona_lname());
	         ps.setString(4,donateur.getDona_password());
	         ps.setString(5,donateur.getDona_telephone());
	         ps.setString(6,donateur.getDona_ville());
	       
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(dona_id) AS MAX_ID FROM DONATEUR");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	donateur.setDona_id(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return donateur;
	}

	@Override
	public boolean Check_login_dona(Donateur donateur) {
		boolean flag=false;
		
		Connection connection= SingletonConnection.getConnection();
		
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("SELECT dona_id AS DONAID, dona_fname AS DONAFNAME FROM DONATEUR WHERE dona_email=? AND dona_password=?");
	    	 ps.setString(1,donateur.getDona_email());
	    	 ps.setString(2,donateur.getDona_password());
	    	 
	    	 System.out.println(ps);
	    	 ResultSet rs=ps.executeQuery();
	    	 
	         if(rs.next()) {
	        	 flag=true; 
	    		 donateur.setDona_id(rs.getInt("DONAID"));
	    		 donateur.setDona_fname(rs.getString("DONAFNAME"));	
	    	 }
	    	 
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return flag;
	}

	@Override
	public boolean updateDonnateur(Donateur donateur) {
		 boolean rowUpdatedd;
		 Connection connection= SingletonConnection.getConnection();   
		 String editQuery = "UPDATE Donateur SET dona_email=?, dona_password=?, dona_telephone=? WHERE dona_id=?";
		 try {
	          
	            PreparedStatement ps = connection.prepareStatement(editQuery);
	            ps.setString(1, donateur.getDona_email());
	            ps.setString(2, donateur.getDona_password());
	            ps.setString(3, donateur.getDona_telephone());
	            ps.setInt(4, donateur.getDona_id());
	            
	            ps.executeUpdate();
	            rowUpdatedd=ps.executeUpdate()>0;
	            return rowUpdatedd ;
		 }catch(SQLException e) {
			 e.printStackTrace();
			 
		 }
		 return false;
		 
		 
		 
	}

	@Override
	public Donateur getDonateurById(int id) {
		Connection connection= SingletonConnection.getConnection();
		String query = "SELECT * FROM DONATEUR WHERE dona_id=" + id;
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery(query);
		    while(rs.next()) {
		    	 Donateur donateur = new Donateur();
		    	 donateur.setDona_id(rs.getInt("dona_id"));
	             donateur.setDona_email(rs.getString("dona_email"));
	             donateur.setDona_password(rs.getString("dona_password"));
	             donateur.setDona_fname(rs.getString("dona_fname"));
	             donateur.setDona_lname(rs.getString("dona_lname"));
	             donateur.setDona_ville(rs.getString("dona_ville"));
	             donateur.setDona_telephone(rs.getString("dona_telephone"));
	             return donateur;
		    }
		 }catch (Exception e) {
		    	 e.printStackTrace();
			}
		   return null;
			
		
	}
	

}
