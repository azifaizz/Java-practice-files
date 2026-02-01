package Array.java;
class parent{
	void walk() {
		System.out.println("Parent is walking");
	}
	void talk() {
		System.out.println("Parent is talking");
	}
	void run() {
		System.out.println("Parent is running");
	}
}
class child extends parent{
	void play() {
		System.out.println("Child is playing");
	}
}
public class oopsinheritance {
	public static void main(String[] args) {	
		child c = new child();
		c.play();
		c.run();
		c.talk();
	}
}
