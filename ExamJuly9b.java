
public class ExamJuly9b 
{
// Write an example of method overriding
	public static void main(String[] args) 
	{ int a =7, b=9;
		process24 p2 = new process24();
	
		p2.add(a, b);
		
		processer24 p24 = new processer24();
		p24.add(a, b);

	}



}
class process24
{
	public void add(int a , int b) 
	{
	System.out.println("My two integer :"+ a +", " + b);
	}
}
class processer24 extends process24{
	public void add(int a, int b) {
		System.out.println("My addition is :"+ (a + b));
	}
}