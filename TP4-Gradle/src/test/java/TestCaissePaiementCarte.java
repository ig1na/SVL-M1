import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestCaissePaiementCarte {

	Carte carteMock;
	Caisse caisse;
	@Before
	public void setUp() throws Exception {
	    MockitoAnnotations.initMocks(this);
	    carteMock = Mockito.mock(Carte.class);
	}
	
	@Test(expected=SoldeInsuffisantException.class)
	public void testPayerCarteSoldeInsuffisant() throws SoldeInsuffisantException {
		caisse = new Caisse();
		
		Mockito.doThrow(new SoldeInsuffisantException()).when(carteMock).debiter(20);
		caisse.payerRepasSansTicket(carteMock, 20);
	}
	
	@Test
	public void testPayerCarteSoldeOk() throws SoldeInsuffisantException {
		caisse = new Caisse();
		caisse.payerRepasSansTicket(carteMock, 20);
		
		Mockito.verify(carteMock).debiter(20);
	}

}
