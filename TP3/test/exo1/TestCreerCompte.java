package exo1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCreerCompte {

	@Test
	void testInitialementAZero() {
		Compte c = new Compte();
		assertEquals(0, c.getSolde());
	}

}
