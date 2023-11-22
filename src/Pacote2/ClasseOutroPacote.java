package Pacote2;

import Pacote1.ClasseReferencia;

public class ClasseOutroPacote {

	public void testeAcesso() {
		ClasseReferencia r = new ClasseReferencia();
		
		r.modificadorPublico = 0;
		
		/* as variaveis abaixo nao sao acessiveis em uma classe de outro pacote
			r.modificadorDefault = 0;
			r.modificadorProtegido = 0;
			r.modificadorPrivado = 0;
		*/
	}
}
