package June;

public class June15 {

	public static void main(String[] args) {
		
		// Program 1 reverse 
		String firstName="Rabindra Amatya From Boston";		
		
		String rev= "";		
		char ch;
	       int i;    
	            
	      for ( i=0; i<firstName.length(); i++)	    	  
	    	  
	      {
	       ch= firstName.charAt(i); 
	       rev  = ch + rev; 
	      }
	      System.out.println( rev); 

		System.out.println(i);	
		System.out.println("\n%%%%%%%%%%%%%% end %%%%%%%%%%%\n");
		
		//Program 2 convert all in lower case 
		
		String lc = firstName.toLowerCase();
		System.out.println(lc);
		System.out.println(firstName.toLowerCase());
		System.out.println("Hi I am " + lc);
		System.out.println("\n%%%%%%%%%%%%%% end %%%%%%%%%%%\n");
		//Program 3 convert all in upper case and lenght size
		
				String uc = firstName.toUpperCase();
				//System.out.println(uc);
				System.out.println(firstName.toUpperCase());
				System.out.println("Hi I am " + uc);
				int uc1= firstName.length();
				System.out.println(uc1);
				
	System.out.println("\n%%%%%%%%%%%%%% end %%%%%%%%%%%\n");
				
				// Program 4 using substring
	String subs= firstName.substring(6);
	System.out.println(subs);
				
				
	System.out.println("\n%%%%%%%%%%%%%% end %%%%%%%%%%%\n");
	
	// program 5 using substring between
	
	String subsb= firstName.substring(6, 14);
	System.out.println(subsb);
	
	}

}
