import java.util.Scanner; //import Statement

public class Lab_04ex2
{
	public static void main(String[]args)
	{
		//new test object
		Lab_04ex2 idcard = new Lab_04ex2 ();
		//new scanner object
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String first = kb.nextLine();
		
		System.out.println("Enter yiour last name");
		String last = kb.nextLine();
		
		System.out.println("Enter your title");
		String title = kb.nextLine();
		
		System.out.println("Enter your school");
		String school = kb.nextLine();
		
		System.out.println("Enter school year");
		String year = kb.nextLine();
		
		System.out.println("Enter your subject");
		String subject = kb.nextLine();
		
		System.out.println("*****************************");
		idcard.format(school, year);
		idcard.format(first, last);
		idcard.format(title, subject);
		System.out.println("*****************************");
	}
	
	public void format(String one, String two)
	{
		System.out.printf("%20s %20s\n" , one, two);
	}
		
			
		
		
	
	
}
