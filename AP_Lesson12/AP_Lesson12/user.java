import java.util.Scanner;

public class user 
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public user (String fN, String lN) 
	{
		firstName = fN;
		lastName = lN;
		avatar = "undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public user (String fN, String lN, String av) 
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
  
	public String toString() 
	{
		return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("first name:  ");
		String fN = kb.next();
		System.out.print("last name:  ");
		String lN = kb.next();
		System.out.print("Would you like to use the public avatar?  ");
		String pubav = kb.next();
		
		if (pubav.equals("yes")) 
		{
			System.out.print("Enter your avatar:  ");
			String av = kb.next();
			user u1 = new user(fN, lN, av);
			System.out.println(u1);
		}
		
		else 
		{
			user u1 = new user(fN, lN);
			System.out.println(u1);
		}
		
		
	}
 
}