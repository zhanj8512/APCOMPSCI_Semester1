import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius:");
		r = kb.nextDouble();
		double area = calcArea(r);
		System.out.printf("The area of a circle with a radius of " +r+ " is %.5f ", area);
		
	}
	public static double calcArea(double r)
	{
		return (3.14)*(r * r);
	}
}