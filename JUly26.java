
public class JUly26 
{

	public static void main(String[] args)
	{
		System.out.println(" I am writing try/ catch and finally code");
		
		int a = 7, b= 0; 
		
		try 
		{
			int c = a/b;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("ArithmeticException ==> "+ ex.getMessage());
		}
		finally
		{
			System.out.println(" i am closing program");
		}
	}

}
