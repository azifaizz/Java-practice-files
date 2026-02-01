package Collections;
import java.util.*;
public class QQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
        students.add("Azi");
        students.add("Rahul");
        students.add("Sneha");
        if (students.contains("Ra")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
	}
}
