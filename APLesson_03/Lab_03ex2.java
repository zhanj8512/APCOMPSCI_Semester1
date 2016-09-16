import java.util.Scanner; //import Statement


public class Lab_03ex2
{
	public static void main(String[]args)
	{
	//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
 
	System.out.println("What is your height in inches?");
	double height = keyboard.nextDouble();
	System.out.println("What is your weight in pounds?");
	double weight = keyboard.nextDouble();
	
	double bmi = (weight*703/height*height);
	System.out.println(bmi);
	
	}
	
	
	
	
	
	
}