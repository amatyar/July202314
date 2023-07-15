package Two;

import java.util.Arrays;

public class OverloadingArray 
{
	public static void main(String[] args) 
	{
		int[] ints = {3,4,5,9,1,8};
		char[] cars = {'A','B', 'C','P','R','X', 'Y'};
		String[] str = {"Jane", "Kate","Anne","Pete","Jonney", "Lav"};
		
		OverArray ar= new OverArray();
		ar.arrLoad(ints);
		ar.arrLoad(cars);
		ar.arrLoad(str);
	}
}
class OverArray
{ 	
	public static void arrLoad(int[] ints) 
	{ 
		int sum = 0;
		for(int i = 0; i < ints.length; i ++) 
		{
			System.out.println(ints[i]);
			sum  +=i;
			
			
		}System.out.println("sum is :"+sum);
		 
		for(int i : ints)
		{
			//System.out.println(i);
		}System.out.println(Arrays.toString(ints));
	}
	public static void arrLoad(char[] cars) 
	{
		for(char i : cars)
		{
			//System.out.println(i);
		}System.out.println(Arrays.toString(cars));
	}
	public static void arrLoad(String[] str) 
	{
		for(String i : str)
		{
			//System.out.println(i);
		}System.out.println(Arrays.toString(str));
	}
}