

public class error 
{

	public static void main(String[] args) 
	{
		
		try {
	      String[] myStrings = {"Ram", "Shyam", "Prem", "Ganesh"};
	      System.out.println(myStrings[12]);
		}
 
	 	catch (Exception e) 
	 	{
	      System.out.println("Something went wrong.");
	    }
	}

}
