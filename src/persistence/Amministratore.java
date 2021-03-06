package persistence;

import javax.persistence.*;

@Entity
public class Amministratore {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String nome;
	private String cognome;
	@Column(nullable = false)
	private String password;
	

	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
