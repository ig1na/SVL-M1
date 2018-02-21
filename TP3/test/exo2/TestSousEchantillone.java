package exo2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import javax.management.BadAttributeValueExpException;

import org.junit.jupiter.api.Test;

class TestSousEchantillone extends SousEchantillonnage {

	List<Integer> result;
	ArrayList<Integer> input;
	
	@Test
	void testSousEchantillonnerListeVide() {
		result = new ArrayList<Integer>();
		result = SousEchantillonnage.sousEchantillonne(new ArrayList<Integer>(), 1, 1);
		assertTrue(result.isEmpty());
	}
	
	@Test
	void testFrequenceInfAZero() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		assertThrows(IllegalArgumentException.class, () -> {SousEchantillonnage.sousEchantillonne(input, 3, -4);});
	}
	
	@Test
	void testLongueurEchantillonInfAZero() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		assertThrows(IllegalArgumentException.class, () -> {SousEchantillonnage.sousEchantillonne(input, -4, 3);});
	}
	
	@Test
	void testFrequenceInfALongueurSsEchantillon() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		assertThrows(IllegalArgumentException.class, () -> {SousEchantillonnage.sousEchantillonne(input, 4, 2);});
	}
	
	@Test
	void testLongueurEgaleA1() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		assertEquals(input, SousEchantillonnage.sousEchantillonne(input, 1, 1));
	}
	
	@Test
	void testLongueurPlusGrandQueTailleListe() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		assertEquals(input, SousEchantillonnage.sousEchantillonne(input, 5, 5));
	}
	
	@Test
	void testLongueurMoinsGrandeQueTailleListe() {
		input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(1);
		result.add(2);
		result.add(4);
		assertEquals(result, SousEchantillonnage.sousEchantillonne(input, 2, 3));
	}

}
