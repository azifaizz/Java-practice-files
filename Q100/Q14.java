package Q100;

public class Q14 {
	static double ticketdiscount(int age,double price) {
		double discount = 0;
		if(age<12||age>60) {
			discount = price * 0.20;
		}
		return (price - discount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double realprice = ticketdiscount(11,300);
		System.out.println(realprice);
	}
}
