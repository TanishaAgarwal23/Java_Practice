package CoreJavaPack;

class car{
	int nocylinders;
	int novalves;
	int enginepower;
	boolean ispowersteering;
	
	car(){
		nocylinders = 3;
		novalves = 4;
		enginepower = 46;
		ispowersteering = false;
	}
	
	car(boolean ispowersteering){
		this.ispowersteering = ispowersteering;
	}
	
	car(int nocylinders, int novalves, int enginepower){
		this.nocylinders = nocylinders;
		this.novalves = novalves;
		this.enginepower = enginepower;
		this.ispowersteering = true;
	}
}
public class TC_Overloading {
 
	
	public static void main(String args[]) {
		
		car obj1 = new car();
		System.out.println(obj1.nocylinders);
		
		car obj2 = new car(true);
		System.out.println("ispowersteering:" + obj2.ispowersteering);
		
		car obj3 = new car(4,50,4);
		System.out.println(obj3.nocylinders);
	}
}
