package Models;

public class Demande {
	private int dem_id;
	private int demandeur_id;
	private String dem_titre;
	private String dem_ville;
	private String dem_description;
	private String date_debut;
	private String date_fin;
	private String dem_statut;
	private String dem_type;
	private double montant_but;
	private double montant_vrai;
	private int nbBenevoles_but;
	private int nbBenevoles_vrai;
	private String heure_debut;
	private String heure_fin;
	private String adresse_benevolat;
	private int rating;
	
	//new Attributes:
	
	private String filename;
	private String path;
	
	private double x;
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Demande(int demandeur_id,String dem_titre, String dem_ville, String dem_description, String date_debut,
			String date_fin, String filename,String path, String dem_statut, String dem_type, String adresseBenevolat, double montant_but,
			int nbBenevoles_but, String heure_debut,String heure_fin, String adresse_benevolat) {
		super();
		this.demandeur_id=demandeur_id;
		this.dem_titre = dem_titre;
		this.dem_ville = dem_ville;
		this.dem_description = dem_description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.filename=filename;
		this.path=path;
		this.dem_statut = dem_statut;
		this.dem_type = dem_type;
		this.montant_but = montant_but;
		this.nbBenevoles_but = nbBenevoles_but;
		this.heure_debut = heure_debut;
		this.heure_fin=heure_fin;
		this.adresse_benevolat = adresse_benevolat;
	}





	

	



	public Demande(double montant, int rating2, int reference) {
		montant_vrai=montant;
		rating=rating2;
		dem_id=reference;
		
	}

	public Demande(int benevolat, int rating2, int reference,double x) {
		nbBenevoles_vrai=benevolat;
		rating=rating2;
		dem_id=reference;
		this.x=x;
	}



	public int getDem_id() {
		return dem_id;
	}
	public void setDem_id(int dem_id) {
		this.dem_id = dem_id;
	}
	public int getDemandeur_id() {
		return demandeur_id;
	}
	public void setDemandeur_id(int demandeur_id) {
		this.demandeur_id = demandeur_id;
	}
	public String getDem_titre() {
		return dem_titre;
	}
	public void setDem_titre(String dem_titre) {
		this.dem_titre = dem_titre;
	}
	public String getDem_ville() {
		return dem_ville;
	}
	public void setDem_ville(String dem_ville) {
		this.dem_ville = dem_ville;
	}
	public String getDem_description() {
		return dem_description;
	}
	public void setDem_description(String dem_description) {
		this.dem_description = dem_description;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	/*
	 * public String getDem_image() { return dem_image; } public void
	 * setDem_image(String dem_image) { this.dem_image = dem_image; }
	 */
	public String getDem_statut() {
		return dem_statut;
	}
	public void setDem_statut(String dem_statut) {
		this.dem_statut = dem_statut;
	}
	public String getDem_type() {
		return dem_type;
	}
	public void setDem_type(String dem_type) {
		this.dem_type = dem_type;
	}
	public double getMontant_but() {
		return montant_but;
	}
	public void setMontant_but(double montant_but) {
		this.montant_but = montant_but;
	}
	public double getMontant_vrai() {
		return montant_vrai;
	}
	public void setMontant_vrai(double montant_vrai) {
		this.montant_vrai = montant_vrai;
	}
	public int getNbBenevoles_but() {
		return nbBenevoles_but;
	}
	public void setNbBenevoles_but(int nbBenevoles_but) {
		this.nbBenevoles_but = nbBenevoles_but;
	}
	public int getNbBenevoles_vrai() {
		return nbBenevoles_vrai;
	}
	public void setNbBenevoles_vrai(int nbBenevole_vrai) {
		this.nbBenevoles_vrai = nbBenevole_vrai;
	}
	public String getHeure_debut() {
		return heure_debut;
	}
	public void setHeure_debut(String heure_debut) {
		this.heure_debut = heure_debut;
	}
	public String getAdresse_benevolat() {
		return adresse_benevolat;
	}
	public void setAdresse_benevolat(String adresse_benevolat) {
		this.adresse_benevolat = adresse_benevolat;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public String getFilename() {
		return filename;
	}



	public void setFilename(String filename) {
		this.filename = filename;
	}



	public String getHeure_fin() {
		return heure_fin;
	}



	public void setHeure_fin(String heure_fin) {
		this.heure_fin = heure_fin;
	}
	
}
