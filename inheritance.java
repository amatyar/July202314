package Two;

public class inheritance 
{
	public static void main(String[] args) 
	{		Employee emp= new Employee(500);
			HR hr =new HR(600);
			
			emp.addSalary();
			emp.work();
			System.out.println("Employee salary: " + emp.salary);
			
			hr.work();
			System.out.println("HR salary: "+ hr.salary);

	}
}
class Employee
{
	int salary;
	public Employee(int sal) {
		this.salary= sal;
	}
	public void work()
	{
		System.out.println("Active emloyee.");
	}
	public int addSalary()
	{
		return salary;
	}
}

class HR extends Employee
{
	HR(int salary)
	{
		super(salary);
	}
	public void work()
	{
		System.out.println("Managing employees.");
	}
	
}