package be.coello.p5;

public class Client extends Person {
	public int clientRef;
	public int solde;
	
	public Client(String name, String lastname, int clientRef, int solde) {
		super(name, lastname);
		this.clientRef = clientRef;
		this.solde = solde;
	}
	
	
	
	public int getClientRef() {
		return clientRef;
	}
	public void setClientRef(int clientRef) {
		this.clientRef = clientRef;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}



	@Override
	public String toString() {
		return "Client [clientRef=" + clientRef + ", solde=" + solde + ", lastname=" + lastname + ", name=" + name + "] \n";
	
	}







	

}
