package Social;

import java.util.ArrayList;

public class MySocial {
	public static ArrayList<Utente> Iscritti;
	public static ArrayList<Utente> Loggati;
	public static ArrayList<Utente> BannatiDalSocial;
	
	
	
	// Costruttore inizializza le liste
	public MySocial() {
		this.Iscritti = new ArrayList<>();
		this.BannatiDalSocial = new ArrayList<>();
		this.Loggati = new ArrayList<>(); 
		
	}
	public static void IscrizioneSocial(Utente u) {
		Iscritti.add(u);
		
	} 
	
	public static boolean IsIscritto(Utente u) {
		return Iscritti.contains(u);
	}
	
	public static void LogIn(Utente u) {
		Loggati.add(u);
		
	}
	
	
	
	
	

}
