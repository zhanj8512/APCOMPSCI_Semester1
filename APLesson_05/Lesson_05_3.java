import java.util.Scanner;
public class Lesson_05_3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter number1: ");
		int one = kb.nextInt();
		System.out.println("Please enter number2: ");
		int two = kb.nextInt();
		
		boolean even = (one + two)% 2 ==0;
		
		if(even)
			System.out.println("Your number " + (one + two) + " is even");
		
		if(!even)
		System.out.println("Your number " + (one + two) + " is odd");
	}
	
}