package facade;


import persistence.*;

public class facadeUC2 {

	private Clinica clinica;

	public facadeUC2() {
		clinica=new Clinica();
	}

	public void creaEsame(String codTipoEsame,String codPaz,String codMed){
		Medico medico;
		TipologiaEsame tipoEsame;
		Paziente paziente;
		medico=clinica.getMedico(codMed);
		paziente=clinica.getPaziente(codPaz);
		tipoEsame=clinica.getTipologiaDiEsame(codTipoEsame);
		
		Esame esame=new Esame(medico,paziente,tipoEsame);
		
		paziente.addEsame(esame);
		medico.addEsame(esame);
		
	}

}
