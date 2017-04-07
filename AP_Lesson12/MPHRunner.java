import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Distance: ");
		int distance = kb.nextInt();
		System.out.println("Hours: ");
		int hours = kb.nextInt();
		System.out.println("Minutes: ");
		int minutes = kb.nextInt();
		
		milesperhour object = new milesperhour(distance, hours, minutes);
		
		System.out.println(object.getDis() + " miles in " + object.getHrs() + " hours and " + object.getMin() + " minutes = " + object.calcmph() + " mph");
		
		
	}
}