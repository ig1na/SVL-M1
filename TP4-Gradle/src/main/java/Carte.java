
public interface Carte {

	public void debiter(int prix) throws SoldeInsuffisantException;
	public void consommerTicket(int prix) throws SoldeInsuffisantException;
	public int solde();
	public int nbTickets();
	public int valeurTicket();
}
