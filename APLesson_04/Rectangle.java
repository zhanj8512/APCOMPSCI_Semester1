import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your length:");
		l = kb.nextDouble();
		System.out.println("Enter your width:");
		w = kb.nextDouble();
		double perimeter = calcPerim(l, w);
		System.out.printf("Your rectangle is %.5f feet around", perimeter );
		
	}
	public static double calcPerim(double one, double two)
	{
		return (l + w + l + w);
	}
}