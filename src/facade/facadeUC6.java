package facade;

import persistence.*;

public class facadeUC6 {
	
private Clinica clinica;
	
	public facadeUC6() {
		clinica=new Clinica();
	}
	
	public void inserisciRisutatiEsami(/*???*/String codEsame){
	
		Esame esame=clinica.getEsame( codEsame);
		//??? setEsame inserisci risultati
		
	}

}
