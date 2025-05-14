package Social;

import java.util.ArrayList;

public class Utente implements RelazioniUtenti{
	protected ArrayList<Utente> ListaFollower;
	protected ArrayList<Utente> ListaSeguiti;
	protected String Username;
	protected String Password;
	protected int Nfollower;
	protected int Nseguiti;
	protected  int SegnalazRicevute = 0;
	
	protected ArrayList<String> Notifiche;
	
	
		
	
	public Utente(String Username, String Password) {
		this.Username = Username;
		this.Password = Password;
		this.ListaFollower = new ArrayList<Utente>();
	    this.ListaSeguiti = new ArrayList<Utente>();
	}
	
	
	//Metodi: Interazioni utenti
	public void SeguiUtente(Utente nuovoSeguito) {
		this.ListaSeguiti.add(nuovoSeguito);
		nuovoSeguito.ListaFollower.add(this);
		this.Nseguiti += 1;
		nuovoSeguito.Nfollower += 1;
		System.out.println(this.Username + " ha iniziato a seguire " + nuovoSeguito.getUsername());
	}
 
	public void SmettiSeguire(Utente userTogliere) {
		this.ListaSeguiti.remove(userTogliere);
		this.Nseguiti -= 1;
		userTogliere.ListaFollower.remove(this);
		userTogliere.Nfollower -= 1;
		System.out.println("hai smesso di seguire" + userTogliere.getUsername());
	}

	
	
	// Metodi interfaccia Azioni Post Utenti: mettiLike(), commenta(); segnala(); blocca();
	
	

	public void segnala(String codePost) {
		this.SegnalazRicevute += 1 ;
	};
	
	public void segnalaUtente(Utente u) {
		u.SegnalazRicevute += 1 ;
	};
	
	
	
	public void blocca(String codePost) {
		if (SegnalazRicevute > 3) {
			System.out.println("L'utente verrà bloccato");
		}
		else System.out.println("l'utente non ha ricevuto abastanza segnalazioni");
	} 

	

	
	
	
	
	
	
	//getters and setters
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getNfollower() {
		return Nfollower;
	}

	public void setNfollower(int nfollower) {
		Nfollower = nfollower;
	}

	public int getNseguiti() {
		return Nseguiti;
	}

	public void setNseguiti(int nseguiti) {
		Nseguiti = nseguiti;
	}


}
