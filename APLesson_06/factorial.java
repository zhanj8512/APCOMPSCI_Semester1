import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();
		int factorial = 1;
		factorial(num, factorial );
	}	
		
	public static void factorial(int num, int factorial)
	{
		for(int i=num; i >=1; i--)
	{
		factorial = factorial*i;
		
	}
	System.out.println(factorial);
	
	}
	
	
}