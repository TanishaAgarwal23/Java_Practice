package pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "12345";
		String regex = "\\d+";    //valid for n number
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean result = m.matches();
        
        if(result == true) {
        	System.out.println("Valid Number");
        }else {
        	System.out.println("Invalid Number");
        }
        
        String input1 = "today is monday and tomorrow is tuesday and";
        Pattern pattern = Pattern.compile("and");
        Matcher match = pattern.matcher(input1);
        System.out.println(match.matches());
        
        while(match.find()) {
        	System.out.println(match.group() + ":" + match.start() + ":" + match.end());
        }
        
        String phonenumber= "123464767859";
		String regex1 = "\\d{10}";    
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(phonenumber);
        boolean result1 = m1.matches();
        
        if(result1 == true) {
        	System.out.println("Valid Phone Number");
        }else {
        	System.out.println("Invalid Phone Number");
        }
	}

}
