package Q100;

import java.util.Scanner;

public class Q2 {
	static String getfullname(String fname,String sname) {
		return fname+" "+sname;
	}
	
	public static void main(String[] args) {
		String fullname = getfullname("Mohamed","Aseel");
		System.out.println(fullname);
	}
}

