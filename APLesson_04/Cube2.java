import java.util.Scanner;
public class Cube2
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number1:");
		num1 = kb.nextDouble();
		System.out.println("Enter number2:");
		num2 = kb.nextDouble();
		System.out.println("Enter number3:");
		num3 = kb.nextDouble();
		calcAverage();
		print();
	}
	public static void calcAverage()
	{
		average = (num1 + num2 + num3)/(3);
	}
	
	public static void print()
	{
		System.out.printf("The average of " +num1+ "," +num2+ ",and " +num3+ " is %.5f", average);
	}
}
