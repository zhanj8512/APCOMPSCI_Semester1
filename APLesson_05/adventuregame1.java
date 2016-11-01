import java.util.Scanner;
public class adventuregame1
{
	public static void main(String[]args)
	{
			Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to.." +
		                         "\n 1. Answer a personal question" +
								  "\n 2. Answer a geography question");
		int personalOrGeography = kb.nextInt();
		if(personalOrGeography == 1)
		{
			 System.out.println("Do you like cats or dogs?");
		  String choice = kb.next();
		  if(choice.equals("cats"))
		  {
			  System.out.println("Great choice! Cats are the best");
			 
		  }
		  else
			    System.out.println("Wrong answer! you lose!");
			  
		}
		else
		{
			System.out.println("Which continent is the country Benin located on?");
			 String answer= kb.nextLine();
			 if(answer.equals("Africa"))
			 {
				  System.out.println("Good job! You got it right!");
			 }
			 else
			 {
				 System.out.println("Incorrect! You lose!");
			 }
		}
	}
}