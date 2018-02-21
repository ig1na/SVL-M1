
public class Caisse {

	public Caisse() {}
	
	public void payerRepasSansTicket(Carte c, int prixRepas) throws SoldeInsuffisantException{
		c.debiter(prixRepas);
	}

	public int afficheSolde(Carte carte) {
		return carte.solde();
	}

	public int afficheNbTickets(Carte carte) {
		// TODO Auto-generated method stub
		return carte.nbTickets();
	}

	public int afficheValeurTicket(Carte carte) {
		// TODO Auto-generated method stub
		return carte.valeurTicket();
	}

	public void payerRepasAvecTicket(Carte c, int prixRepas) throws SoldeInsuffisantException {
		c.consommerTicket(prixRepas);		
	};
}
