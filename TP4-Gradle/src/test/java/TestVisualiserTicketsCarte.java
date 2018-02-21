import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TestVisualiserTicketsCarte {

	@Test
	public void testNbTicketsPositif() {
		Carte mockCarte = Mockito.mock(Carte.class);
		Caisse caisse = new Caisse();
		
		Mockito.when(mockCarte.nbTickets()).thenReturn(3);
		
		assertEquals(3, caisse.afficheNbTickets(mockCarte));
	}
	
	@Test
	public void testValeurTicket() {
		Carte mockCarte = Mockito.mock(Carte.class);
		Caisse caisse = new Caisse();
		
		Mockito.when(mockCarte.valeurTicket()).thenReturn(7);
		
		assertEquals(7, caisse.afficheValeurTicket(mockCarte));
	}

}
