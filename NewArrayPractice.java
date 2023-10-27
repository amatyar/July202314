package Two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = new String[] { "Satish", "Ramesh","Rupesh", "Laxmi", "Rupa"};
		
		List<String> names = Arrays.asList(stringArray);
		List<String> Longname = names.stream().filter(x -> x.length() > 4)
				.collect(Collectors.toList());
		System.out.println(Longname);
		//for positive as deposit and negative as withdraw
		Integer[] intArray = new Integer[] {11,22,34,-55,66,-77,-88,44,55};
		List<Integer> trans = Arrays.asList(intArray);
		  List<Integer> deposits = trans.stream().filter(x -> x > 0).collect(Collectors.toList());
		  System.out.println(deposits);
		  
		  List<Integer> withdrawls = trans.stream().filter(t -> t < 0).collect(Collectors.toList());
		  System.out.println(withdrawls);
		  
		  
		  //for ages and birth year
		  Integer[] intArrayA = new Integer[] {1988,1989,1990,1991,1992,1993};
		  List<Integer> birthYear = Arrays.asList(intArrayA);
		  List<Integer> ages=birthYear.stream().map(x->2023-x).collect(Collectors.toList());
		  System.out.println(ages);
		  
		  //for table of two
		  Integer[] intArrayAB = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		  List<Integer> tables = Arrays.asList(intArrayAB);
		  List<Integer> twoTable = tables.stream().map(x -> x * 2).collect(Collectors.toList());
		  System.out.println(twoTable);
		  
		  //program4
		  Integer[] intArr = new Integer[] {21,12,32,45,51,68};
		  List<Integer> numbers = Arrays.asList(intArr);
		  int len = intArr.length;
		  int sum = numbers.stream().reduce(0,(x,y)->x+y);
		  System.out.println(sum+"\tSum");
		  System.out.println(sum/len+"\tAverage");
		  
//		  int [] nums = {11,22,33};
//		  int total = 0;
//		  for(int i = 0 ; i < nums.length ; i++) {
//		   total = total + nums[i];
//		  }
//		  System.out.println(total);
		  
		  //Adding welcome in front of Name 
		  String[] strArray = new String[] { "Satish", "Ramesh","Rupesh", "Laxmi", "Rupa"};
		  List<String> Happy = Arrays.asList(strArray);
		  Happy.stream().forEach(name -> System.out.println("Welcome\t"+ name+"\tNamastya"));
	}

}
