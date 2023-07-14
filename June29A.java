import java.util.Arrays;

public class June29A 
{ // create a program with multi dimension  or 2 dimension
	public static void main(String[] args) 
	{
		int [][] num = 
		{	
				//[[]]
			{1,2},// 0 1
			{3,4}	
		};		
		// create for loop
		for(int i = 0; i < num.length; i ++) 
		{
			int [] num1= num[i]; // moving toward small array 
			for(int j = 0; j< num1.length; j++) 
			{
				System.out.println(num1[j]);
			}
			//System.out.println(Arrays.toString(num1));
			
		}
		//for each loop
		
		for(int a[]: num) 
		{
			
			for(int b : a) {
				System.out.println(b);
			}
		}
		
		// while loop
		System.out.println("*****************");
		int p= 0;
		while(p < num.length) 
		{
			int num2[] = num[p];
			
			int q = 0;
			
			while(q < num2.length) 
			{
				System.out.println(num2[q]);
				q++;
			}
			System.out.println(Arrays.toString(num[p]));
			p++;
		}
		
		
		
	}
}
