package Synchro;

public class Customer1 extends Thread{
	Bankacc account;
	Customer1 (Bankacc account){
		this.account = account;
	}
	public void run() {
		account.withdraw(700);
	}
}
