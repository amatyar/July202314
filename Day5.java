package Two;

public class Day5 {

	public static void main(String[] args) {
		//Comparison cases
		// true / false cases
		System.out.println(55 > 66);
		System.out.println(55 < 66);
		System.out.println(5 >= 6);
		System.out.println(55 != 66);
		System.out.println(55 == 66);
		System.out.println(66 > 66);
		
		
		
		//logical
		// for &&
		
		System.out.println(66 == 66 && 88 == 88);
		System.out.println(55 != 66 && 77== 88);
		System.out.println(55 == 66 && 77 != 88);
		System.out.println(55 != 66 && 77 != 88);
		
		// for ||
		
		System.out.println(66 == 69 || 89 == 88);
		System.out.println(55 == 55 || 77 == 88);
		System.out.println(55 == 66 || 77 == 77);
		System.out.println(55 == 55 || 88 == 88);

	}

}
