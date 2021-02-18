package Models;

public class ParticipationF {
	private int id_part_f;
	private int id_part_donateur;
	private int id_part_demande;
	private double montant_part;
	

	public ParticipationF(int donateur_id, int reference, double montant) {
		id_part_donateur=donateur_id;
		id_part_demande=reference;
		montant_part=montant;
	}
	
	public int getId_part_donateur() {
		return id_part_donateur;
	}
	public void setId_part_donateur(int id_part_donateur) {
		this.id_part_donateur = id_part_donateur;
	}
	public int getId_part_demande() {
		return id_part_demande;
	}
	public void setId_part_demande(int id_part_demande) {
		this.id_part_demande = id_part_demande;
	}
	public double getMontant_part() {
		return montant_part;
	}
	public void setMontant_part(double montant_part) {
		this.montant_part = montant_part;
	}
	public ParticipationF() {
		super();
	
	}

	public int getId_part_f() {
		return id_part_f;
	}

	public void setId_part_f(int id_part_f) {
		this.id_part_f = id_part_f;
	}
	
}
