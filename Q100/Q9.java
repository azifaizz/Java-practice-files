package Q100;

public class Q9 {
	static double netcal(double salary,double taxx) {
		double tax = salary * taxx/100;
		return salary - taxx;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double callll=netcal(223333,18);
		System.out.println(callll);
	}

}
