
public class June14A 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Program 3 reverse out put
		String strName= "Rabindra", 
				strName1="",
			strName2="";
        char ch;
        int i;    
            
      for ( i=0; i<strName.length(); i++)
    	  
    	  
      {
       ch= strName.charAt(i); //extracts each character
       strName1  = ch + strName1; //adds each character in front of the existing string
      }
      System.out.println( strName1); // reverse word

			System.out.println(i);	// number of words 
	System.out.println("****************");
	//strName2="";
	for ( i=strName.length()-1; i >=  0; i--) 	  
  	  
    {
     ch =  strName.charAt(i); //extracts each character
     strName2  =  strName2 + ch; //adds each character in front of the existing string
    }
    System.out.println( strName2); // reverse word

			System.out.println(strName.length());	// number of words 
	}

}
