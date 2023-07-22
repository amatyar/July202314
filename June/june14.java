package June;

public class june14 
{

	public static void main(String[] args) 
	{
		
		//Program 1 print number of chars
		String city ="Boston";
		
		for (int i = 0; i <city.length(); i ++)
		{
			System.out.println(i);
			
			
			
		}
		System.out.println("*********************");
		//Program 2 print out characters
		String city1 ="Boston";
		
		for (int i = 0; i <city1.length(); i ++)
		{
			
			
			System.out.println(city1.charAt(i));
			
		}
		System.out.println("*********reve************");
		//Program 3 reverse out put
		for ( int i = city.length()-1; i >=0 ; i--)
		{
			
			
			System.out.println(city.charAt(i));
		}
		
		System.out.println("*********************");
		//Program 3 print out Upper case all characters
		
		String name= " Rabindra Amatya";
		
		String upperCS = name.toUpperCase();
		System.out.println(upperCS);
	
	
	System.out.println("*********************");
	//Program  4 print lower cases all characters
	
		String Address= "Washington Street";
		
		String lowerCS= Address.toLowerCase();
		
		System.out.println(lowerCS);

		System.out.println("*********rev555e************");
		//Program 3 reverse out put
		
		String reveAddress= "";
		
		for( int i  = 0; i < city.length(); i ++)
		
		{			
			reveAddress = city.charAt(i) + reveAddress;
			
		}		 
		System.out.println(reveAddress);	
		
		
		
	}
	
	
}

