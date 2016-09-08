import java.util.Scanner; //import Statement

public class Lab_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Cool! " + name + " is a great name!");
		

		
		//prompt for user imput
		System.out.println("How old are you?");
		
		String old = keyboard.next();
		
		System.out.println( old + " is a great age! ");
		
		//prompt for user input
		System.out.println("What do you like to do for fun?");
		
		String like = keyboard.next();
		
		System.out.println(like + " sounds like a lot of fun!");
		
		
		
		
		
	}
}