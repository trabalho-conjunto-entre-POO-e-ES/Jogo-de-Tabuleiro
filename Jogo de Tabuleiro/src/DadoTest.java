import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DadoTest {

	@Test
	void testLançar() {
		Dado dado = new Dado(); 
		
		for (int i = 0 ; i<6; i++) {
			dado.lancar();
			System.out.println(dado.equals(dado));
		}
		
		fail("Not yet implemented");
	}

}
