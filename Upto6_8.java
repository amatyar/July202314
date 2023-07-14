
public class Upto6_8 {

	public static void main(String[] args) {
		// first string 
		System.out.println("Hello the world.");
		System.out.println("------------------------------\n");
				// Arithmetic operation
				// Addition       -   +
				// Subtraction    -   -
				// Multiplication -   *
				// Division       -   /
				// Modulus        -   %
		
	
		
		// function without parameter and without return
		funA();
		
		System.out.println("------------------------------\n");
		
		//Calling function with parameter and without return type
		Calculator(9, 3);
		
		System.out.println("------------------------------\n");
		
		// function with parameter and with return
		int total = CalculatorA(120, 24);
		System.out.println(total);
		
		CalculatorB(total,14);
	}
	
		// function without parameter and without return

		public static void funA() {
			System.out.println(10 - 5);
		}
	
		// function with parameter and without return type
		public static void Calculator(int x, int y) 
		{
			System.out.println(x+y);
			
			System.out.println(x%y);
		}
	
		
		// function with parameter and with return

		public static int CalculatorA(int x, int y) {
			return x - y;
		}
		
		public static void CalculatorB(int x,int y) {
			System.out.println(x+y);
		}
		
		

}
