
public class Condition {

	public static void main(String[] args) 
	{
		//Program 1
		int x = 5;
		if(x > 0 && x <= 5) {
			System.out.println("you got 5 % discount.");
		}
		if(x > 5 && x <= 15) {
			System.out.println("you got 15 % discount.");
		}
		if(x > 15 && x <= 25) {
			System.out.println("you got 25 % discount.");
		}
		if(x > 25) {
			System.out.println("you got 30 % discount.");
		}
		
		
		// Program 2
		
		
		int y = 65;
		if(y > 0 && y <= 5) {
			System.out.println("you got 5 % discount.");
		}
		else if(y > 5 && y <= 15) {
			System.out.println("you got 15 % discount.");
		}
		else if(y > 15 && y <= 25) {
			System.out.println("you got 25 % discount.");
		}
		else{
			System.out.println("Sorry wrong input.");
		}
		
		//Program 3
		
		int a = 55;
		if(a > 10) {
			System.out.println("you got 5 % discount.");
		}
		if(a > 15 ) {
			System.out.println("you got 15 % discount.");
		}
		if(a > 30) {
			System.out.println("you got 25 % discount.");
		}
		if(a > 25) {
			System.out.println("you got 30 % discount.");
		}
		
		
		// Program 4
		
		int M = 65;
		if(M > 95) {
			System.out.println("you got 5 % discount.");
		}
		else if(M >55) {
			System.out.println("you got 15 % discount.");
		}
		else if(M > 25) {
			System.out.println("you got 25 % discount.");
		}
		else{
			System.out.println("Sorry wrong input.");
		}
		
		
		// Program 5
		
		
		int ab = 20;
		int bc = 305;
		
		if (ab > bc) {
			System.out.println("ab is greater");
		}
		else
		{
			System.out.println("bc is greater");
		}
		
		
		
		// Program 6
		
		int l= 20;
		int me = 400;
		int n = 89;
		
		if ( l > me && l> n)
		{ 
			
			System.out.println("l is greater");
		}
		else if(me > l && me > n)
		{
			System.out.println("me is greater.");
		}
		else
		{
			System.out.println("n is greater");
		}
	}

}
