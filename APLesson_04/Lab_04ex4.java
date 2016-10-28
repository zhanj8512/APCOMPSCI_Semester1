import java.util.Scanner;
public class Lab_04ex4
{
	public static void main(String[]args)
	{
		 Scanner kb = new Scanner(System.in);
		 System.out.println("Enter your height");
		 double height = kb.nextDouble();
		 System.out.println("Enter your length");
		 double length = kb.nextDouble();
		 System.out.println("Enter your width");
		 double width = kb.nextDouble();

		 
		 
		 double volume = calcVolume(height,length,width);
		 System.out.printf("The volume of your box in cubic feet is %12.2f\n", volume);
		 calcVolume(height, length, width);
		
		 
		 
	}
	public static double calcVolume(double height, double length, double width)
	{
		return (height*length*width)/1728;
	}

}