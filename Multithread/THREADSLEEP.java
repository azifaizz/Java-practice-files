package Multithread;

public class THREADSLEEP {
	static void printi() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("error");
			}
		}
	}
	static void printnum() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println("error");
			}
		}
	}
	static void printnum2() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			}catch(Exception e) {
				System.out.println("error");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printi();
		printnum();
		printnum2();
	}
}
