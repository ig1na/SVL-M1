import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFiltreMsg {

	private MsgParser parser;
	private LogMsg msg1, msg2, msg3;
	private Filtre filtre;
	
	@Before
	public void setUp() throws Exception {
		filtre = new Filtre();
	}

	@Test
	public void testKeepOneMessageOutOfThree() {
		
	}

}
