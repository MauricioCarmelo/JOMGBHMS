package negocio;

public class Bloco {

	int numero;
	Especialidade[] especialidade;	
	Andar[] andar;
	
	
	// construtor
	public Bloco(int numero) {
		this.numero = numero;
	}
	
	public Bloco() {
		
	}
	
	// getters and setters
	int getNumero() {
		return numero;
	}
	
	void setNumero(int numero) {
		this.numero = numero;
	}
	
	// metodos
	public void inserirPaciente(Paciente paciente) {
		
	}
	
	public void realocarPaciente(Paciente paciente) {
		
	}
	
	public void liberarPaciente(Paciente paciente) {
		
	}
	
	public void liberarAndar(Andar andar) {
		
	}
	
	public void excluirAndar(Andar andar) {
		
	}
	
}
