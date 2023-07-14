

public class ifelse {

	public static void main(String[] args) 
	{
		int a = 1000;
		
		if (a > 0  && a <= 1000) {
			System.out.println("You can get extra drink");
		}
		if (a> 10 && a<= 900)
		{
			System.out.println("Two more drink please");
			
		}
		if (a>100 && a<= 1001)
		{
			System.out.println("No more drink");
		}
		
		
		
		if (a > 0  && a <= 130) {
			System.out.println("You can get extra drink");
		}
		else if (a> 10 && a<= 900)
		{
			System.out.println("Two more drink please");
			
		}
		else 
		{
			System.out.println("No more drink");
		}
		
		int mark = 91;
		 if (mark >90) {
			 System.out.println("you got A");
		 }
		 if (mark >75) {
			 System.out.println(" you got C");
		 }
		
		 if (mark >90) {
			 System.out.println("you got A");
		 }
		 else if (mark >75) {
			 System.out.println(" you got C");
		 }
		 else {
			 System.out.println("you are fail");
		 }
		
	}
}
