package Collections;
import java.util.*;
public class QQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(233);
		numbers.add(2333);
		numbers.add(2334);
		numbers.add(2335);
		numbers.add(2363);
		numbers.add(2338);
		int evencount = 0;
		int ODDcount = 0;
		for(int i = 0;i<numbers.size();i++) {
			int num = numbers.get(i);
			if(num%2==0) {
				evencount++;
			}else {
				ODDcount++;
			}
		}
		System.out.println("Even count:"+evencount);
		System.out.println("OddCount:"+ODDcount);
	}
}
