import java.util.Scanner;
public class Average

{
static double num1;
static double num2;
static double num3;
static double avg;

public static void main(String[]args)
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter number1");
	num1 = kb.nextDouble();
	System.out.println("Enter number2");
	num2 = kb.nextDouble();
	System.out.println("Enter number3");
	num3 = kb.nextDouble();
	double avg = calcAvg(num1, num2, num3);
	System.out.printf("The average of " +num1+ "," +num2+ ",and " +num3+ " is %.5f", avg);
}
public static double calcAvg(double one, double two, double three)
{
	return (num1 + num2 + num3)/(3);
}
}