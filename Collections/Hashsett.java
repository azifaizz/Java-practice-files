package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashsett {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names = new HashSet<>();
		names.add("Azi");
		names.add("faizz");
		names.add("Azi");
		names.add(null);
		System.out.println(names);
		LinkedHashSet<String> names2 = new LinkedHashSet<>();
		names2.add("messi");
		names2.add("messi");
		names2.add("neymar");
		System.out.println(names2);
		TreeSet<String> names3 = new TreeSet<>();
		names3.add("neymar");
		names3.add("neymar");
		names3.add("Messi");
		System.out.println(names3);
	}

}
