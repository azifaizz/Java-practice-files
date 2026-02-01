package Q100;

public class Q13 {
		static int bankbalance(int balance) {
			if(balance<500) {
				balance = balance - 50;
			}
			return balance;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance= 300;
		balance = bankbalance(300);
		System.out.println("The balance:"+balance);
	}

}
