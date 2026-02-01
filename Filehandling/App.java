package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static String filename = "sample.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("---------File handling----------");
			System.out.println("1. create file");
			System.out.println("2. write file");
			System.out.println("3. read file");
			System.out.println("4.delete");
			System.out.println("5.Exit");
			System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            case 1:CreateFile();
            case 2:WriteFile();
            case 3:ReadFile();
            case 4:DeleteFile();
            case 5:Exitfile();
            default:System.out.println("invalid choice");
            }
		}
	}
	static void CreateFile() {
		try {
			File fi = new File("E:\\file\\"+filename);
			if(fi.createNewFile()) {
				System.out.println("New file created"+filename);
			}else {
				System.out.println("file already exits");
			}
			}catch(Exception e) {
				System.out.println("Something went wrong");
			}
		}
	static void WriteFile() {
	    try {
	        System.out.println("Enter the text");
	        String text = sc.nextLine();
	        FileWriter fw = new FileWriter("E:\\file\\" + filename);
	        fw.write(text);
	        fw.close();
	        System.out.println("Data written successfully");
	    } catch (IOException e) {
	        System.out.println("Invaile operation");
	    }
	}
	static void ReadFile() {
	    try {
	        FileReader fr = new FileReader(filename);
	        BufferedReader br = new BufferedReader(fr);

	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	        br.close();
	    } catch (IOException e) {
	        System.out.println("Cannot read file");
	    }
	}
	static void DeleteFile() {
        File file = new File(filename);
        if(file.delete()){
            System.out.println("File deleted");
        } else {
            System.out.println("File not found");
        }
	}
	static void Exitfile() {
		
	}
}
