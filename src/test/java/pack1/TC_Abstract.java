package pack1;

abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	void draw() {
		System.out.println("Drawing rectangle");
	}
}

public class TC_Abstract {

	public static void main(String args[]) {
		rectangle obj = new rectangle();
		obj.draw();
	}
}
