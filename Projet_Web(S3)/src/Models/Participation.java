package Models;

public class Participation {

	private int id_part;
	private int id_part_donateur;
	private int id_part_demande;
	private double montant_part;
	private int benevole_part;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getBenevole_part() {
		return benevole_part;
	}
	public void setBenevole_part(int benevole_part) {
		this.benevole_part = benevole_part;
	}
	public int getId_part() {
		return id_part;
	}
	public void setId_part(int id_part) {
		this.id_part = id_part;
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
	
	public Participation() {
		super();
	}
	@Override
	public String toString() {
		return "Participation [id_part=" + id_part + ", id_part_donateur=" + id_part_donateur + ", id_part_demande="
				+ id_part_demande + ", montant_part=" + montant_part + ", benevole_part=" + benevole_part + "]";
	}
	
	
}
