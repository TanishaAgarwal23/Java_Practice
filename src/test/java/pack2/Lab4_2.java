package pack2;
import java.util.*;
import java.io.File;
public class Lab4_2 {
	
	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:\\Users\\Tanisha.Agarwal\\eclipse-workspace\\Testing_Project\\src\\test\\java\\pack1\\numbers.txt"));
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			int num = sc.nextInt();
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
 
	}
 
}
 
 
