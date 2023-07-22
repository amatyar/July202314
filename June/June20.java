package June;
import java.util.Arrays;

public class June20 {

	public static void main(String[] args) {
		String city10 = "I am learning javascript";
		String[] s5 = city10.split(" "); //{"I","am","learning","javascript"}
		String[] s6 = city10.split("a"); //{"I ,"m" "le","rning j","v","script"}
		
		
		for(String strg : s5)
		{
			System.out.println(strg + " , ");
			
		}
		System.out.println("------End\n");	
		for(String strg1 : s6) //same  as for(int i = 0; i < Mcity.lenght; i++ )
		{
			System.out.println(strg1 + " , ");
		}
		
		//Array cases program 1
		System.out.println("------End\n  Program1");
		//Program 1 define array  and print out
		int [] arr = new int[4];
		arr[0] = 4;
		arr[1] = 14;
		arr[2] = 24;		
		arr[3] = 34;
		System.out.println(Arrays.toString(arr)); // to print array
		System.out.println(arr[2]);
		System.out.println("------End\n reverse");
		
		for (int k = arr.length-1; k >= 0; k--)
		{
			System.out.println(arr[k]);
		}
		
		// array with string Program 2
		
		String [] arra= new  String[4];
		arra[0] = "Boston";
		arra[1] = "New York";
		arra[2] = "Quincy";
		arra[3] = "Rockland";
		System.out.println(Arrays.toString(arra));// print array
		for(int i =0; i < arra.length; i++)
		{
			
			System.out.println(arra[i]);
		}
		System.out.println("------End\n");
		// program 3 print program 1 reverse
		for (int i = arr.length -1; i >=0; i --)
		{
			System.out.println(arr[i]);
		}
		
		// program 4 using while loop in program 1
		System.out.println("------End22\n");
		
		int [] arr1 = {22, 34,76,78,23, 45};
		 
		int b1 = 0;
		while(b1 < arr1.length) {
			System.out.println(arr1[b1]);
			
			b1 = b1 + 1;
		}	
		System.out.println("------End22\n");
		
		// Program 5 for each loop
		String [] testing= {"string", "loop", "public", "constant", "scenarios" };
		for(String sys : testing) {
			System.out.println(sys);
		}
		System.out.println("------End22\n");
		
		// add new array 
		int n = arr1.length;
		int newArr[] = new int[n+1];
		int value = 101;
		System.out.println(Arrays.toString(arr1));
		for(int i = 0;i <n; i++)
		{
			newArr[i] = arr1[i];
		}
		newArr[n] = value;
		System.out.println(Arrays.toString(newArr));
		
	}

}
