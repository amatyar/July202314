package Two;
import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username, password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username:");
        username = scanner.nextLine();

        System.out.println("Please enter your password:");
        password = scanner.nextLine();

        if (username.equals("myusername") && password.equals("mypassword")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
	}

}
