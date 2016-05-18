package facade;

import persistence.*;

public class facadeUC4 {
	
	private Clinica clinica;
	
	public facadeUC4() {
		clinica=new Clinica();
	}
	
	public void creaTipoEsame(/*??*/)
	{
		TipologiaEsame tipoEsame;
		tipoEsame=new TipologiaEsame();
		//????? settalo
		
		clinica.addTipoEsame(tipoEsame);
	}

}
