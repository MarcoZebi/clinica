package facade;

import java.util.Map;


import persistence.*;

public class facadeUC3 {
	
	private Clinica clinica;
	private Paziente paziente;

	public facadeUC3() {
		clinica=new Clinica();
	}
	
	public Map<String,Esame> consultaEsami(String codPaz){
		
		
		paziente=clinica.getPaziente(codPaz);
	   return	paziente.getEsami();
		
		
	}
	public Esame getEsame(String codEsame){
		return  paziente.getEsame(codEsame);
	}

}
