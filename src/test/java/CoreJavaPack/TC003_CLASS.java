package CoreJavaPack;


class Box{
	double width = 10;
	double height = 20;
	double depth = 10;
	
	double calcVolume() {
		return width*height*depth;
	}
}
public class TC003_CLASS {
   public static void main(String args[]) {
	   Box obj = new Box();
	   System.out.println(obj.calcVolume());
   }
}
