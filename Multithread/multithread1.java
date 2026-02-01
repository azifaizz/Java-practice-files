package Multithread;

public class multithread1  extends Thread{
	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithread1 m1 = new multithread1();
		m1.start();
	}

}
