package negocio;

import java.util.Date;

public class Operador extends Usuario {
	
	// construtor
	public Operador(String nome, String senha) {
		super(nome, senha);
	}
	
	public Operador(String nome) {
		super(nome);
	}
	
	// metodos
	public long cadastrarPaciente(String nome, char sexo, Date nascimento, String RG) {
		
	}
	
	public boolean internar(Paciente paciente, Doenca doenca) {
		
	}
}
