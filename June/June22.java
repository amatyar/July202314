package June;
import java.util.Arrays;
import java.util.Collections;

public class June22 {

	public static void main(String[] args)
	{
		int [][][] number=
			{ 
					{
						{12, 25, 36,10},
					},
					{
						{45,36,11,19},
					},
					{
						{9,5,9,6}
					}
					
			};
		
		for(int i = 0; i < number.length; i++) 
		{ 
			int [][] num = number[i];
			for(int j = 0; j < num.length; j++) // nested or o(n^2)
			{ 
				int [] num1 = num[j];
				for(int k=0; k< num1.length; k++ ) 
				{
				//System.out.println(num1[k]);
				}
				//System.out.println(Arrays.toString(num1));
			}
		}
		//System.out.println(Arrays.toString(number));
		
		System.out.println("*************** End ***********\n\n"); // \n mean next line 
		int [][] arr= new int[2][3];
		// first row 
		arr[0][0] = 3;
		arr[0][1]= 4;
		arr[0][2]= 5;
		// second row
		arr[1][0] = 13;
		arr[1][1]= 54;
		arr[1][2]= 51;
		
		//System.out.println(Arrays.toString(arr));
		for(int a=arr.length-1; a>=0; a--) 
		{
			int arr1[]= arr[a];  // arr1 is internal array , arr is external array
			for(int b= arr1.length-1; b >= 0 ; b--)
			{
				//System.out.println(arr1[b]);
			}
			//System.out.println(Arrays.toString(arr1));
		}
		
		System.out.println("*************** End ***********\n\n"); // \n mean next line 
		int [] marks = {99,100,111,23,45, 55};
		
		//for(int i = 0 ; i < marks.length ; i++) {
			//System.out.println(marks[i]);
		//}
		System.out.println("*************** End ***********\n\n"); // \n mean next line 
		System.out.println("Reverse ------------");
		
		for(int i = marks.length -1 ; i >= 0 ; i-- ) {
			
			System.out.println(marks[i]);
		}
		System.out.println(Arrays.toString(marks));
		System.out.println("*************** End ***********\n\n");
		for( int k : marks)
		{
			System.out.println(k);
		}
		System.out.println("*************** End ***********\n\n");
		Arrays.sort(marks);
		for( int a = marks.length-1; a >= 0; a--) {
			System.out.println(marks[a]);
		}
	}

}
