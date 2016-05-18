package facade;

import persistence.*;

public class facadeUC5 {

	public void esamiEffettuatiMedico(String nome,String cognome){
		Clinica clinica=new Clinica();
		Medico medico;
		medico=clinica.getMedico(nome,cognome);
		//medico.stampaEsami();
		
	}
}
