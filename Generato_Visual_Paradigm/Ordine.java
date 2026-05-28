package Generato_Visual_Paradigm;

public class Ordine {

	Cliente cliente;
	Indirizzo indirizzoDiConsegna;
	RigaCarrelloVirtuale[] rigaCarrelloVirtuale;
	Notifica notifica;
	private String stato;

	public String getStato() {
		return this.stato;
	}

	/**
	 * 
	 * @param stato
	 */
	public void setStato(String stato) {
		this.stato = stato;
	}

}