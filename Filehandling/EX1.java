package Filehandling;
import java.io.File;
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fi = new File("E:\\file\\sample.txt");
		try {
			boolean status=fi.createNewFile();
			if(status) {
				System.out.println("Successfuly created");
			}else {
				System.out.println("File already exist");
			}
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}

	}

}
