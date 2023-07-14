
public class June30 
{

	public static void main(String[] args) 
	{ // Array defined for multi array 
		int [] [] marks= {{85,96,89}};
		//for loop
		for(int i = 0; i< marks.length; i++ ) 
		{
			int [] mark = marks[i];
			for(int j = 0; j < mark.length; j++)
			{
				System.out.println(mark[j]);
			}
			
		}
		System.out.println("------- End Case -------\n");
		// for each loop
		for(int []k : marks) {
			int mark1 = k.length;
			for( int l :k)
			{
				System.out.println(l);
			}
		}
		System.out.println("------- End Case -------\n");
		// While loop
		
		int t= 0;
		while (t < marks.length)
		{
			int tt[] = marks[t];
			 int p = 0;
			 while( p < tt.length)
			 {
				 System.out.println(tt[p]);
				 p++;
			 }
			 t++;
		}
		System.out.println("------- End Case -------\n");
		
		System.out.println("------- class Case begin from here -------\n");
		Book bk= new Book();
		bk.pages= 250;
		bk.Name= "Introduction to Java";
		System.out.println(bk.Name + " Book Name  :"+ bk.pages+ " Pages");
		bk.Display();
		bk.DisplayName();
		System.out.println("------- End Case -------\n");
		
		Book2 bk2 = new Book2(300, "Learn to Java core.", 'A');
		System.out.println(bk2.BookName +" Name of Book "+bk2.PageNum+" Pages "+ bk2.type + " Level");
		
	}

}
class Book
{
	int pages;
	String Name;
	
	public void Display() {
		System.out.println(" Please come to read Books.");
	}
		public void DisplayName()
		{
			System.out.println("Book name"+this.Name);
		}
	
}
class Book2
{
	int PageNum;
	String BookName;
	char type;
	
	public  Book2(int pn, String bn, char ty)
	{
		this.PageNum= pn;
		this.BookName = bn;
		this.type = ty;
	}
}
