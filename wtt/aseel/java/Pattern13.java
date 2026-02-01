package wtt.aseel.java;

public class Pattern13 {

	public static void main(String[] args) {
		for(int ln = 1;ln<=6;ln++) {
			for(int space = 5;space>=ln;space--) {
				System.out.print(" ");
			}
		for(int col = 1;col<=ln;col++) {
				System.out.print("*");
		}
				System.out.println();
		}
	}
}
