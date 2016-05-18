package facade;


import persistence.*;

public class facadeUC2 {

	Clinica clinica=new Clinica();

	public void creaEsame(String codTipoEsame,String codPaz,String codMed){
		Medico medico;
		TipologiaEsame tipoEsame;
		Paziente paziente;
		medico=clinica.getMedico(codMed);
		paziente=clinica.getPaziente(codPaz);
		tipoEsame=clinica.getTipologiaDiEsame(codTipoEsame);
		
		Esame esame=new Esame();
		esame.setMedico(medico);
		esame.setPaziente(paziente);
		esame.setTipo(tipoEsame);
		
		paziente.addEsame(esame);
		medico.addEsame(esame);
		
	}

}
