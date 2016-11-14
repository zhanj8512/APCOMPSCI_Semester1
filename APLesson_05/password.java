import java.util.Scanner;
public class password
{
	static String user;
	static String pass;
	static String choice1;
	static String choice2 ;
	public static void main(String[]args)
	{
		user = "chickenbobjoe";
		pass = "jalajalapeno";
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your username:");
		choice1 = kb.next();
		System.out.println("Enter your password:");
		choice2 = kb.next();
		System.out.println(passCheck());		
	}
	
	public static String passCheck()
	{
		if(choice1.equals(user) && choice2.equals(pass))
			return "You are granted acess!";
		else
		{
			if(choice1.equals(user))
				return "Your password is incorrect!";
			if(choice2.equals(pass))
				return "Your username is incorrect!";
			else
				return "Your username and password are incorrect!";
				
		}
		
		
	}
}