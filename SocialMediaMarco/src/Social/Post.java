package Social;

import java.util.ArrayList;

public class Post implements AzioniPostUtenti{
	protected String codePost;
	protected ArrayList<Commento> comm;
	protected String testoPost;
	protected int Nlikes;
	protected int Segnalazioni;
	protected int NPostSegnalati;
	protected Utente Username;
	   
	  
	public Post(String codePost) {
		this.codePost = codePost;
		}

	
	//Metodi interfaccia AzioniPostUtenti:
	
	public void commenta(Commento c) {
		comm.add(c); 
		
	}
	
	public void mettiLike() {
		this.Nlikes +=1;
		
	}
	
	
	public void segnala(String codePost) {
		this.codePost = codePost;
		this.Segnalazioni +=1;
	}
	
	public void blocca(String codePost) {
		this.codePost = codePost;
		if (Segnalazioni > 3) {
			System.out.println("Il post " + this.codePost + "verrà bloccato");
			this.codePost= "Post bloccato";
		}
	}

	
	
	
// GETTERS AND SETTERS:
	public String getCodePost() {
		return codePost;
	}


	public void setCodePost(String codePost) {
		this.codePost = codePost;
	}


	public ArrayList<Commento> getComm() {
		return comm;
	}


	public void setComm(ArrayList<Commento> comm) {
		this.comm = comm;
	}


	public String getTestoPost() {
		return testoPost;
	}


	public void setTestoPost(String testoPost) {
		this.testoPost = testoPost;
	}


	public int getNlikes() {
		return Nlikes;
	}


	public void setNlikes(int nlikes) {
		Nlikes = nlikes;
	}


	public int getSegnalazioni() {
		return Segnalazioni;
	}


	public void setSegnalazioni(int segnalazioni) {
		Segnalazioni = segnalazioni;
	}


	public int getNPostSegnalati() {
		return NPostSegnalati;
	}


	public void setNPostSegnalati(int nPostSegnalati) {
		NPostSegnalati = nPostSegnalati;
	}


	public Utente getUsername() {
		return Username;
	}


	public void setUsername(Utente username) {
		Username = username;
	}


	
		
	}