

public class HybridInheritance
{

	public static void main(String[] args) 
	{
		son32 s= new son32();
 
		s.DisplayS();
		s.DisplayF();
		s.DisplayG();
		
		System.out.println("---------------");
		Daughter d =  new Daughter();
		d.DisplayD();
		d.DisplayF();
		d.DisplayG();
	}

}
class GrandPa
{
	public void DisplayG()
	{
		System.out.println("this is grand father's house.");
	}
}
class Father extends GrandPa
{
	public void DisplayF()
	{
		System.out.println("This is father's house.");
	}
}
class son32 extends Father
{
	public void DisplayS()
	{
		System.out.println(" this is son's garden");
	}
}
class Daughter extends Father
{
	public void DisplayD()
	{
		System.out.println(" This is Daughter's Apartment");
	}
}