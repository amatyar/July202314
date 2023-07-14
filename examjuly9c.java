import java.util.Arrays;

public class examjuly9c {

	public static void main(String[] args) 
	{
		Processor pro= new Processor();
		int x =44, y = 98;
		double t = 9.98, r= 7.25 ;		
		int ints[] = { 45,56,36,25,81};
		pro.process(x, y);
		pro.process(ints);		
		pro.process(t, r);

	}

}
class Processor {  //over load process

	public void process(int x, int y) {
		System.out.printf("Processing two integers:%d, %d\n", x, y);
		
	}

	public void process(int[] ints) {
		System.out.println("Adding integer  in array:" + Arrays.toString(ints));
	}		
	public void process(double t, double r) 
	{
		System.out.printf("two double :\t"+ (t+r));
		
	}
}