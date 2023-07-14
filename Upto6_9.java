
public class Upto6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Program 1 , switch case without break statement
		
		String city = "Boston";
		switch(city)
		{
		case "Boston":
			System.out.println("MA");
		case "New York":
			System.out.println("NY");
		case "Reston":
			System.out.println("VA");
		case "Dallas":
			System.out.println("TX");
		case "Los Angeles":
			System.out.println("CA");
			default:
				System.out.println("Please check it once, you enter incorrect word.");
			
		}
		
		System.out.println("\n****************************\n\n");
		
		// Program 2 switch case with break statement
		
		String city1 = "Boston";
		switch(city1)
		{
		case "Boston":
			System.out.println("MA");
			break;
		case "New York":
			System.out.println("NY");
			break;
		case "Reston":
			System.out.println("VA");
			break;
		case "Dallas":
			System.out.println("TX");
			break;
		case "Los Angeles":
			System.out.println("CA");
			break;
			default:
				System.out.println("Please check it once, you enter incorrect word.");
			
		}
		
		System.out.println("\n****************************\n\n");
		// Program 3 switch case with break statement and multiple cases
		
		String city2 = "Boston";
		switch(city2)
		{
		case "Boston":
		case "Allston":
		case "Braintree":
			System.out.println("MA");
			break;
		case "New York":
		case "Buffalo":
		case "Queens":
			System.out.println("NY");
			break;
		case "Reston":
		case "Handerson":
		case "Winchester":
			System.out.println("VA");
			break;
		case "Dallas":
		case "Houston":
		case "Irven":
			
			System.out.println("TX");
			break;
		case "Los Angeles":
		case "San Joshe":
			System.out.println("CA");
			break;
			default:
				System.out.println("Please check it once, you enter incorrect word.");
			
		}
	}

}
