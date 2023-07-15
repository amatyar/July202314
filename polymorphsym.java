package Two;
import java.util.Arrays;
public class polymorphsym {

	public static void main(String[] args) {
		Processor pro= new Processor();
		int i =44;
		int j = 98;
		int ints[] = { 45,56,36,25,81};
		String objs[]= {"Ralph", "shally", "Duran"};
		pro.process(ints);
		pro.process(objs);
		pro.process(i, j);
		System.out.println("\n*****Override start here****");
		MathProcessor MP= new MathProcessor();
		
		MP.process(i, j);
		MP.process(ints);
		MP.process(objs);

	}

}


class Processor {  //over load process

	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
		
	}

	public void process(int[] ints) {
		System.out.println("Adding integer  in array:" + Arrays.toString(ints));
	}

	public void process(String[] objs) {
		System.out.println("Adding  array:" + Arrays.toString(objs));
		//System.out.println(Arrays.toString(objs));
	} 
		
		
}

class MathProcessor extends Processor 
{

	@Override
	public void process(int i, int j) 
	{
		System.out.println("\n Sum of integers is " + (i + j));
		System.out.println("\n*****start here****");
	}

	@Override
	public void process(int[] ints) 
	{
		int sum = 0;
		for (int i : ints) 
		{
			sum =sum + i;
		}
		System.out.println("\n Sum of integer array elements is " + sum);
		System.out.println("\n*****start here****");
	}
	//System.out.println("\n*****start here****");
	@Override
	public void process(String[] objs) 
	{
		
		int r =0;
		while( r < objs.length) 
		{
			System.out.println(objs[r]);
			
			r++;
		}
		System.out.println("\n***** here111 while loop****");
		System.out.println(Arrays.toString(objs));
		
		System.out.println("\n***** here foreach loop****");
		for(var ra: objs)
		{
			System.out.println(ra);
		}System.out.println(Arrays.toString(objs));
		
	}

}