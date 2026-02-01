package Filehandling;
import java.io.FileReader;
public class EXP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data = new char[20];
		try {
			FileReader fi = new FileReader("E:\\file\\sample.txt");
			fi.read(data);
			System.out.println(data);
		}catch (Exception e) {
			System.out.println("wrong");
		}
		}
	}
}
