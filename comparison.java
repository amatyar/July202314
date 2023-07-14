

public class comparison {

	public static void main(String[] args)
	{
		// And , Or, Not
		System.out.println(8 == 8 && 9 == 9);
		System.out.println(18 == 8 && 9 == 9);
		System.out.println(8 == 8 && 9 == 19);
		System.out.println(18 == 8 && 9 == 19);

		System.out.println(8 == 8 || 9 == 9);
		System.out.println(18 == 8 || 9 == 9);
		System.out.println(8 == 8 || 9 == 19);
		System.out.println(18 == 8 || 9 == 19);
		
		System.out.println(!(8 == 8));
		System.out.println(!(18 == 8));
		
		 // < , >, <= , >=, !=, ==
		System.out.println("*****************");
		System.out.println(8 > 8);
		System.out.println(18 >= 8 );
		System.out.println(8 == 8 );
		System.out.println(18 != 8 );
		
		System.out.println(8 <= 8);
		System.out.println(18 <= 8);
	}

}
