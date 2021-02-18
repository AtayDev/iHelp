package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.SingletonConnection;
import DAO.interfaces.IParticipation;
import Models.Demande;
import Models.ParticipationB;
import Models.ParticipationF;

public class ParticipationImpl implements IParticipation {

	@Override
	public ParticipationF insertParticipationF(ParticipationF partf) {
		
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO ParticipationF(id_part_donateur,id_part_demande,montant_part) values (?,?,?)");
	         ps.setInt(1,partf.getId_part_donateur());
	         ps.setInt(2,partf.getId_part_demande());
	         ps.setDouble(3,partf.getMontant_part());
	        
	         
	        
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_part_f) AS MAX_ID FROM PARTICIPATIONF");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 partf.setId_part_f(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return partf;
		
	}

	@Override
	public ParticipationB insertParticipationB(ParticipationB partb) {

		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO ParticipationB(id_part_donateur,id_part_demande,benevole_part) values (?,?,?)");
	         ps.setInt(1,partb.getId_part_donateur());
	         ps.setInt(2,partb.getId_part_demande());
	         ps.setInt(3,partb.getBenevole_part());
	         
	        
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_part_b) AS MAX_ID FROM PARTICIPATIONB");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 partb.setId_part_b(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return partb;
	}

	@Override
	public List<ParticipationF> getAllParticipationF(int dona_id) {
		List<ParticipationF> partsF=new ArrayList<ParticipationF>();
		String query = "SELECT * FROM PARTICIPATIONF WHERE id_part_donateur=" + dona_id;
		Connection connection= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(query);
            
            ResultSet resultSet = ps.executeQuery(query);
            while(resultSet.next()) {
      	   	  ParticipationF partf = new ParticipationF();
      	   	  partf.setId_part_f(resultSet.getInt("id_part_f"));
      	   	  partf.setMontant_part(resultSet.getDouble("montant_part"));
      	   	  
      	   	  partsF.add(partf);
            }
		}catch (SQLException e) {
                e.printStackTrace();
        }
        return partsF;
            

	}

	@Override
	public List<ParticipationB> getAllParticipationB(int dona_id) {
		
		List<ParticipationB> partsB=new ArrayList<ParticipationB>();
		String query = "SELECT * FROM PARTICIPATIONB WHERE id_part_donateur=" + dona_id;
		Connection connection= SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(query);
            
            ResultSet resultSet = ps.executeQuery(query);
            while(resultSet.next()) {
      	   	  ParticipationB partb = new ParticipationB();
      	   	  partb.setId_part_b(resultSet.getInt("id_part_b"));
      	   	  partb.setBenevole_part(resultSet.getInt("benevole_part"));
      	   	  
      	   	  partsB.add(partb);
            }
		}catch (SQLException e) {
                e.printStackTrace();
        }
        return partsB;
            
		
	}

}
