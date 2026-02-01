package Multithread;

public class Priority1 extends Thread {
	public void run() {
		System.out.println(getName()+" Priority "+getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Priority1 t1 = new Priority1();
		Priority1 t2 = new Priority1();
		Priority1 t3 = new Priority1();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
