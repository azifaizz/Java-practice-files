package Synchro;

public class Bankacc {
	int balance = 1000;
	synchronized void withdraw(int amount) {
		if(balance>=amount) {
			System.out.println(Thread.currentThread().getName()+"is withdrawing");
			balance = balance - amount;
			System.out.println("balance left= "+balance);
		}else {
			System.out.println("Kaasu ila kelambuu");
		}
	}
}
