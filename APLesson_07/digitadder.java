import java.util.Scanner;
public class digitadder

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= kb.nextInt();
		System.out.println("The sum of the digits in " + num + "is " + sumDigits(num));
	}
	
	public static double sumDigits(int num)
	{
		int sum = 0;
		while(num>0)
		{
			sum += num%10;
			num/=10;
			
		}
		
		return sum;
	}
	
	
}