package DAO.interfaces;

import Models.Association;



public interface IAssociation {
	  public Association insertAssociation(Association association);
	  public boolean Check_login_ass(Association ass);
	  boolean updateAssociation(Association ass);
	  Association getAssociationById(int id);

	  //Add method to delete Association
	  public boolean deleteAssociation(int id);
}
