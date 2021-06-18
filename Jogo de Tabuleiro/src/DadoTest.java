import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DadoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDado() {

		Dado gabriel = new Dado(6);
		assertEquals(6, gabriel.getLados(), "Constrói um dado com 6 lados");

		assertThrows(IllegalArgumentException.class, () -> {
			new Dado(8);

		}, "Não pode construir um Dado com lados diferentes de 6");
	}

	void testLancar() {
		int lados = 6;

		Dado gabriel = new Dado(lados);
		assertEquals(gabriel.getLados(), lados);
		
	}

	void testLancamento() {
		int lados = 6;

		Dado gabriel = new Dado(lados);
		assertEquals(gabriel.getLados(), lados);
		
	}

}
