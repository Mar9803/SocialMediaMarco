package Social;

import java.util.ArrayList;

public class Post implements AzioniPostUtenti{
	protected String codePost;
	protected ArrayList<Commento> comm;
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


	
	
	
	
	
	
	
	
	
	
	
	
		
	}