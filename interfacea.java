import java.lang.Math;

/*
 * @author Rabindra
 */
public class interfacea
{
	public static void main(String[] args) 
	{
		Triangle T1 = new Triangle(5, 6, 8);
		T1.area();
		T1.getPerimeter(3,4,5);
		
	}
}
interface poly
{
	void area();
	default void getPerimeter(int... sides)
	{
		int perimeter = 0;
		for(int side : sides) 
		{
			perimeter += side;
		}
		System.out.println("Perimeter: "+ perimeter);
	} 
}
class Triangle implements poly
{
	private int a,b,c;
	private double s, area;
	
	public Triangle(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		s = 0;
	}

	@Override
	public void area() {
		s =(double)(a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area:"+this.area);
	}
}
