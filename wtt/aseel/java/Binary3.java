package wtt.aseel.java;

public class Binary3 {

	public static void main(String[] args) {
		for(int ln = 1;ln<=5;ln++) {
			for(int col = 1;col<=ln;col++) {
				if(ln%2==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
