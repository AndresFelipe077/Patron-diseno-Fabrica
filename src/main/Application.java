package main;
import clases.*;

public class Application {

	private static Shop shop;
	
	public static void main(String[] args) {
		
		String[] caracteres = {"CreditCard", "Cash"};
		
		configure(caracteres);
		goShopping();

	}
	static void configure(String[] args)
	{
		if(null != args && args[0].equalsIgnoreCase("creditCard"))
			shop = new CreditPayment();
		else {
			shop = new CashPayment();
		}
	}
	
	static void goShopping() {
		shop.buySomething();
	}

}
