import java.util.Arrays;

public class June21 {

	public static void main(String[] args) {
		int [] [] arr = 
			{
				{12, 13, 14},
				{22, 34,54},
				{45,67,78}
			};
		
		// for loop
		for( int i = 0; i <arr.length; i++) {
			int [] pra = arr[i];//
			for(int j = 0; j <pra.length; j++) {
				//System.out.println(pra[j]);
				
			}
			System.out.println(Arrays.toString(pra));
			
		}
		
		
		System.out.println("*******Next case********");

		//While loop
		int row = 0;
		
		while(row < arr.length) 
		{
			int app[] = arr[row];
			int col=0;
			while(col < app.length)
			{
				System.out.println(app[col]);
				col++;//
			}
			row++;
		}
		System.out.println("*******Next case********");
		
		// for each loop
		for(int [] a : arr) {
			for(int b: a) {
				System.out.println(b);
				//System.out.println(Arrays.toString(arr));
			}
		}
		
		
		// for 3 dimension 
		
		
		
	}

}
