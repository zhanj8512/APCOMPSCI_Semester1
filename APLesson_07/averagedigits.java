import java.util.Scanner;
public class averagedigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num = kb.nextInt();
		System.out.println("The average of the digits in " + num + "is" + avgDigits(num));
	
		
	}
	
	public static double avgDigits(int num)
	{

		int digits = 0;
		int average = 0;
		
		while(num >0)
		{
			digits++;
			average+= num%10;
			num/=10;
			
		}
		
		return average/digits;
	}
}