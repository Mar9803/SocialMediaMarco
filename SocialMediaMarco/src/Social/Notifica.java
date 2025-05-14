package Social;

public class Notifica {
	public String NotifCommento;
	public String NotifNewFollower;
	public String NotifSeiStatoBloccato;
	public String NotiTagPost;
	public Utente Utenteagente;
	
	
	public void Notifica(Utente u) {
		this.NotifCommento = "💬" ;
		this.NotifNewFollower = "👤➕";
		this.NotifSeiStatoBloccato="🚫";
		this.NotiTagPost = "🔖";
	}
	
	
	
	// Idea: in base alla noitifca invia un popup differente:
		/*
		if("arriva un commento ad un posto") {
			u.Notifiche.add(this.NotifCommento + this.Utenteagente + "ha commentato un tuo post");
		}
		if("nuovo follower") {
			u.Notifiche.add( this.NotifNewFollower + "Un utente ha commentato un tuo post");
		}
		if("sei stato taggato ad un post") {
			u.Notifiche.add( this.NotifNewFollower + "Sei stato taggato in un post " );
			}
			
		*/
	
}