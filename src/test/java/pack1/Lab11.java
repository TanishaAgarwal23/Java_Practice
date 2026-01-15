package pack1;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Lab11 {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.println("Enter date (yyyy-mm-dd):");
    	 String input = sc.next();
    	 
    	 LocalDate givenDate = LocalDate.parse(input);
    	 LocalDate currentDate = LocalDate.now();
    	 
    	 Period diff = Period.between(givenDate, currentDate);
    	 System.out.println("Difference is:");
    	 System.out.println(diff.getYears() + "Years");
    	 System.out.println(diff.getMonths() + "Months");
    	 System.out.println(diff.getDays() + "Days");
    	 
    	 sc.close();
     }
}
