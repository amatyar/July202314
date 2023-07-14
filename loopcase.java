

public class loopcase {

	public static void main(String[] args) {
		int i;
		for(i= 1; i <10 ; i++)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(i = 1; i<=4; i++) {
			System.out.println("Rabindra");
		}
		System.out.println("***************");
		for(i =10; i>2; i--)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(i =10; i>2; i= i- 2)
		{
			System.out.println(i);
		}
		System.out.println("***************");
		for(i=1; i<9; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		System.out.println("***************");
		for(i=1; i<9; i++) {
			
			if(i == 3)
				break;
			System.out.println(i);
		}
		
		System.out.println("***************");
		for(i=1; i<9; i++) {
			
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}

	}

}
