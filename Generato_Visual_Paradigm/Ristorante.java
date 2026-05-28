package Generato_Visual_Paradigm;

public class Ristorante {

	Ristoratore RistoratoreResponsabile;
	Data[] orariApertura;
	Piatto[] Menu;
	Ordine[] OrdiniRicevuti;
	Indirizzo IndirizzoRistorante;
	private String nome;
	private StringBuilder descrizione;
	private Indirizzo indirizzoRistorante;

	/**
	 * 
	 * @param ristorante
	 * @param Menu
	 */
	public int CreaMenu(Ristorante ristorante, Piatto Menu) {
		// TODO - implement Ristorante.CreaMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ristorante
	 * @param Menu
	 */
	public void ModificaMenu(Ristorante ristorante, Piatto Menu) {
		// TODO - implement Ristorante.ModificaMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ristorante
	 * @param Menu
	 */
	public void VisualizzaMenu(Ristorante ristorante, Piatto Menu) {
		// TODO - implement Ristorante.VisualizzaMenu
		throw new UnsupportedOperationException();
	}

	public String getNome() {
		return this.nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
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

	public Indirizzo getIndirizzoRistorante() {
		return this.indirizzoRistorante;
	}

	/**
	 * 
	 * @param indirizzoRistorante
	 */
	public void setIndirizzoRistorante(Indirizzo indirizzoRistorante) {
		this.indirizzoRistorante = indirizzoRistorante;
	}

}