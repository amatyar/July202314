
public class Vowel
{

	public static void main(String[] args) 
	{
		String str = "welcome to hotel California";
		int conut= 0;
		
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		for ( int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{				
				conut++;				
			}
		}
		System.out.println("Total : \t"+ str.length());
		System.out.println("Voewl elements: "+ conut);
	}

}
