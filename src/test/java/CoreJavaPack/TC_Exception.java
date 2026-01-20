package CoreJavaPack;
import java.util.*;
public class TC_Exception {
  public static void main(String args[]) {
	
	  
	  try {
		  String str = null;
				  str.equals("Hello");
	  }
	 
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	  System.out.println("Welcome to java");
  }
}
