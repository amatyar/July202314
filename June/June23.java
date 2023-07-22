package June;

public class June23 {

	public static void main(String[] args)
	{
		
		//Creating object
		
		Animal Dog = new Animal();
		Animal Cat = new Animal();
		
		Dog.age= 5;
		Dog.color= " Brown ";
				System.out.println(Dog.age);
				System.out.println(Dog.color);
				
				
		Cat.age = 3;
		Cat.color=" Brown";
		
		Dog.run();
		
		System.out.println("your Cats age, color : " + Cat.age + ","+ Cat.color);
		
		
		
	}
}
	class Animal
	{
		//Properties
		//String name;
		int age;
		String color;
		
		//Methods
		
		public void run()
		{
			System.out.println("this pet run fast.");
		}
		public void eat()
		{
			System.out.println("this pet eat meat only.");
		}
	}


