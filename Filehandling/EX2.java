package Filehandling;
import java.io.FileWriter;
public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fi = new FileWriter("E:\\file\\sample.txt");
			fi.write("Aseel \n");
			fi.write("Mohamed");
			System.out.println("written sucessfully");
			fi.close();
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
