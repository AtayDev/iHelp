package DAO.interfaces;


import Models.Donateur;

public interface IDonateur {
	 public Donateur insertDonnateur(Donateur donateur);
	 public boolean Check_login_dona(Donateur donateur);
	 boolean updateDonnateur(Donateur donateur);
	 Donateur getDonateurById(int id);
}
