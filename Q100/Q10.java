package Q100;

public class Q10 {
	static void grade(int marks) {
		if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=60&&marks<=89) {
			System.out.println("grade B");
		}else if(marks>=30&&marks<=59) {
			System.out.println("Grade c");
		}else {
			System.out.println("grade D");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade(59);
	}

}
