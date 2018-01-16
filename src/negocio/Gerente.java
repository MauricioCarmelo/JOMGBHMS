package negocio;

public class Gerente extends Usuario{
	
	// construtor
	public Gerente(String nome, String senha) {
		super(nome, senha);
	}
	
	public Gerente(String nome) {
		super(nome);
	}
	
	// metodos
	public void criarQuarto(Andar andar, int numeroLeitos) {
		
	}
	
	
	public void alterarQuartos(Quarto quarto, int numeroLeitos) {
		//alterar a quantidade de leitos em um quarto
		
	}
	
	public void excluirQuarto(Quarto quarto) {
		
	}

}
