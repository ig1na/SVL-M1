package exo1;

public class Compte {

	private int solde;
	
	public Compte() {
		this.solde = 0;
	}
	
	public void crediter(int credit) {
		this.solde += credit;
	}
	
	public void debiter(int debit) throws PasAssezDeFondsException {
		if (solde-debit  < 0) throw new PasAssezDeFondsException();
		this.solde -= debit;
	}
	
	public int getSolde() {
		return solde;
	}
	
}
