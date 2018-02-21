package exo1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDebiterCompte {

	@Test
	void testDebiterSurNonZero() throws PasAssezDeFondsException {
		Compte c = new Compte();
		c.crediter(20);
		c.debiter(10);
		assertEquals(10,c.getSolde());
	}
	
	@Test
	void testDebiterSurZero() {
		Compte c = new Compte();
		assertThrows(PasAssezDeFondsException.class, () -> {c.debiter(10);});
	}
	
	@Test
	void testDebiterTropSurNonZero() {
		Compte c = new Compte();
		c.crediter(20);
		assertThrows(PasAssezDeFondsException.class, () -> {c.debiter(30);});
	}

}
