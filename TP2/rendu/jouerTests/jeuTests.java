package jouerTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import jouer.Banque;
import jouer.De;
import jouer.DebitImpossibleException;
import jouer.Jeu;
import jouer.JeuFermeException;
import jouer.Joueur;

class jeuTests {

	Jeu j;
	Joueur p;
	De de1, de2;
	Banque b;
	
	@BeforeEach
	void setUp() throws Exception {
		b = mock(Banque.class, "b");
		p = mock(Joueur.class, "p");
		de1 = mock(De.class, "de1");
		de2 = mock(De.class, "de2");
		j = new Jeu(b);
	}

	@Test
	void testJeuFerme() {
		j.fermer();
		assertThrows(JeuFermeException.class, () -> { j.jouer(p, de1, de2); });
	}
	
	@Test
	void testJoueurInsolvable() throws DebitImpossibleException {
		doThrow(new DebitImpossibleException()).when(p).debiter(20);
	}
	
	@Test
	void testJoueurGagneEtBanqueInsolvable() {
		when(de1.lancer()).thenReturn(5);
		when(de2.lancer()).thenReturn(2);
		when(b.est_solvable()).thenReturn(false);
		try {
			j.jouer(p, de1, de2);
		} catch (JeuFermeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertFalse(j.estOuvert());
	}

}
