package Social;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		Scanner myObjScanner = new Scanner(System.in);
		

		// CODICE PER REGISTRAZIONE E LOGIN:
		String exit = "";
		
		MySocial social = new MySocial();
		//Utente User = new Utente("", "");
		
		while (exit != "exit") {
			System.out.println("Benvenuto nel Social:");
			System.out.println("Digita per uscire exit");
			System.out.println("Digita 1 per iscriviti");
			System.out.println("Digita 2 per fare Login");
			String Userinput = myObjScanner.nextLine();
			
			
			Utente NuovoUtente = new Utente("", "");
			String Username = "";
			String Password = "";
			switch(Userinput) {
			case "1" :  
				System.out.println("Prima di loggare iscriviti, Inserisci il tuo Username");
				Username = myObjScanner.nextLine();
				System.out.println("Inserisci la Password");
				Password = myObjScanner.nextLine();
				//Aggiorno la var. istanza di NuovoUtente con l'input da tastiera.
				NuovoUtente.Username = Username;
				NuovoUtente.Password = Password;
				social.IscrizioneSocial(NuovoUtente);
				System.out.println("Utente "+ Username  + " Iscritto con successo!!!");
				social.Iscritti.add(NuovoUtente);
				System.out.println("Ora Che ti sei iscritto puoi fare il login: inserisci Username");
				//Creo il ciclo: fino a quando non metti le credenziali giuste non entri.
				String Username2 = myObjScanner.nextLine();
				System.out.println("Inserisci la Password");
				String Password2 = myObjScanner.nextLine();
				if (Username2.equals(NuovoUtente.Username)  && Password2.equals(NuovoUtente.Password)) {
				//if (Username2 == Username && Password2 == Password) {
					social.Loggati.add(NuovoUtente);
					System.out.println("Accesso effettuato con successo!");
				} else {
					int ErroriAccesso = 0;
					while(!Username2.equals(NuovoUtente.Username) || !Password2.equals(NuovoUtente.Password)) {
						ErroriAccesso +=1;
						if(ErroriAccesso < 2) {
							System.out.println("Credenziali errate. Inserire Username");
							Username2 = myObjScanner.nextLine();
							System.out.println("Inserire Password");
							Password2 = myObjScanner.nextLine();
							}
						else {
							System.out.println("Troppi tentativi di accesso errati, riprova più tardi");
							return;
						  }
					}
					social.Loggati.add(NuovoUtente);    
					System.out.println("Accesso effettuato con successo!");
				}	
				break;
			case "2":
				//Se NuovoUtente non è iscritto:
				if (social.IsIscritto(NuovoUtente) == false) {
					System.out.println("Iscriversi prima di effettuare l'accesso");
				}
				System.out.println("Inserisci il tuo Username");
				Username = myObjScanner.nextLine();
				System.out.println("Inserisci la Password");
				Password = myObjScanner.nextLine();
				//Aggiorno la var. istanza di NuovoUtente con l'input da tastiera.
				NuovoUtente.Username = Username;
				NuovoUtente.Password = Password;
				social.LogIn(NuovoUtente);
				System.out.println(Username + ", accetto effettuato con successo!");
				break;
			case "exit":
				exit = "exit";
				break;
		}
	
	//  CODICE DEL MENU: SEGUI, SMETTI SEGUIRE, PUBBLICA POST, LOGOUT. 
	String LoggedIn = "";
	
	while(LoggedIn != "Logout") {
		System.out.println("Benvenuto nel tuo profilo di SocialMediaMArco");
		System.out.println("Cosa vuoi fare?");
		System.out.println("Digita SEGUI per seguire un nuovo follower");
		System.out.println("Digita SMETTISEGUIRE per smettere di seguire un utente");
		System.out.println("Digita POST per smettisegui per smettere di seguire un utente");
		System.out.println("Digita Logout per uscire dal tuo prfilo, exit per uscire dal Social");
		
		String sceltaTastiera = myObjScanner.nextLine();
		
		switch(sceltaTastiera) {
		case "SEGUI":
			System.out.println("Cerca l'utente che vuoi seguire");
			String DaSeguire = myObjScanner.nextLine();
				
			Utente NuovoSeguito = new Utente ("","");
			boolean trovato = false;
			for (Utente u :social.Iscritti) {
				if(u.getUsername().equals(DaSeguire)) {
					NuovoSeguito = u;  
					trovato = true;
				} 
			}
			if(trovato == true) {
				NuovoUtente.ListaSeguiti.add(NuovoSeguito);
				System.out.println("Utente " + NuovoSeguito.getUsername() + " aggiunto ai tuoi seguiti!");
			} else {
				System.out.println("Utente non trovato");
			}
			break;
			
			case "SMETTISEGUIRE":
				boolean found = false;
				String x = "";
				System.out.println("Cerca l'utente che vuoi smettere diseguire");
				String DaTogliere = myObjScanner.nextLine();
				for (Utente u: NuovoUtente.ListaSeguiti) {
					if(u.getUsername()== DaTogliere) {
						found = true;
						NuovoUtente.SmettiSeguire(u);
						x = u.getUsername();
							
					} else { System.out.println("Utente non trovato1");

					}
				}
				if(found == true) {
					System.out.println("Hai tolto" + x + "dai tuoi seguiti");
					
				}

				break;
			case "POST":
				System.out.println("A cosa stai pensando?");
				String testo = myObjScanner.nextLine();
				Post p1 = new Post("c1");
				NuovoUtente.setUnPost(p1);
				p1.setTestoPost(testo);
				System.out.println("Hai pubblicato un nuovo post sultuo feed");
				System.out.println("Digita Logout per uscire dal tuo profilo, oppure e exit per chiudere l'app");
				String uscita = myObjScanner.nextLine();
			break;
		
			case "Logout":
			break;
			// TODO: Aggiungere altre features
		}
	}
	
	
}
	}
	}
		

		
		
		
		
		
		
		
		
		
	
	
   
	
	
	
	
	
	
	
	

