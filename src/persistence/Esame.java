package persistence;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;



@Entity
public class Esame {
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String codice;
	
    @OneToOne
	private TipologiaEsame tipo;
    @ManyToOne
    private Paziente paziente;
    @ManyToOne
    private Medico medico;
	private Map<String,String> risultati;
	@Temporal(TemporalType.DATE)
	private Date data;
	


	public Esame(Medico medico, Paziente paziente, TipologiaEsame tipoEsame) {
		this.medico=medico;
		this.paziente=paziente;
		this.tipo=tipoEsame;
	}
	public Map<String, String> getRisultati() {
		return risultati;
	}
	public void setRisultati(Map<String, String> risultati) {
		this.risultati = risultati;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public TipologiaEsame getTipo() {
		return tipo;
	}
	public void setTipo(TipologiaEsame tipo) {
		this.tipo = tipo;
	}
	public Paziente getPaziente() {
		return paziente;
	}
	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setRisultati() {
		this.risultati = new HashMap<>();
	}

	public void addRisultato(String key,String value){
		this.risultati.put(key, value);
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}


}
