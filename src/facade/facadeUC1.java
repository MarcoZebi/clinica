package facade;

import java.util.Map;

import persistence.Clinica;
import persistence.TipologiaEsame;

public class facadeUC1 {

	private Clinica clinica;

	public facadeUC1() {
		clinica=new Clinica();
	}



	public Map<String,TipologiaEsame> consultaOfferta(){
		return clinica.getTipologieDiEsami();

	}



	public TipologiaEsame stampaTipoEsame(String codice){



		return clinica.getTipologiaDiEsame(codice);


	}


}
