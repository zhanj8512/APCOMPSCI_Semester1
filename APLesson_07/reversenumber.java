import java.util.Scanner;
public class reversenumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = kb.nextInt();
		System.out.println(num + "reversed is " + getReverse(num));
		
	}
	
	public static double getReverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev*=10;
			rev+= num%10;
			num/=10;
		}
		
		return rev;
	}
}