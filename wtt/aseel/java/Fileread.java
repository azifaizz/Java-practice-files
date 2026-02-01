package wtt.aseel.java;
import java.io.FileReader;
import java.io.FileWriter;
public class Fileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter file = new FileWriter("E:\\file\\sample.txt");
			file.write("Mohmed Aseel \n");
			file.write("MCA");
			System.out.println("File written successfully");
		}catch (Exception e) {
			System.out.println("something went wrong");
		}
		try {
			FileReader filee = new FileReader("E:\\file\\sample.txt");
			filee.read();
		}catch(Exception e) {
			System.out.println("reading error");
		}
	}
}

