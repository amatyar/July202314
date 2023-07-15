package Two;

public class Abstraction1 
{
	public static void main(String[] args) 
	{
		Salary cr = new Salary("Rabindra Amatya", "Boston, MA", 25, 78000);
		Crews cr1 = new Salary(" John", " Boston MA", 2, 4300);
		System.out.println("call mail check using crew's address :");
		cr.mailCheck();
		cr1.mailCheck();
	}
}
abstract class Crews
{ 
	String Name;
	String Address;
	int number;
	
	public Crews(String Nm, String Ad, int sn) 
	{
		System.out.println("Constructing for Crew");
		this.Name = Nm;
		this.Address = Ad;
		this.number = sn;
	}
	public double PayCheck() 
	{
	return 0.00;	
	}
	public void mailCheck() 
	{
		System.out.println("Mailing a check to "+this.Address +"of the Person"+this.Name);
	}
	public String Sorts()
	{
		return Name+" " + Address+" "+ number;
	}
	public  String getName()
	{
		return Name;
	}
	public  String getAddress()
	{
		return Address;
	}
	public  int getMoney()
	{
		return number;
	}
}

class Salary extends Crews
{
	private double salary;
	public Salary(String name, String address , int number, double salary) 
	{
		super(name, address, number);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary)
	{
		if (newSalary >= 0.00) {
			salary =newSalary;
		}
	}
	public double PayCheck()
	{
		System.out.println("paying salary for" + getName());
		return salary/52;
	}
	
}