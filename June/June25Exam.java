package June;


public class June25Exam {
/*
 * Developed by Rabindra Amatya
 */
	
	
	public static void main(String[] args) 
	{
		// 1. Write a function which add two numbers and return a int 
		 int sum = add(4,6);
		 System.out.println(sum);
		 
		 System.out.println("*********** End *********");

		 //2.Write a program to reverse the string
		 String word = " Massachussett";
		 String Rev = "";
		 
		 for (int i = 0; i <word.length(); i++) {
			 Rev = word.charAt(i) + Rev;
		 }
		 System.out.println(Rev);
		 System.out.println("*********** End *********");
		 // Write a program to define multi-dimensional array of int and loop using foreach
		 int [][]number = 
		{
				{55,18,29},
				{10,12,15},
				{15,19,65}
		 };
		 
		 for(int j[] : number)
		 {			 
			for( int k : j){
				System.out.println(k);
			}	
			//System.out.println(Arrays.toString(j));
		}
		 
		 System.out.println("*********** End *********");
		 // 4 . Define a string array and using while loop
		 
		 String [] NewWords= {"Washington", "is ", "big", "city."};
		 
		 int t = 0;
		 while(t < NewWords.length)
		 {
			 System.out.println(NewWords[t]);
			 t++;
			 
		 }
		 System.out.println("*********** End *********");
		 
		 // Define a class vehicle with 2 property color and type , and
		 //one method start() and create object using contructor.
		 
		 vehicle22 canmery = new vehicle22("Blue", "sentra");
		 System.out.println("New Toyota car in market:"+ canmery.color+ "\nType of car:"+canmery.type);
		 canmery.start();
		 
	}
	public static int add(int x , int y) {
		return x + y;
	}

}
class vehicle22
{ 
	String color;
	String type;
	
		public vehicle22(String Cl, String Ty) 
		{
			this.color = Cl;
			this.type  = Ty;
			
		}
		public void start() 
		{
			System.out.println("This is new model Toyota car.");
		}
}
	

