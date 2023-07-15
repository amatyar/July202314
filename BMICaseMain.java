package Two;

public class BMICaseMain 
{

	public static void main(String[] args) 
	{
		BMICaseSide bmics= new BMICaseSide("Rabindra Amatya", 48, 175, 5, 10);
		System.out.println("The BMI for"+bmics.getName() + "is "+ bmics.getBMI() + "" + bmics.getStatus());
		
		BMICaseSide bmics1 = new BMICaseSide("Rabi Amatya", 175, 10);
		System.out.println("The BMI for"+bmics1.getName() + "is "+ bmics1.getBMI() + "" + bmics1.getStatus());
	}

} 
