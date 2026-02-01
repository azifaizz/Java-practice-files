package Exception;
import java.util.Scanner;
public class EXP5 {
	public static void login(String user,String pass)throws Exception{
		if(!user.equals("azi")||(!pass.equals("azi"))) {
			throw new Exception("Invalid password");
		}else {
			System.out.println("Login success");
		}
	}
    public static void main(String[] args) {
        try {
        	login("azi","azii");
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}