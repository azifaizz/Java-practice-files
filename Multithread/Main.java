package Multithread;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A t1 = new A();
		B t2 = new B();
		C t3 = new C();
		D t4 = new D();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
