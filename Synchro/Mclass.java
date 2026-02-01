package Synchro;

public class Mclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankacc a = new Bankacc();
		Customer1 c1 = new Customer1(a);
		Customer1 c2 = new Customer1(a);
		Customer1 c3 = new Customer1(a);
		c1.setName("Customer - 1 ");
		c2.setName("Customer - 2 ");
		c3.setName("Customer - 3 ");
		c1.start();
		c2.start();
		c3.start();
	}

}
