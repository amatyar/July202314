
public class Practice13 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
 int t = 1;
 while(t <= 3)
	 	{
		 System.out.println(t);
		 t ++;
	 	}
  System.out.println("---------------");
 // Program 2
 
  int t1 =10;
  while(t1 >= 5) 
  {
	  System.out.println(t1);
	  t1 = t1- 5;
     }
	
  System.out.println("---------------");
	//program 3
	
	int p = 2;
	while(p <= 4) 
	{
		System.out.println(" we are in the Java class!\n");
		p++;
	}
	
	 System.out.println("---------------");
	// Program 4
	int R= 4;
	while( R <= 7) 
	{
		System.out.println(R);
		if(R == 5)
		{
			break;
		}
		R++;		
	}
	System.out.println("---------------");
	
	// Program 5
	int y = 1;
	while(y  <= 5) {
		if( y == 4) {
			y++;
			continue;
		}
		System.out.println(y);
		y++;
	}
	
	}

}
