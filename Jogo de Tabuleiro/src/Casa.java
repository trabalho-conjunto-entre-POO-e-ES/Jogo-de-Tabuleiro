public class Casa {
	public enum Cor{
		
		vermelho,
		laranja,
		amarelo;
		
	}
	//ATRIBUTOS
	Cor cor;
	int numero;


	//ACESSORES
	public Cor getCor() {
		return cor;
	}


	public int getNumero() {
		return numero;
	}

	//CONSTRUTOR - DEFAULT
	public Casa() {
		
	}

	//CONTRUTOR - COM PARAMETROS
	public Casa(Casa.Cor cor, int numero) {
		super();
		this.cor = cor;
		this.numero = numero;
	}



	//CONSTRUTOR - COPIA

	//COMPORTAMENTOS

	//COMPLEMENTARES
}
