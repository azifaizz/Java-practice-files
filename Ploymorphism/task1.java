package Ploymorphism;
//method overloading
public class task1 {
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b,int c) {
		return a*b*c;
	}
	int mix(int a,int b,int c,int d) {
		return a+b-c*d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task1 c = new task1();
		System.out.println(c.add(12, 10, 30));
		System.out.println(c.mul(12, 10, 30));
		System.out.println(c.sub(12, 10));
		System.out.println(c.mix(12, 10, 30,23));

	}

}
