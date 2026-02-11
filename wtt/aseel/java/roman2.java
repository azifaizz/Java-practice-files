package wtt.aseel.java;
import java.util.Scanner;
public class roman2 {
	public int roman(char op) {
		switch(op) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	public static void main(String[] args) {
		roman2 a=new roman2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman letter:  ");
        String s=sc.nextLine();
        int r=0;
        
        for(int i=0;i<s.length()-1;i++) {
        	int v=a.roman(s.charAt(i));
        	if(s.charAt(i)<s.charAt(i+1)) {
        		r=r-v;
        	}
        	else {
        		r=r+v;
        	}
        	
        }
        System.out.println( r);
	}
}
