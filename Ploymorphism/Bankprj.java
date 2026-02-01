package Ploymorphism;
public class Bankprj {
	private int balance = 20000;
	void showbalance() {
		System.out.println("Current balance : "+balance);
	}
	void phonepay(int amount) {
		balance = 	balance - amount;
		System.out.println("Phonepay amount paid: "+amount);
		System.out.println("Phonepay : "+balance);
		showbalance();
	}
	void Gpay(int amount) {
			balance = 	balance - amount;
			System.out.println("Gpay amount paid: "+amount);
			System.out.println("Gpay : "+balance);
			showbalance();
	}
	void Creditcard(int amount) {
		balance = 	balance - amount;
		System.out.println("Creditcard amount paid: "+amount);
		System.out.println("Creditcard : "+balance);
		showbalance();
	}
	public static void main(String[] args) {
		Bankprj b = new Bankprj();
		b.phonepay(200);
		b.Gpay(30);
		b.Creditcard(10);
		
		
		
			
	}
}
