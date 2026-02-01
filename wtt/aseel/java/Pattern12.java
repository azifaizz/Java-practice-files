package wtt.aseel.java;

public class Pattern12 {

	public static void main(String[] args) {
		for(int ln = 1;ln<=4;ln++){   					//row
			for(int space = ln;space<4;space++) {		//initial space
				System.out.print(" ");
			}
			for(int col = 1;col<=ln;col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
