package DAO.interfaces;

import java.util.List;

import Models.Demande;

public interface IDemande {
	public Demande insertDemande(Demande demande);
	List<Demande> getAllDemandsOfAssociation(int ass_id);
	List<Demande> getAllDemands();
	boolean updateDemandeF(Demande demande);
	boolean updateDemandeB(Demande demande);
	List<Demande> getDemandeByType(String type);
	List<Demande> getDemandeByStatut(String statut);
	List<Demande> getDemandeByRating();
	List<Demande> getDemandeByVille(String ville);
}
