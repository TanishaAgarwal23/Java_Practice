package pack1;

import java.io.FileInputStream;
import java.io.IOException;
 
public class TC_FileIO {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Tanisha.Agarwal\\eclipse-workspace\\Testing_Project\\src\\test\\java\\pack1\\input.txt");
		
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.println((char)data);
		}
		
		fis.close();
		
 
	}
 
}

	
