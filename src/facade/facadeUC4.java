package facade;

import persistence.*;

public class facadeUC4 {
	
	public void creaTipoEsami(/*??*/)
	{
		TipologiaEsame tipoEsame;
		tipoEsame=new TipologiaEsame();
		Clinica clinica=new Clinica();
		clinica.addTipoEsame(tipoEsame);
	}

}
