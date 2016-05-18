package facade;

import persistence.*;

public class facadeUC3 {
	
	public void consultaEsami(String codPaz){
		Clinica clinica=new Clinica();
		Paziente paziente;
		clinica.getPaziente(codPaz);
	//	paziente.stampaEsami();
		//paziente.stampaEsame(Esame esameScelto);
		
	}

}
