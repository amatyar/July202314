
public class Upto6_8B {

	public static void main(String[] args) {
		System.out.println("\n\nSolution for June 7th class\n");
		// Calling comparison operator cases
		Comparison();
		System.out.println("---------------------->\n");
		// Calling logical operator cases (AND  --->  &&)
		logicalAnd() ;
		System.out.println("---------------------->\n");
		// Calling logical operator cases (OR  --->  &&)
		logicalOr() ;
		System.out.println("---------------------->\n");
		// Calling logical operator cases (NOT  --->  &&)
		logicalNot() ;
		
		
		
		
		
	}

	
			
			/* Human class
			 Properties - color , age , weight 
			 Methods - walk(), talk()	
			
			boolean canDriver = true; */		
					
			
			/* comparison operator cases
			 < , > , <= , >= , != , ==			
			 */
			public static void Comparison() 
			{
				System.out.println(302 <= 302);
				System.out.println(31 >= 31);
				System.out.println(32 != 13);
				System.out.println(55 != 55);
				System.out.println(27 == 41);
				System.out.println(70 == 070);
				System.out.println(2 < 61);
				System.out.println(32 > 72);
				System.out.println(31 <= 222);
				System.out.println(31 >= 12);
			
			}
			
			/*logical operator cases (AND  --->  &&)		
			
			 true    &&     true  -------> true
			 false   &&     true  -------> false
			 true    &&     false -------> false 
			 false   &&     false -------> false */
			
			public static void logicalAnd() 
			{
				System.out.println(78 == 78 && 81 != 81);
				System.out.println(75 != 75 && 85 != 85);
				System.out.println(37 == 37 && 68 == 68);
				System.out.println(67 != 67 && 86 == 86);
			
			}
			
			/* logical operator cases (OR  --->  ||)
			
			 true    ||     true  -------> true
			 false   ||     true  -------> true
			 true    ||     false -------> true 
			 false   ||     false -------> false */
			public static void logicalOr() 
			{
				 System.out.println(86 == 86 || 87 == 97);
				 System.out.println(84 == 14 || 86 == 68);
				 System.out.println(4 == 4 || 7 == 7);
				 System.out.println(86 == 96 || 68 == 96);
			
			 
			}
		
			/* logical operator cases (NOT ---> !)			
			  true  ---- false
			 false ---- true */
			 public static void logicalNot() 
			 {
				 System.out.println(!(9 == 9));
				 System.out.println(!(91 == 18));
			 }
}
