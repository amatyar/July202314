
public class July26b {

	public static void main(String[] args) {
		System.out.println("Array case is starting");
		
		int [] myArr = {11,68,32,65,45,21};
		
		try 
		{
			System.out.println("First selected => "+myArr[1]);
			System.out.println("Second selected => "+myArr[12]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBoundsException =>"+ ex.getMessage());
		}
		finally
		{
			System.out.println("connection closed.");
		}

	}

}
