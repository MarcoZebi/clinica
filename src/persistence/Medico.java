package persistence;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@Entity
public class Medico {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private String specializzazione;
	
	@OneToMany(mappedBy = "medico")
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

	public void getEsame(String key)
	{
		this.esami.get(key);
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
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
}
