import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestPaiementTicket {

	private Carte mockCarte;
	private Caisse caisse;
	private int prixRepas;
	
	@Before
	public void setUp() {
		mockCarte = Mockito.mock(Carte.class);
		caisse = new Caisse();
		prixRepas = 4;
	}
	
	@Test
	public void testNbTicketOkValeurTicketSuperieurPrixRepas() throws SoldeInsuffisantException {
		caisse.payerRepasAvecTicket(mockCarte, prixRepas);
		
		Mockito.verify(mockCarte).consommerTicket(prixRepas);
	}
	
	@Test
	public void testNbTicketNulSoldeCarteSuperieurPrixRepas() throws SoldeInsuffisantException {
		Mockito.when(mockCarte.nbTickets()).thenReturn(0);
		
		caisse.payerRepasAvecTicket(mockCarte, prixRepas);
		
		Mockito.verify(mockCarte).nbTickets();
		Mockito.verify(mockCarte).consommerTicket(prixRepas);
		Mockito.verify(mockCarte).debiter(prixRepas);
	}
	
	@Test(expected=SoldeInsuffisantException.class)
	public void testNbTicketNulSoldeCarteInferieurPrixRepas() throws SoldeInsuffisantException {
		Mockito.doThrow(SoldeInsuffisantException.class).when(mockCarte).debiter(prixRepas);
		
		caisse.payerRepasAvecTicket(mockCarte, prixRepas);
	}
	
//	@Test(expected=SoldeInsuffisantException.class)
//	public void testSoldePlusTicketInferieurAPrixRepas() {
//		Mockito.when(mockCarte.nbTickets()).thenReturn(1);
//		Mockito.when(mockCarte.valeurTicket()).thenReturn(5);
//		Mockito.when(mockCarte.solde()).thenReturn(2);
//		
//		//Mockito.doThrow(SoldeInsuffisantException.class);
//		caisse.payerRepasAvecTicket(mockCarte, 8);
//	}

}
