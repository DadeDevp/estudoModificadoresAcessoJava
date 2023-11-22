package Pacote1;

public class ClasseReferencia {

	//Acessado apenas pelas classes do mesmo pacote
	int modificadorDefault;
	
	//Acessado por todos
	public int modificadorPublico;
	
	//Acessado pelas classes do mesmo pacote e das subclasses
	protected int modificadorProtegido;
	
	//Acessado apenas da propria classe
	private int modificadorPrivado;
	
	public void testeAcesso() {
		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		modificadorPrivado = 0;
	}
}
