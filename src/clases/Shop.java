package clases;

public abstract class Shop {
	
	public void buySomething() {
		Payment payment = makePayment();
		makePayment().paymentMethod();
	}
	
	public abstract Payment makePayment();
	
}
