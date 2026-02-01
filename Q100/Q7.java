package Q100;

public class Q7 {
	static double discal(double price,double discount) {
		return price-(price*discount/100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fprice = discal(1000,20);
		System.out.println(fprice);

	}

}
