package Two;

public class BMICaseSide 
{
	String name;
	int age;
	double weight;
	double height;
	double KG_Pound = 0.45359237; // got value from net
	double Mt_Inch = 0.0254;
	double Inch_ft = 12;	
	//Construct for BMI
	public BMICaseSide(String nm, int ag, double wg, double ht)
	{
		this.name   = nm;
		this.age    = ag;
		this.height = ht;
		this.weight = wg;		
	}
	public BMICaseSide(String nm, double wg, double ht)
	{
		this(nm, 42, ht, wg);		
	}
	public BMICaseSide(String nm, int ag, double wg, double feet, double inches)
	{
		this(nm, ag, wg, inches + feet * 12);
		
	}
	// Method
	public double getBMI()
	{
		double bmi = weight * KG_Pound/((height *Mt_Inch) * (height * Mt_Inch)); //BMI = weight ÷ height * height
		return Math.round(bmi * 100)/ 100.00;
	}

	public String getStatus()
	{
		double bmi = getBMI();
		if(bmi < 18.5)
			return "Under wight";
		else if(bmi <25)
			return "Normal";
		else if (bmi < 30)
			return "Over weight";
		else
			return "Over dangerous";
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}public double getWeight()
	{
		return weight;
	}public double getheight()
	{
		return height;
	}
}
