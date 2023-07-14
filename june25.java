import java.util.Arrays;

public class june25 {

	public static void main(String[] args) 
	{
		Flower flower= new Flower("rose\t", 10 , 'A'); //object
		flower.ColorOf();
		System.out.println(flower.Name + flower.Num+ flower.Type);
       //String offer = 
        		flower.buy();
        System.out.println(flower.buy());
	}

}
class Flower
{
	String Name;
	char Type;
	int Num;
	
	
	public Flower(String name,int num , char type) 
	{
		this.Name= name;
		this.Num= num;
		this.Type=type;
	}
	public String buy()
	{
		return "if you buy 2 , get one free"; 
	}
	public void ColorOf()
	{
		System.out.println("this is flower seasone."); 
	}
}