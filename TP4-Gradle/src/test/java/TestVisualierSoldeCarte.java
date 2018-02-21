import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class TestVisualierSoldeCarte {
	
	@Test
	public void testSoldePositif() {
		Carte mockCarte = Mockito.mock(Carte.class);
		Caisse caisse = new Caisse();
		
		Mockito.when(mockCarte.solde()).thenReturn(20);
		
		assertEquals(20, caisse.afficheSolde(mockCarte));
	}
}
