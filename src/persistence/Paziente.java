package persistence;

import java.util.HashSet;
import java.util.Map;

import javax.persistence.*;

import java.util.*;

@Entity

public class Paziente {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "paziente")
	private Map<String,Esame> esami;

	public Map<String,Esame> getEsami() {
		return esami;
	}
	public void setEsami() {
		this.esami = new HashMap<>();
	}

	public void addEsame(Esame e)
	{
		this.esami.put(e.getCodice(),e);
	}

	public Esame getEsame(String key)
	{
		return this.esami.get(key);
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
