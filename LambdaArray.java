package Two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaArray {

	public static void main(String[] args) 
	{
		List<EmployeeA> emp = new ArrayList<>();
		emp.add(new EmployeeA("Raghu","deshpande",63));
		emp.add(new EmployeeA("Laxmi","Chapagi",38));
		emp.add(new EmployeeA("Naba","Adhikari",36));
		emp.add(new EmployeeA("Payal","Pandya",45));
		emp.add(new EmployeeA("Ganesh","Shrma",45));
		emp.add(new EmployeeA("Prajani","Adhikari",63));
		emp.add(new EmployeeA("Ganesh","Shrma",45));
		emp.add(new EmployeeA("Ganesh","Shrma",45));
		emp.add(new EmployeeA("Ganesh","Shrma",45));

		List<EmployeeA> above30= 
			    emp.stream().filter(x -> x.getAge() > 30)
			    .collect(Collectors.toList());
		above30.forEach(x -> System.out.println(x.DisplayName()));
		System.out.println("-------Next----------");
		// Sorting the people in ascending by their age 
		
		// Sort the list by age in ascending order
   
        		 List<EmployeeA> ascendingSorted = emp.stream()
                 .sorted(Comparator.comparingInt(EmployeeA::getAge))
                 .collect(Collectors.toList());

        // Print the sorted list
        
        		 ascendingSorted.forEach(x->System.out.println(x.DisplayName()));
        		// count the number of people with same age
        		  
        		 Map<Integer, Long> ageCountMap = emp.stream()
        					.collect(Collectors.groupingBy(EmployeeA::getAge, Collectors.counting()));

        			ageCountMap.forEach((age, count) -> {
        				if (count > 1) {
        					System.out.println("Age " + age + ": " + count + " emp");
        				}
        			});

        		  // name of first 3 people where age > 30
        			List<EmployeeA> firstThreeAbove30 = emp.stream().filter(person -> person.getAge() > 30).limit(3)
        					.collect(Collectors.toList());

        			firstThreeAbove30.forEach(person -> System.out.println(person.DisplayName()));

        		  
        		  // distinct name list 
        			List<String> distinctNames = emp.stream()
        			        .map(x -> x.FirstName)
        			        .distinct()
        			        .collect(Collectors.toList());

        			distinctNames.forEach(name -> System.out.println(name));
		
	}

	

}
class EmployeeA{
	String FirstName;
	String LastName;
	int Age;
	
	public EmployeeA(String fn, String ln, int ag)
	{
		this.FirstName = fn;
		this.LastName = ln;
		this.Age = ag;
	}
	
	public String DisplayName() 
	{
		return (this.FirstName+","+this.LastName);
	}
	public int getAge()
	{
		return this.Age;
	}
}