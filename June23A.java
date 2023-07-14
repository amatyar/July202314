import java.util.Arrays;

public class June23A {

	public static void main(String[] args) {
		Movie SpiderMan = new Movie(" Spider Man 2 ", 12.50);
		String Ab = SpiderMan.TypeOfMovie();
		
		System.out.println("Your Movie name, Price :" + SpiderMan.Name +","+ SpiderMan.Money);
		SpiderMan.Duration();
		System.out.println(Ab);
		Movie IronMan = new Movie(" Iron Man Return ", 25.00);		
		String Aby = SpiderMan.TypeOfMovie();
		
		System.out.println("Your Movie name, Price and Type of Movie:" + IronMan.Name+"," + IronMan.Money +"and "+ Aby);
	}

}
 
class Movie
{
	String Name;
	double Money;
	
	public Movie(String Nm, double Mey)
	{
		this.Name = Nm;
		this.Money= Mey;
	}
	
	public String TypeOfMovie()
	{
		return " Action / Commedy";
	}
	public void Duration()
	{
		System.out.println("It's run 3 hours.");
	}
}