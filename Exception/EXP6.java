package Exception;

public class EXP6 {
	public static void banking(int amount) throws Exception{
		int balance = 20000;
		if(amount>balance) {
			throw new Exception("unsuff balance");
		}
			balance = balance - amount;
			System.out.println("Amount withdrawn: "+amount);
			System.out.println("Amount balance: "+balance);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EXP6 obj = new EXP6();
		try {
			obj.banking(300000);
			System.out.println("unsuff balance");
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
