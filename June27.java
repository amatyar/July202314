
public class June27
{
	public static void main(String[] args) 
	{
		Students01 stu= new Students01(25 ,2005 ," Allston, MA 02154", " Rabindra Amatya");
		
		System.out.println(stu.id+ ","+stu.contact+","+ stu.Name+","+ stu.year);
		
	}
}
class Students01
{
	int id, year;
	String Name, contact;
	
	public Students01(int ID, int Year, String Contact, String name) 
	{
		this.id= ID;
		this.year= Year;
		this.contact = Contact;
		this.Name = name;
	}
	
}



