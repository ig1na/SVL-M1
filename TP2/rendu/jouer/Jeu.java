package jouer;

public class Jeu {
	Banque labanque;
	boolean estOuvert;
	
	public Jeu(Banque labanque) {
		this.labanque = labanque;
		this.estOuvert = true;
	}
	
	public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException{
		int resultat;
		
		if(!this.estOuvert) {
			throw new JeuFermeException();
		}
		
		try {
			joueur.debiter(joueur.mise());
		} catch (DebitImpossibleException e) {
			this.fermer();
			e.printStackTrace();
		}
		
		this.labanque.crediter(joueur.mise());
		resultat = de1.lancer() + de2.lancer();
		
		if(resultat != 7) {
			return;
		}
		
		this.labanque.debiter(joueur.mise()*2);
		joueur.crediter(joueur.mise()*2);
		
		if(!this.labanque.est_solvable()) {
			this.fermer();
		}
		
	};
	
	public void fermer() {
		this.estOuvert = false;
	};
	
	public boolean estOuvert() {
		return estOuvert;
	};
}
