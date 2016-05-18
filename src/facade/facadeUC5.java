package facade;

import java.util.Map;

import persistence.*;

public class facadeUC5 {
	
private Clinica clinica;
	
	public facadeUC5() {
		clinica=new Clinica();
	}
	

	public Map<String,Esame> esamiEffettuatiMedico(String nome,String cognome){
		
		Medico medico;
		medico=clinica.getMedico(nome,cognome);
		return medico.getEsami();
		
	}
}
