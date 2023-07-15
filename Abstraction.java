package Two;
public class Abstraction 
{
	public static void main(String[] args) 
	{
		// In Java, abstraction is achieved by interfaces and abstract classes.
		Dog dg = new Dog();
		dg.eat();
		dg.makeNoise();

	}
}
abstract class Animal
{
	abstract void makeNoise();
	
	public void eat()
	{
		System.out.println("Animal food onle please.");
	}
}
class Dog extends Animal
{
	public void makeNoise() 
	{
	System.out.println("Bark at night bhou bhou");	
	}
}