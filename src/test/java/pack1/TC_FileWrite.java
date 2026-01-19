package pack1;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class TC_FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		
		String text = sc.nextLine();
		FileWriter fw = new FileWriter("C:\\Users\\Tanisha.Agarwal\\eclipse-workspace\\Testing_Project\\src\\test\\java\\pack1\\input.txt");
		fw.write(text);
		fw.close();
	}

}
