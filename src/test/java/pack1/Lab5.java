package pack1;
import java.util.Scanner;


public class Lab5 {
  public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter num:");
	  int num = sc.nextInt();
	  
	  if(num<0) System.out.println("number is negative");
	  else {
		  System.out.println("number is positive");
	  }
  }
}
