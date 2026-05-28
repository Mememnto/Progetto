package Generato_Visual_Paradigm;

public abstract class Utente {

	Indirizzo indirizzo;
	private String nome;
	private String cognome;
	private String email;
	private String ruolo;

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public String getRuolo() {
		return this.ruolo;
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param email
	 */
	public void Register(String nome, String cognome, String email) {
		// TODO - implement Utente.Register
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param email
	 */
	public abstract int Accedi(String nome, String cognome, String email);

}