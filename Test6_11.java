

public class Test6_11 {

	public static void main(String[] args) 
	{
		// write a function for addition of two number
		
		System.out.println(3 + 8);
		
		System.out.println("***********End****************");
		//Define two variables and perform arithmetic operation
		// arithmetic(9, 8);	 
		
		 int a = 9, b= 18;
		 System.out.println(a + b);
		 //System.out.println(sum);
		System.out.println("***********End****************");
		// define  three variables and print greatest variable out of three 
		int aa = 6 ,  bb= 33,  cc= 87;
		
		 if( aa > bb && aa > cc) 
		 {
			 System.out.println("aa is greatest number");
		 }
		 else if (bb > aa && bb > cc)
		 {
			 System.out.println("bb is greatest number");
		 }
		 else
		 {
			 System.out.println("cc is greatest number");
		 }
		
		System.out.println("***********End****************");
		// Write a program for switch case (case for city and print respective state)
String city = "Boston";
		
		switch(city) 
		{
		case "Arlington":
			System.out.println("VA");
			break;
			
		case "Boston":
			System.out.println("MA");
			break;
		case "Dallas":
			System.out.println("TX");
			default:
			System.out.println("Please check again ! Thank you for your time");
		}
		System.out.println("***********End****************");
	}
		
	
	
}
