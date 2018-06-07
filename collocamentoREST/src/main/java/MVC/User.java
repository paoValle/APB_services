package MVC;

public class User {
	private String nome = "";
	private String cognome = "";
	private String cfis = "";
	private String data_nascita = "";
	private String lavoro_attuale = "";	
	private String lavoro_precedente = "";
	
	public User(){
		cfis="";
	}
	
	public User(String nome, String cognome, String cfis, String data_nascita, String lavoro_attuale,
			String lavoro_precedente) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cfis = cfis;
		this.data_nascita = data_nascita;
		this.lavoro_attuale = lavoro_attuale;
		this.lavoro_precedente = lavoro_precedente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCfis() {
		return cfis;
	}
	public void setCfis(String cfis) {
		this.cfis = cfis;
	}
	public String getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(String data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getLavoro_attuale() {
		return lavoro_attuale;
	}
	public void setLavoro_attuale(String lavoro_attuale) {
		this.lavoro_attuale = lavoro_attuale;
	}
	public String getLavoro_precedente() {
		return lavoro_precedente;
	}
	public void setLavoro_precedente(String lavoro_precedente) {
		this.lavoro_precedente = lavoro_precedente;
	}
	


}
