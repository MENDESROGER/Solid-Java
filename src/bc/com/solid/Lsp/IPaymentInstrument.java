package bc.com.solid.Lsp;

public interface IPaymentInstrument {
	
	void validate() throws Exception;
	void collectPayment();

}
