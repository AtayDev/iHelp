package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.SingletonConnection;
import DAO.interfaces.IDemande;
import Models.Demande;

public class DemandeImpl implements IDemande {

	@Override
	public Demande insertDemande(Demande demande) {
		
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO DEMANDE(dem_titre,dem_ville,dem_description,date_debut,date_fin,filename,path,dem_statut,dem_type,montant_but,nbBenevoles_but,heure_debut,heure_fin,adresse_benevolat,demandeur_id,rating,montant_vrai,nbBenevoles_vrai) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,0,0,0)");
	         ps.setString(1,demande.getDem_titre());
	         ps.setString(2,demande.getDem_ville());
	         ps.setString(3,demande.getDem_description());
	         ps.setString(4,demande.getDate_debut());
	         ps.setString(5,demande.getDate_fin());
	         ps.setString(6, demande.getFilename());
	         ps.setString(7, demande.getPath());
	         ps.setString(8,demande.getDem_statut());
	         ps.setString(9,demande.getDem_type());
	         ps.setDouble(10,demande.getMontant_but());
	         ps.setInt(11,demande.getNbBenevoles_but());
	         ps.setString(12,demande.getHeure_debut());
	         ps.setString(13,demande.getHeure_fin());
	         ps.setString(14,demande.getAdresse_benevolat());
	         ps.setInt(15,demande.getDemandeur_id());
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(dem_id) AS MAX_DEM_ID FROM DEMANDE");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 demande.setDem_id(rs.getInt("MAX_DEM_ID"));
	        	 //demande.setDemandeur_id();
	         }
	         
	        PreparedStatement ps3=connection.prepareStatement("SELECT ass_id FROM ASSOCIATION WHERE ass_email=? AND ass_password=?");
	        ResultSet rs3=ps3.executeQuery();
	         
	         
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return demande;
	}
	

	
	@Override
	public List<Demande> getAllDemandsOfAssociation(int ass_id) {
		
		List<Demande> demandes=new ArrayList<Demande>();
		String query = "SELECT * FROM DEMANDE WHERE demandeur_id=" + ass_id;
		Connection connection= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(query);
            
            ResultSet resultSet = ps.executeQuery(query);
            while(resultSet.next()) {
        	   	  Demande demande = new Demande();
        		  demande.setDem_id(resultSet.getInt("dem_id"));
        		  demande.setDemandeur_id(resultSet.getInt("demandeur_id"));
        		  demande.setDem_titre(resultSet.getString("dem_titre"));
        		  demande.setDem_ville(resultSet.getString("dem_ville"));
        		  demande.setDem_description(resultSet.getString("dem_description"));
        		  demande.setDate_debut(resultSet.getString("date_debut"));
        		  demande.setDate_fin(resultSet.getString("date_fin"));
        		  
        		  demande.setFilename(resultSet.getString("filename"));
        		  demande.setPath(resultSet.getString("path"));
        		  
        		  
        		  demande.setDem_statut(resultSet.getString("dem_statut"));
        		  demande.setDem_type(resultSet.getString("dem_type"));
        		  demande.setMontant_but(resultSet.getDouble("montant_but"));
        		  demande.setMontant_vrai(resultSet.getDouble("montant_vrai"));
        		  demande.setNbBenevoles_but(resultSet.getInt("nbBenevoles_but"));
        		  demande.setNbBenevoles_vrai(resultSet.getInt("nbBenevoles_vrai"));
        		  demande.setHeure_debut(resultSet.getString("heure_debut"));
        		  demande.setHeure_fin(resultSet.getString("heure_fin"));
        		  demande.setAdresse_benevolat(resultSet.getString("adresse_benevolat"));
        		  demande.setRating(resultSet.getInt("rating"));
        		  
        		  demandes.add(demande);
        	   
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return demandes;
	}



	@Override
	public List<Demande> getAllDemands() {
		List<Demande> demandes=new ArrayList<Demande>();
		String query = "SELECT * FROM DEMANDE";
		Connection connection= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(query);
            
            ResultSet resultSet = ps.executeQuery(query);
            while(resultSet.next()) {
        	   	  Demande demande = new Demande();
        		  demande.setDem_id(resultSet.getInt("dem_id"));
        		  demande.setDemandeur_id(resultSet.getInt("demandeur_id"));
        		  demande.setDem_titre(resultSet.getString("dem_titre"));
        		  demande.setDem_ville(resultSet.getString("dem_ville"));
        		  demande.setDem_description(resultSet.getString("dem_description"));
        		  demande.setDate_debut(resultSet.getString("date_debut"));
        		  demande.setDate_fin(resultSet.getString("date_fin"));
        		  
        		  demande.setFilename(resultSet.getString("filename"));
        		  demande.setPath(resultSet.getString("path"));
        		  
        		  
        		  demande.setDem_statut(resultSet.getString("dem_statut"));
        		  demande.setDem_type(resultSet.getString("dem_type"));
        		  demande.setMontant_but(resultSet.getDouble("montant_but"));
        		  demande.setMontant_vrai(resultSet.getDouble("montant_vrai"));
        		  demande.setNbBenevoles_but(resultSet.getInt("nbBenevoles_but"));
        		  demande.setNbBenevoles_vrai(resultSet.getInt("nbBenevoles_vrai"));
        		  demande.setHeure_debut(resultSet.getString("heure_debut"));
        		  demande.setHeure_fin(resultSet.getString("heure_fin"));
        		  demande.setAdresse_benevolat(resultSet.getString("adresse_benevolat"));
        		  demande.setRating(resultSet.getInt("rating"));
        		  
        		  demandes.add(demande);
        	   
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return demandes;
	}

	 @Override
	    public boolean updateDemandeF(Demande demande) {
		 boolean rowUpdated;
		 Connection connection= SingletonConnection.getConnection();   
		 String editQuery = "UPDATE demande SET montant_vrai=montant_vrai+?, rating=rating+? WHERE dem_id=?";
	        try {
	          
	            PreparedStatement preparedStatement = connection.prepareStatement(editQuery);
	           
	            preparedStatement.setDouble(1, demande.getMontant_vrai());
	            preparedStatement.setInt(2, demande.getRating());
	            preparedStatement.setInt(3, demande.getDem_id());
	            
	            preparedStatement.executeUpdate();
	            rowUpdated=preparedStatement.executeUpdate()>0;
	            return rowUpdated ;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }
	 @Override
	    public boolean updateDemandeB(Demande demande) {
		 boolean rowUpdatedd;
		 Connection connection= SingletonConnection.getConnection();   
		 String editQuery = "UPDATE demande SET nbBenevoles_vrai=nbBenevoles_vrai+?, rating=rating+? WHERE dem_id=?";
	        try {
	          
	            PreparedStatement preparedStatement = connection.prepareStatement(editQuery);
	          
	            preparedStatement.setInt(1, demande.getNbBenevoles_vrai());
	            preparedStatement.setInt(2, demande.getRating());
	            preparedStatement.setInt(3, demande.getDem_id());
	            
	            preparedStatement.executeUpdate();
	            rowUpdatedd=preparedStatement.executeUpdate()>0;
	            return rowUpdatedd ;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }

}
