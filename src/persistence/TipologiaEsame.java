package persistence;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.*;


@Entity
public class TipologiaEsame {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String codice;
	@Column(nullable = false)
	private String nome;

	private String descrizione;
	@Column(nullable = false)
	private float costo;
	private Map<String,String> prerequisiti;
	private Set<String> indicatori;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public String getPrerequisito(String key) {
		return prerequisiti.get(key);
	}
	public void setPrerequisito(String key,String value) {
		this.prerequisiti.put(key, value);
	}
	public void setPrerequisiti() {
		this.prerequisiti = new HashMap<>();
	}
	
	public void stampaIndicatori() {
		for(String indicatore : this.indicatori)
			System.out.println(indicatore);
	}
	public void addIndicatore(String indicatore) {
		this.indicatori.add(indicatore);
	}
	
	public void setIndicatori() {
		this.indicatori = new HashSet<>();
	}



}
