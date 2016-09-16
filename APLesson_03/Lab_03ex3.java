import java.util.Scanner; //import Statement

public class Lab_03ex3
{
	public static void main(String[]args)
	{
		//Instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your math grade?");
		double math = keyboard.nextDouble();
		System.out.println("What is your science grade?");
		double science = keyboard.nextDouble();
		System.out.println("What is your history grade?");
		double history = keyboard.nextDouble();
		System.out.println("What is your english grade?");
		double english = keyboard.nextDouble();
		System.out.println("What is your art grade?");
		double art = keyboard.nextDouble();
		double gpa = (math + science + history + english + art)/5;
		System.out.println("Your grade point average is" + gpa);
		
	}
}