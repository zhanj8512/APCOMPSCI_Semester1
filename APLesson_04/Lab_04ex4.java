import java.util.Scanner;
public class Lab_04ex4
{
	public static void main(String[]args)
	{
		 Lab_04ex4 feet = new Lab_04ex4();
		 
		 double height = 8;
		 double length = 9;
		 double width = 12;
		 double volume = feet.calcVolume(height,length,width);
		 System.out.printf("The volume of your box in cubic feet is %12.2f\n", volume);
		 feet.calcVolume(height, length, width);
		
		 
		 
	}
	public double calcVolume(double height, double length, double width)
	{
		return (height*length*width)/1728;
	}

}