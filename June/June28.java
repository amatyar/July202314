package June;
import java.util.Arrays;

public class June28 
{

	public static void main(String[] args) 
	{
		int [] numbers = new int[3];
		numbers[0]= 45;
		numbers[1]= 55;
		numbers[2]= 15;
		
		int [] number2= {78,89,36};
		
		String [] Words = new String[2];
		Words[0] = "Boston";
		Words[1]="Quincy";
		
		String [] MyWord= 
			{
					"Massachussett", "New York"
			};
		
		for( int i = 0; i <numbers.length; i++) 
		{
			System.out.println(numbers[i]);
		}
		System.out.println(Arrays.toString(numbers));
		//While loop
		int t = 0;
		while(t < numbers.length )
		{
			System.out.println(numbers[t]);
			t++;
		}System.out.println(Arrays.toString(numbers));
		
		// For each loop
		for(int a: numbers)
		{
			System.out.println(a);
		}
		
		System.out.println("********* End Case*********");
		for( int j = 0; j <number2.length; j++) 
		{
			System.out.println(number2[j]);
		}
		System.out.println(Arrays.toString(number2));
		//While loop
		int tt = 0;
		while(tt < number2.length )
		{
			System.out.println(number2[tt]);
			tt++;
		}System.out.println(Arrays.toString(number2));
		System.out.println("********* End Case*********");
		// For each loop
		for(int aa: numbers)
		{
			System.out.println(aa);
		}
		System.out.println("********* End Case*********");
		for( int K = 0; K <Words.length; K++) 
		{
			System.out.println(Words[K]);
		}
		System.out.println("********* End Case *********");
		int p= 0;
		while(p < Words.length) {
			System.out.println(Words[p]);
			p++;
		}
		
		
		// For each loop
		for(String sa: Words)
		{
			System.out.println(sa);
		}
		
		System.out.println("********* End Case*********");
		for( int K1 = 0; K1 <MyWord.length; K1++) 
		{
			System.out.println(MyWord[K1]);
		}
		System.out.println("********* End Case*********");
		int p1= 0;
		while(p1 < MyWord.length) {
			System.out.println(MyWord[p1]);
			p1++;
		}
		System.out.println("********* End Case*********");
		// For each loop
		for(String sa1: MyWord)
		{
			System.out.println(sa1);
		}
		
		System.out.println("********* End Case*********");
		String str = "I am going to join class.";
	    
	    String [] j = str.split(" "); 
	    for(String Newstr:j) {
	      System.out.println(Newstr + "");
	    }System.out.println(Arrays.toString(j));
		
	}

}
