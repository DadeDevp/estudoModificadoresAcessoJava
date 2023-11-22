package Pacote2;

import Pacote1.ClasseReferencia;

public class SubClasseReferencia extends ClasseReferencia {
	
	public void testeAcesso() {
			
		modificadorPublico = 0;
		modificadorProtegido = 0;
		
		/*
		As variaveis abaixo nao sao acessiveis por uma classe filha de outro pacote
		modificadorDefault = 0;
		modificadorPrivado = 0;
		*/
	}
}
