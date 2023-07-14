
public class ExamJuly9a 
{
	// program 3. write an example for multiple level inheritance(a -> b-> c)
	public static void main(String[] args) 
	{		
		Grandfather gf = new Grandfather("Ram", "Amatya", 98);
		gf.displayNameAge();
		System.out.println("*********case end*******");
		Father4 ft= new Father4("Balbhadra", "Bhakta", "Amatya", 82);
		ft.displayNameAge();
		System.out.println("*********case end*******");
		Son24 sn = new Son24("Rabindra", "n/a", "Amatya", 42, " Working.");
		sn.displayNameAge();	
	}
}
class Grandfather
{ 
	protected String FirstName;
	protected String LastName;
	int age;
	public Grandfather(String fn, String ln, int ag) 
	{
		this.FirstName= fn;
		this.LastName = ln;
		this.age      =ag;
	}
	public void displayNameAge()
	{
		System.out.println("Full Name:"+this.FirstName +" "+this.LastName +"\tAge:\t"+this.age);
	}
	
}
class Father4 extends Grandfather
{
	protected String middleName;

	public Father4(String fn,String md, String ln, int ag) {
		super(fn, ln, ag);
		this.middleName  = md;
	}
	public void displayNameAge()
	{
		System.out.println("Full Name:"+this.FirstName +" "+this.middleName+" "+this.LastName +"\tAge:\t"+this.age);
	}
}
class Son24 extends Father4{
	private String job;
	public Son24(String fn, String md, String ln, int ag, String jb) {
		super(fn, md, ln, ag);
		this.job = jb;
	}
	public void displayNameAge()
	{
		System.out.println("Full Name:"+this.FirstName +" "+this.middleName+" "+this.LastName +"\tAge:\t"+this.age + "\t Job\t"+this.job);
	}

	
}