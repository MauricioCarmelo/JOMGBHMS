package negocio;

public class Hospital {
	
	public static Hospital hospital;
	
	private Hospital() {
		// aqui os dados iniciais são carregados
		
		// carregar valores do banco e etc..
	}
	
	public static Hospital getInstance() {
		if(hospital == null) {
			hospital = new Hospital();
		}
		return hospital;
	}

	
	
}
