package Two;

public class NewInheritance 
{
	public static void main(String[] args) 
	{
		Employees emp =  new Employees("Rabindra", "Amatya ", 3868, "Builder");
		System.out.println(emp.getFirstName() +""+emp.getLastName()+ " (" + emp.getEmployeeId()+")");

	}
}
class People12
{
	String firstName;
	String lastName;
	//constructor
	public People12(String FName, String LName) 
	{
		this.firstName = FName;
		this.lastName  = LName;	
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getlastName() 
	{
		return lastName;
	}
}

class Employees extends People12
{
	int EmpID;
	String JobTitle;
	public Employees(String FName, String LName, int empId, String job )
	{
		super(FName, LName);
		this.EmpID = empId;
		this.JobTitle = job;		
	}
	public int getEmployeeId()
	{
		return EmpID;			
	}
	// overriding 
	public String getLastName()
	{
		return super.getlastName()+ ", " +JobTitle;
	}
}
