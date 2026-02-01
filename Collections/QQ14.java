package Collections;
import java.util.HashMap;
public class QQ14 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Rahul");
        map.put(3, "Sneha");
        map.put(2, "asee");
        System.out.println(map.keySet());
        System.out.println(map.values());
    
	}
}
