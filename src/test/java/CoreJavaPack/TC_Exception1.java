package CoreJavaPack;

public class TC_Exception1 {
	
	try {
		int d = 0;
		int a = 50/d;
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("Welcome to java");
}
}