package pack1;

public class TC001_Variables {
	private static double width = 20;
	private static double height = 10;
	private static double depth = 5;
	private static int boxid;
	
	public static double calcVolume() {
		double temp = 0;
		temp = width*height*depth;
		return temp;
	}
	
    public static void main(String args[]) {
    	
    	System.out.println("volume:" + calcVolume());
    	
    	
    }
}
