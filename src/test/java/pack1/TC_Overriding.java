package pack1;


	class animal{
		void sound() {
			System.out.println("animal makes a sound");
		}
	}
		class cat extends animal{
			void sound() {
				System.out.println("cat makes a sound");
			}
		}
		public class TC_Overriding {
	public static void main(String args[]) {
		
		animal a = new cat();
		a.sound();
		}
	}

