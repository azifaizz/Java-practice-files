package Exception;
public class EXP1 {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		try {
			System.out.println(num[10]);
		}catch(Exception e){
			System.out.println("Not defined");
		}
	}
}
