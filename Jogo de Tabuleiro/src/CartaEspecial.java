
import java.util.Random;

public class CartaEspecial extends Carta {


	// ATRIBUTOS
	private String capacidade = "buff";

	// ACESSORES
		public String getCapacidade() {
		return capacidade;
	}



	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	// CONSTRUTOR - DEFAULT

	public CartaEspecial() {

	}
	

	// CONTRUTOR - COM PARAMETROS
	public CartaEspecial(String capacidade) {
		super();
		this.capacidade = capacidade;
	}
	

	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	public int buffDebuff (Carta carta) {
		Random rand = new Random();
		int rand_int = rand.nextInt(1);
		if(rand_int == 0) {
			
		}
		
		
		
		
		
		
		
		return 0;
	}
	
	
	
	
	public int comparar(Carta carta) {
		if(this.getNivel() < carta.getNivel()) {
		return -1;
		}else {
			if(this.getNivel() == carta.getNivel()){
				return 0;
			}else {
			return 1;
			}
		}
	}

	// COMPLEMENTARES
	@Override
	public String toString() {
		return "CartaEspecial [capacidade=" + capacidade + "]";
	}

}