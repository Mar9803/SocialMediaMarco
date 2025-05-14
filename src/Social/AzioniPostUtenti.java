package Social;

public interface AzioniPostUtenti {
	void mettiLike();
	void commenta(Commento c);
	void segnala(String codePost);
	void blocca(String codePost);

}
