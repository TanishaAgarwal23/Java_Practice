package pack2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1 {
	
	public static void main(String args[]) {
	
		try {
			FileReader fr = new FileReader("C:\\\\Users\\\\Tanisha.Agarwal\\\\eclipse-workspace\\\\Testing_Project\\\\src\\\\test\\\\java\\\\pack1\\\\input.txt");
		    StringBuilder sb = new StringBuilder();
			
				int ch;
				
				while ((ch = fr.read()) != -1) {
					sb.append((char) ch);
				}
				sb.reverse();
				
				FileWriter fw = new FileWriter("C:\\\\Users\\\\Tanisha.Agarwal\\\\eclipse-workspace\\\\Testing_Project\\\\src\\\\test\\\\java\\\\pack1\\\\input.txt");
				fw.write(sb.toString());
				fw.close();
				System.out.println("File content reversed successfully.");
		}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}

