package Collections;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = Arrays.asList(
	            "test@gmail.com",
	            "admin@gmail.com",
	            "test@gmail.com",
	            "user@yahoo.com",
	            "admin@gmail.com"
	        );

	        Set<String> uniqueEmails = new HashSet<>(emails);

	        System.out.println(uniqueEmails);

	}

}
