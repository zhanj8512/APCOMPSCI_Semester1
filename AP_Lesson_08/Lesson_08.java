import java.util.Scanner;
public class Lesson_08
{
	public static void main(String []args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Enter a number");
		System.out.println(countDigits(kb.nextInt());
		
	}
	
	public static int countDigits(int num)
	{
		while(num > 0)
		{
			return 1 + (countDigits(num/10));
		}
		
		return 0;
	}
	
	
}