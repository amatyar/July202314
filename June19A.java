import java.util.Arrays;

public class June19A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Start---\n\n");
		String city = "Jaipur";
		String s2= city.substring(1, 3);
		System.out.println(s2);
		//Boolean 
	
		System.out.println("------End");
		
		System.out.println("Start---\n\n");
		String city1= "Boston";
		boolean a= city1.endsWith("on");
		System.out.println(a);
		System.out.println("------End");

		
		System.out.println("Start---\n\n");
		//Replace first ()
		String sentence= " We are lurning Jave for Selenium, I am too.";
		String s1= sentence.replace("I", "We");
		System.out.println(s1);
		System.out.println("------End");
		
		System.out.println("Start---\n\n\n");
		//Replace ALL ()
		String sentence1= " We are lurning Jave for Selenium";
		String s22= sentence1.replaceAll("a", "We");
		System.out.println(s22);
		System.out.println("------End");
		
		
		System.out.println("Start---\n\n");
		//concat ()
		String sentence11= " We are batch Q012";
		
		String s3= sentence1.concat(sentence11) ;
		System.out.println(s3);
		System.out.println("------End");
		
		System.out.println("Start---\n\n\n");
		//contain ()
		
		boolean b1 = sentence1.contains("Q012");
	
		System.out.println(b1);
		System.out.println("------End");
		
		System.out.println("Start---\n\n\n");
		//equal ()
		//String sentence11= " We are batch Q012";
		String  sen = " We are batch q012";
		boolean s13= sentence11.equals(sen) ;
		System.out.println(s13);
		System.out.println("------End");
		
		
		System.out.println("Start---\n\n");
		//equal Ignore cases ()
		//String sentence11= " We are batch Q012";
		String  sen1 = " We are batch q012";
		boolean s12= sentence11.equalsIgnoreCase(sen1) ;
		System.out.println(s12);
		System.out.println("------End");
		
		System.out.println("Start---\n\n");
		//trim ()
		//String sentence11= " We are batch Q012";
		String  sen2 = " We are batch q012  ";
		System.out.println(sen2.length());
		String c2= sen2.trim();
		System.out.println(c2);
		System.out.println(c2.length());
		System.out.println("------End here check\n");
		
		String message = "Java is a good programming language for selenium.";
		String[] result = message.split(" ");//split string from space		
		for(String str : result)
		{
			System.out.println(str + " ");
		}System.out.println(Arrays.toString(result));
		System.out.println("------End here check\n");
		String city10 = "I am learning javascript";
		String[] s5 = city10.split(" "); //{"I","am","learning","javascript"}
		String[] s6 = city10.split("a"); //{"I ,"m" "le","rning j","v","script"}
		for(String strg : s5)
		{
			System.out.println(strg + " , ");
		}System.out.println(Arrays.toString(s5));
		System.out.println("------End\n");
		for(String strg1 : s6)
		{
			System.out.println(strg1 + " , ");
		}
		System.out.println("------End\n");
		String Mcity = "Java ia a good language";
		String[] sd= Mcity.split(" ");
		for(String sdp : sd) // same  as for(int i = 0; i < Mcity.lenght; i++ )
		{
			System.out.println(sdp + " , ");
		}
		
		String s = "Welcome to Boston for all";
		String[] resul = s.split(" ");
		for(String re : resul) {
			System.out.println(re + " / ");
		//System.out.println(s.split(String separator: " "));
		
		}
		
		String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };

		for (String fruit : fruits) {
		    // fruit is an element of the `fruits` array.
		}
		//which is essentially equivalent of

		for (int i = 0; i < fruits.length; i++) {
		    String fruit = fruits[i];
		    // fruit is an element of the `fruits` array.
		}
		
		String city110 = "I am learning js";
		
		String [] j = city110.split(",");  // {"I","am","learning","js"};
		for(String cc:j) {
			System.out.println(cc);
		}
	}

}
