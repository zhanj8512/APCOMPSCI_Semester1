import java.util.Scanner;
public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a side");
		side = kb.nextDouble();
		double sa = calcSa(side);
		System.out.printf("The surface area of a cube whose sides are " 
+side+ " in legth is %.5f ", sa);
	}
	public static double calcSa(double one)
	{
		return (side * side)*(6);
	}
}