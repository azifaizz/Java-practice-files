package Q100;

public class Q25 {
	static String getdomain(String email) {
		int atindex = email.indexOf("@");
		int dotindex = email.indexOf(".");
		return email.substring(atindex+1,dotindex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getdomain("aseelfaizzin1@gmail.com"));

	}

}
