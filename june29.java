public class june29 
{
	public static void main(String[] args) 
	{
		Rectangle RT= new Rectangle(12, 15);
		int area =RT.getArea();
		System.out.println(area);
		System.out.println("************");
		
		Square sq=new Square(8);
		int SArea= sq.getArea();
		System.out.println(SArea);
	}
}
class Rectangle 
{

	  private int width;
	  private int height;

	  public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	  }

	  public int getArea() 
	  {
		return width * height;
	  }
}
class Square extends Rectangle 
{

	  public Square(int width) 
	  {
		super(width, width);// super is used for call  getArea method
	  }
}
