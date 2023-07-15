package Two;

public class NewInterface 
{

	public static void main(String[] args) 
	{
		Rectangle tr = new Rectangle();
		tr.getArea(7, 9);

	}

}
interface polygon
{
void getArea(int length, int breadth)	;
}
class Rectangle implements polygon
{
	public void getArea(int length, int breadth)
	{
		System.out.println("the area is " + (length * breadth));
	}
}