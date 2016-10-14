import java.util.Scanner;
public class Circle2
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your radius:");
		r = kb.nextDouble();
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		area = (r * r)*(3.14);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with radius of " +r+ " is %.5f ", area);
	}
}