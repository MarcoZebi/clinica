package persistence;

import java.util.Map;

import javax.persistence.*;



public class Clinica {

	
	
	private  final String nome="Clinica Privata";
	

	private Map<String,TipologiaEsame> tipologieDiEsami;
	
	
	private Map<String,Paziente> anagraficaPazienti;

	
	private Map<String,Medico> medici;
	
	
	private Map<String,Amministratore> amministratori;


	public Map<String, TipologiaEsame> getTipologieDiEsami() {
		return tipologieDiEsami;
	}

	public void setTipologieDiEsami(Map<String, TipologiaEsame> tipologieDiEsami) {
		this.tipologieDiEsami = tipologieDiEsami;
	}

	public TipologiaEsame getTipologiaDiEsame(String key){
		return this.tipologieDiEsami.get(key);
	}

	public Map<String, Paziente> getAnagraficaPazienti() {
		return anagraficaPazienti;
	}
	public void setAnagraficaPazienti(Map<String, Paziente> anagraficaPazienti) {
		this.anagraficaPazienti = anagraficaPazienti;
	}


	public Paziente getPaziente(String key){
		return this.anagraficaPazienti.get(key);
	}


	public Map<String, Medico> getMedici() {
		return medici;
	}
	public void setMedici(Map<String, Medico> medici) {
		this.medici = medici;
	}



	public Medico getMedico(String key){
		return this.medici.get(key);
	}


	public Map<String, Amministratore> getAmministratori() {
		return amministratori;
	}
	public void setAmministratori(Map<String, Amministratore> amministratori) {
		this.amministratori = amministratori;
	}


	public Amministratore getAmministratore(String key){
		return this.amministratori.get(key);
	}

	public String getNome() {
		return nome;
	}





}
