package Two;

public class Encapsulation {
//the process of hiding the important field from end-user where the behavior of abstraction is implement 
	public double balance;
	private double balances;
	// with encapsulation
	public void setBalance(double balances)
	{
		if(balances <0) 
		{
			//throw new IllegalArgumentException("Balance is less than 0.");
			System.out.println("your balance is very low");
			//System.out.println("Below 0");
		}
		this.balances = balances;
		System.out.println(balances);
	}
	public static void main(String[] args) 
	{
		// without encapsulation
		Encapsulation your= new Encapsulation();
		your.balance = -88.90;
		System.out.println(your.balance);		
		// with encapsulation
		Encapsulation yourbalance = new Encapsulation();
		yourbalance.setBalance(22);
		yourbalance.setBalance(-55);
		
		
	}
	
}

