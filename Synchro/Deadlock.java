package Synchro;

public class Deadlock {
	static final Object lock1 = new Object();
	static final Object lock2 = new Object();
	static class Thread1 extends Thread {
	    public void run() {
	        synchronized(lock1) {
	            System.out.println("Thread1 locked lock1");
	            try { Thread.sleep(100); } catch(Exception e) {}

	            synchronized(lock2) {
	                System.out.println("Thread1 locked lock2");
	            }
	        }
	    }
	}

	static class Thread2 extends Thread {
	    public void run() {
	        synchronized(lock2) {
	            System.out.println("Thread2 locked lock1");
	            try { Thread.sleep(100); } catch(Exception e) {}

	            synchronized(lock1) {
	                System.out.println("Thread2 locked lock2");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
