package June;

public class june26 
{

	public static void main(String[] args)
	{
		Department Dep= new Department(1012, "Production", "Rabindra", "Amatya");
		System.out.println(Dep.number +" "+Dep.EmployeeFirstName+" "+Dep.EmployeeLastName);
		Dep.Operation();
		System.out.println("****** ");
		Cases A1 = new Cases();
		A1.suspension(5);
		A1.suspension(12, 3);
		A1.suspension(11, 3, 2);
		System.out.println("****** Bird case ****** ");
		
		Bird [] brd = 
		{
				new Bird("Parrot ", 3, " Green"),
				new Bird("Crow ", 6, " Black"),
				new Bird("Sparrow ", 2 ," Brown")
		};
		
		//creating For loop
		for(int i = 0; i < brd.length; i++)
		{
			brd[i].Detail();
		}
		System.out.println("****uuu** ");
		//creating For each loop
		for(Bird abt: brd) 
		{
			abt.Detail();
		}
		System.out.println("****** ");
		//Creating while loop
		 int a= 0;
		 while( a<brd.length)
		 {
			 brd[a].Detail();
			 a++;
		 }
	}

}
class Department
{
	//Properties
	int number;
	String Department;
	String EmployeeFirstName;
	String EmployeeLastName;
	
	public Department(int no, String DP, String FN, String LN) // parameter
	{
		this.number= no;
		this.Department= DP;
		this.EmployeeFirstName= FN;
		this.EmployeeLastName=LN;
		
		
	}
	public void Operation()
	{
		System.out.println(" We operate our department 6:30 AM  to 7:30 PM");
	}
	
	
}

class Cases
{
	public void suspension(int x)
	{
		System.out.println(" we are out of power "+ x);
	}
	public void suspension(int x, int y)
	{
		System.out.println(" we are supplying "+ x + y);
	}
	public void suspension(int x, int y, int z)
	{
		System.out.println(" out shiiping "+ x + y *z);
	}
}
class Bird
{
		String Name;
		int age;
		String Color;
		
		public Bird(String name, int Age, String color)
		{
			this.Name= name;
			this.age= Age;
			this.Color = color;
			
		}
		public void Detail()
		{
			System.out.println(this.Name+",  " + this.age + ","+this.Color);
		}		
		
}

