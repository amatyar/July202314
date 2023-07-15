package Two;

public class functions {

	public static void main(String[] args) {
		//calling Add
		Add();
		//calling AddB
		AddB(45, 21);
		//calling AddC
		int sum = AddC(2204, 554);
		System.out.println(sum);
		System.out.println(sum - 90);
		System.out.println(sum * 0.20);
		
	}
	
	// write a function w/o parameter and w/o return type
	public static void  Add()
	{
		System.out.println(15 + 22);
	}
	
	// write a function with parameter and w/o return type
	public static void AddB(int x,  int y)
	{
		System.out.println(x + y); 
	}
	public static int AddC(int x, int y) 
	{
		//System.out.println(x + y);
		return x + y;
	}
}
