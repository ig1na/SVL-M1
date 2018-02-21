
public class CarteImpl implements Carte{

	private int solde, nbTickets;
	
	public CarteImpl() {
		this.solde = 20;
		this.nbTickets = 5;
	}
	
	public void debiter(int prix) throws SoldeInsuffisantException {
		if(this.solde < prix) {
			throw new SoldeInsuffisantException();
		} else {
			this.solde -= prix;
		}
	}

	public void consommerTicket(int prix) throws SoldeInsuffisantException {
		if(nbTickets() == 0) {
			debiter(prix);
		}
	}

	@Override
	public int solde() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nbTickets() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int valeurTicket() {
		// TODO Auto-generated method stub
		return 0;
	}

}
