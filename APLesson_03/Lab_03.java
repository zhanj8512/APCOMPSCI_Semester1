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
		
		System.out.println("Seriously? " + name + " is kind of a lame name");
		

		
		//prompt for user imput
		System.out.println("How old are you" +" "+ name);
		
		String old = keyboard.next();
		
		System.out.println( old + "!!" +""+ "That's terrible!");
		
		//prompt for user input
		System.out.println("What do you like to do for fun?");
		
		String like = keyboard.next();
		
		System.out.println(like + " sounds really boring. I kinda feel bad for you");
		
		System.out.println("What instrument do you play?");
		
		String instrument = keyboard.next();
		
		System.out.println("I bet you're dreadful at" +" "+ instrument +" "+ ".Please don't ever play the" +" "+ instrument +" "+ "when you're near me");
		
		System.out.println("What do you want to be when you grow up?");
		
		String be = keyboard.next();
		
		System.out.println("Really?" +" "+"Aren't you a little bit underqualified to be a" +" "+ be +"?");
		
		System.out.println("So" +" "+ name +" "+ "you're" +" "+ old +"..." + "\n" + "You like to play" +" "+ like + "..." +"\n"+ "Good luck on becoming a" +" "+ be + "." + "\n" + "I'm only kiddin'" +" "+ name + "!");
		
		
		
		
	}
}