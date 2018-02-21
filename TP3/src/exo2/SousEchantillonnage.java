package exo2;

import java.util.ArrayList;
import java.util.List;

public class SousEchantillonnage {
	
	public static List<Integer> sousEchantillonne(List<Integer> liste, int lgSousEchantillon, int frequence) {
		List<Integer> l = new ArrayList<Integer>();
		if (frequence <= 0 || lgSousEchantillon <= 0 || frequence < lgSousEchantillon) throw new IllegalArgumentException();
		
		if (liste.size() == 0 ) return l;
		
		if(lgSousEchantillon == 1 || lgSousEchantillon >= liste.size()) return liste;
		
		for(int i=0; i<liste.size(); i+=frequence) {
			for(int j=0; j<lgSousEchantillon; j++) {
				if(i+j < liste.size()) l.add(liste.get(i+j));
			}
		}
		return l;
	}
}
