package exo1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCompteCrediter {

	Compte c;
	
	@Test
	void testCrediterSurCompteZero() {
		c = new Compte();
		c.crediter(10);
		assertEquals(10, c.getSolde());
	}
	
	@Test
	void testCrediterSurCompteNonZero() {
		c = new Compte();
		c.crediter(10);
		c.crediter(5);
		assertEquals(15, c.getSolde());
	}

}
