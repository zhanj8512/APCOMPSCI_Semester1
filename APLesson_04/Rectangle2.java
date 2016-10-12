import java.util.Scanner;
public class Rectangle2
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your length");
		length = kb.nextDouble();
		System.out.println("Enter your width");
		width = kb.nextDouble();
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = (length + length + width + width);
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f feet around", perimeter);
	}
}