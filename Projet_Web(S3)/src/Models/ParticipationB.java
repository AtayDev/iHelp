package Models;

public class ParticipationB {
	private int id_part_b;
	private int id_part_donateur;
	private int id_part_demande;
	private int benevole_part;
	
	public ParticipationB(int donateur_id, int reference, int benevolat) {
		id_part_donateur=donateur_id;
		id_part_demande=reference;
		benevole_part=benevolat;
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
	public int getBenevole_part() {
		return benevole_part;
	}
	public void setBenevole_part(int benevole_part) {
		this.benevole_part = benevole_part;
	}
	public ParticipationB() {
		super();
		
	}

	public int getId_part_b() {
		return id_part_b;
	}

	public void setId_part_b(int id_part_b) {
		this.id_part_b = id_part_b;
	}
	
}
