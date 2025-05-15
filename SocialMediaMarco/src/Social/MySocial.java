package Social;

import java.util.ArrayList;

public class MySocial {
	public  ArrayList<Utente> Iscritti;
	public  ArrayList<Utente> Loggati;
	public  ArrayList<Utente> BannatiDalSocial;
	
	
	
	// Costruttore inizializza le liste
	public MySocial() {
		this.Iscritti = new ArrayList<>();
		this.BannatiDalSocial = new ArrayList<>();
		this.Loggati = new ArrayList<>(); 
		
	}
	public void IscrizioneSocial(Utente u) {
		Iscritti.add(u);
		
	} 
	
	public boolean IsIscritto(Utente u) {
		return Iscritti.contains(u);
	}
	
	public void LogIn(Utente u) {
		Loggati.add(u);
		
	}
	
	
	
	
	

}
