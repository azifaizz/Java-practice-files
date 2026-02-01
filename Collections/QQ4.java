package Collections;
import java.util.*;
public class QQ4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<>();
        students.add("Azi");
        students.add("Rahul");
        students.add("Sneha");
        String[] arr = students.toArray(new String[0]);
        for (String name : arr) {
            System.out.println(name);
        }
	}
}
