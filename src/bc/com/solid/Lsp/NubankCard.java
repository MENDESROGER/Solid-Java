package bc.com.solid.Lsp;

abstract public class NubankCard implements IPaymentInstrument {

	@Override
	public void validate() throws Exception {
		//Validação básica
		
	}

	@Override
	public void collectPayment() {
	 System.out.println("Pagamento Realizado");
		
	}
		

}
