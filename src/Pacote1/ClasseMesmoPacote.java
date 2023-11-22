package Pacote1;

public class ClasseMesmoPacote {

	public void testeAcesso() {
		ClasseReferencia r = new ClasseReferencia();
		
		r.modificadorPublico = 0;
		r.modificadorDefault = 0;
		r.modificadorProtegido = 0;
		
		//as variaveis abaixo nao sao acessiveis em uma classe do mesmo pacote		 
		//	r.modificadorPrivado = 0;
	}
}
