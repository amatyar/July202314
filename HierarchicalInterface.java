
public class HierarchicalInterface 
{
	public static void main(String[] args) 
	{
		Student st = new Student(435, "Rabindra");
		st.NameId();
		System.out.println("**********Next case********");
		Son sn= new Son(25, "Rabindra", "Amatya", "Boston");
		sn.NameFull();
		System.out.println("**********Next case********");
		friend fr= new friend(250, "Rabindra", "Braintree", 5079);
		fr.Phone();
		System.out.println("**********Next case********");
		employee em = new employee(25, "Rabindra", "Manager ", 250090.75);
		em.employ();


	}

}
class Student
{
	protected int Identification;
	private String Name;
	public Student(int id, String nm) 
	{
		this.Identification =id;
		this.Name =nm;
	}
	
	public void NameId()
	{
		System.out.println(this.Name +" ," + this.Identification);
	}
	
}
class Son extends Student
{	private String LastName;
	private String Location;
	public Son(int id, String nm, String ln, String lo) 
	{
		super(id, nm);
		this.LastName = ln;
		this.Location = lo;
		
	}
	public void NameFull() 
	{
	System.out.println( this.LastName + this.Location );
	super.NameId();
	}
}
class friend extends Student
{  
	private String Address;
	protected int phone;
	public friend(int id, String nm, String Add, int ph) 
	{
		super(id, nm);
		this.Address = Add;
		this.phone   = ph;
		
	}
	public void Phone()
	{
		super.NameId();
		System.out.println(this.phone + this.Address);
	}
	
	
}
class employee extends Student
{
	private String Postion;
	private double salary;
	public employee(int id, String nm, String po, double sal) 
	{
		super(id, nm);
		this.Postion = po;
		this.salary  = sal;
	}
	public  void employ() 
	{
		super.NameId();
		System.out.println(this.Postion+"$" +this.salary);
	}
}
