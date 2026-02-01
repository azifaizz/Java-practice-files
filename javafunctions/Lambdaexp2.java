package javafunctions;

public class Lambdaexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{for(int i= 0;i<=5;i++) {
			System.out.println("runnable: "+i);}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
