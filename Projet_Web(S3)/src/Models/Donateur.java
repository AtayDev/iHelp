package Models;

public class Donateur {

	private int dona_id;
	private String dona_email;
	private String dona_fname;
	private String dona_lname;
	private String dona_password;
	private String dona_ville;
	private String dona_telephone;
	
	

	public int getDona_id() {
		return dona_id;
	}
	public void setDona_id(int dona_id) {
		this.dona_id = dona_id;
	}
	public String getDona_fname() {
		return dona_fname;
	}
	public void setDona_fname(String dona_fname) {
		this.dona_fname = dona_fname;
	}
	public String getDona_lname() {
		return dona_lname;
	}
	public void setDona_lname(String dona_lname) {
		this.dona_lname = dona_lname;
	}
	public String getDona_password() {
		return dona_password;
	}
	public void setDona_password(String dona_password) {
		this.dona_password = dona_password;
	}
	public String getDona_telephone() {
		return dona_telephone;
	}
	public void setDona_telephone(String dona_telephone) {
		this.dona_telephone = dona_telephone;
	}
	public String getDona_email() {
		return dona_email;
	}
	public void setDona_email(String dona_email) {
		this.dona_email = dona_email;
	}
	public Donateur() {
		super();
		
	}
	
	public Donateur(String email, String fname, String lname, String password, String telephone, String ville) {
		dona_email=email;
		dona_fname=fname;
		dona_lname=lname;
		dona_password=password;
		dona_telephone=telephone;
		dona_ville=ville;
	}
	public Donateur(int donateur_id,String email, String password, String fname, String lname, String telephone, String ville) {
		dona_id=donateur_id;
		dona_email=email;
		dona_password=password;
		dona_fname=fname;
		dona_lname=lname;
		dona_telephone=telephone;
		dona_ville=ville;
	}
	
	public String getDona_ville() {
		return dona_ville;
	}
	public void setDona_ville(String dona_ville) {
		this.dona_ville = dona_ville;
	}

	
}
