package Array.java;

public class Strngbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a = new StringBuffer("Azi");
		a.append("Hello");
		a.insert(3, "Z");
		a.replace(0, 1, "1");
		a.delete(0, 1);
		a.reverse();
		System.out.println(a);
		

	}

}
