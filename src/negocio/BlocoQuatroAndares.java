package negocio;

public class BlocoQuatroAndares extends Bloco{
	
	private static final int N_ANDARES = 4;
	private static final int N_ESPECIALIDADES = 2;
	
	public BlocoQuatroAndares(int numero) {
		super(numero);
		this.especialidade = new Especialidade[N_ESPECIALIDADES];
		this.andar = new Andar[N_ANDARES];
	}

}
