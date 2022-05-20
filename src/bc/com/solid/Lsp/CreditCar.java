package bc.com.solid.Lsp;

public class CreditCar extends NubankCard {
	
	@Override
	public void validate() throws Exception {
		System.out.println("Validando Limite!!");
		System.out.println("Limite Ok");
	
	}
	

}
