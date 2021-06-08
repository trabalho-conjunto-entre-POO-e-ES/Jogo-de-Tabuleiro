import java.util.ArrayList;

public class CartaNormal extends Carta {

	// ATRIBUTOS
	Carta carta = new Carta();

	// ACESSORES



	// CONSTRUTOR - DEFAULT
		public CartaNormal(){
			
		}

	// CONTRUTOR - COM PARAMETROS
	public CartaNormal(Carta carta) {
		super();
		this.carta = carta;
	}
	// CONSTRUTOR - COPIA

	// COMPORTAMENTOS
	public int comparar(Carta carta) {
		if(this.nivel < carta.nivel) {
		return -1;
		}else {
			if(this.nivel == carta.nivel){
				return 0;
			}else {
			return 1;
			}
		}
	}

	// COMPLEMENTARES
}
