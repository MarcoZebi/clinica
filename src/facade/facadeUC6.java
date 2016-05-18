package facade;

import persistence.*;

public class facadeUC6 {
	
	public void inserisciRisutatiEsami(/*???*/String codEsame){
		Clinica clinica=new Clinica();
		Esame esame=clinica.getEsame( codEsame);
		//??? setEsame inserisci risultati
		
	}

}
