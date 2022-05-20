package bc.com.solid.Lsp;

public class MainPayment {
	
	public static void main(String[] args) throws Exception {
		//CreditCar card = new CreditCar();
		//DebitCard card = new DebitCard();
		NubankRewards card = new NubankRewards();
		
		card.validate();
		card.collectPayment();
		
	}
}
