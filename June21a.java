
public class June21a {
// this program is developed for 3 dimension nested array
	public static void main(String[] args) {
		int[][][] ar = 
			{ 
				{ 
					{ 4, 2, 13 }, { 41, 5, 63 } },
				
                { 
						{ 73, 8, 49 }, { 150, 161, 121 } } 
			};
 
		// for loop 
		
		for(int i=0; i < ar.length; i++)
		{
			int[][] arr = ar[i];
			{
				for(int j = 0; j<arr.length; j++) {
					int [] arra= arr[j];
					{
						for(int k = 0; k < arra.length; k++)
						{
							System.out.println(arra[k]);
						}
					}
				}
			}
			
		}
		System.out.println("*******Next case********");

		//While loop
		int row = 0;
		
		while(row < ar.length) 
		{
			int app[][] = ar[row];
			int col=0;
			while(col < app.length)
			{
				int [] r1 = app[col];
				int c1=0;
				while(c1 < r1.length)
				{
					
					System.out.println(r1[c1]);
					c1++;
				}
			
				col++;
			}
			row++;
		}
		System.out.println("*******Next case********");
		
		// for each loop
		for(int [] [] a : ar) {
			for(int [] b: a) {
				for(int c : b)
				System.out.println(c);
			}
		}		
				
	}

}
