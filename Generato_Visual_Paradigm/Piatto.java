package Generato_Visual_Paradigm;

public class Piatto {

	private String nomePiatto;
	private StringBuilder descrizione;
	private int prezzo;

	public String getNomePiatto() {
		return this.nomePiatto;
	}

	/**
	 * 
	 * @param nomePiatto
	 */
	public void setNomePiatto(String nomePiatto) {
		this.nomePiatto = nomePiatto;
	}

	public StringBuilder getDescrizione() {
		return this.descrizione;
	}

	/**
	 * 
	 * @param descrizione
	 */
	public void setDescrizione(StringBuilder descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return this.prezzo;
	}

	/**
	 * 
	 * @param prezzo
	 */
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

}