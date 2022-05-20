package bc.com.solid.Lsp;

public class NubankRewards implements IPaymentInstrument {

	@Override
	public void validate() throws Exception {
		System.out.println("LImite Ok, Rewards OK !!");
		
	}

	@Override
	public void collectPayment() {
		System.out.println("Pagamento realizado com sucesso !!");
		System.out.println("Pontuação creditada no Programa Rewards");
		
	}

}
