package clases;

public class CashPayment extends Shop{

	@Override
	public Payment makePayment() {
		return new Cash();
	}

}
