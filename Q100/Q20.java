package Q100;

public class Q20 {
	static final double discount_rate = 0.10;
	static final double rate = 1000;
	
	static double d_calc(double total_amt) {
		if(total_amt>rate) {
			double discount = total_amt * discount_rate;
			return total_amt - discount;
		}
		return total_amt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 1200;
		double finalamount = d_calc(total);
		System.out.println(finalamount);
	}

}
