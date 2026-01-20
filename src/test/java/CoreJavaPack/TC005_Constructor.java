package CoreJavaPack;

class Balance{
	String name;
	double bal;
	
	public Balance(String n, double b) {
		name = n;
		bal = b;
	}
	public void show() {
		if(bal>0) {
			System.out.println(name + ":" + "$" + bal);
		}
	}
}

public class TC005_Constructor {
  public static void main(String args[]) {
	  Balance obj = new Balance("Tanisha",100000000.00);
	  obj.show();
  }
}
