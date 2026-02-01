package javafunctions;

public class Lambdaexp {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i = 0;i<5;i++) {
				System.out.println("Runnin thread:"+i);
			}
		});
		t1.start();
	}
}
