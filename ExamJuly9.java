
public class ExamJuly9 
{

	public static void main(String[] args)
	{
		// Program 1. write a function which accept two int , add them and return int
		
		int add = addition(5, 9); // add
		System.out.println("your addition number :"+add);// printout
		System.out.println("--------case end-----------"); 
		
		// Program 2. write a class using construction with 2 properties(fields) and 
		// 1 method and create object of same class
		
		construct ct = new construct(216, "Jose S. Otario");
		ct.DisplayNameNumber();

	}
	public static int  addition(int a , int b) 
	{
		return a + b;// return
	}

}
class construct{
	//properties
	int numberOfCrew;
	String Name;
	//construtcion
	public construct(int noc, String nm) 
	{
		this.Name         = nm;
		this.numberOfCrew = noc;		
	}
	//method
	public void DisplayNameNumber()
	{
		System.out.println("Name :"+ this.Name +"\tNumber:"+this.numberOfCrew);
	}
}