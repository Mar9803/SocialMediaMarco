package Social;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		//Lista iscritti
		
		
		
		
		Scanner myObjScanner = new Scanner(System.in);
		
		
		
		
		String exit = "";
		
		MySocial social = new MySocial();
		
		
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
				MySocial.IscrizioneSocial(NuovoUtente);
				System.out.println("Utente "+ Username  + " Iscritto con successo!!!");
				System.out.println("Ora Che ti sei iscritto puoi fare il login: inserisci Username");
				//Creo il ciclo: fino a quando non metti le credenziali giuste non entri.
				String Username2 = myObjScanner.nextLine();
				System.out.println("Inserisci la Password");
				String Password2 = myObjScanner.nextLine();
				if (Username2.equals(NuovoUtente.Username)  && Password2.equals(NuovoUtente.Password)) {
				//if (Username2 == Username && Password2 == Password) {
					MySocial.Loggati.add(NuovoUtente);
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
					MySocial.Loggati.add(NuovoUtente);    
					System.out.println("Accesso effettuato con successo!");
				}	
				break;
			case "2":
				//Se NuovoUtente non è iscritto:
				if (MySocial.IsIscritto(NuovoUtente) == false) {
					System.out.println("Iscriversi prima di effettuare l'accesso");
				}
				System.out.println("Inserisci il tuo Username");
				Username = myObjScanner.nextLine();
				System.out.println("Inserisci la Password");
				Password = myObjScanner.nextLine();
				//Aggiorno la var. istanza di NuovoUtente con l'input da tastiera.
				NuovoUtente.Username = Username;
				NuovoUtente.Password = Password;
				MySocial.LogIn(NuovoUtente);
				System.out.println(Username + ", accetto effettuato con successo!");
				break;
			case "exit":
				exit = "exit";
				break;
		}

	}
   
	
	
	
	
	
	
}
}