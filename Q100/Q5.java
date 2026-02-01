package Q100;

public class Q5 {
	static int attempts=0;
		static void login(String user,String pass) {
			attempts++;
			if(user.equals("admins")&&pass.equals("admin")) {
				System.out.println("login success");
			}else {
				System.out.println("invalid");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login("admin","admin");
		login("admin","admin");
		login("admin","admin");
		System.out.println("Loggin attemps:"+attempts);

	}

}
