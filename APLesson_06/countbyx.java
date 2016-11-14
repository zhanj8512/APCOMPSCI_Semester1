import java.util.Scanner;
public class countbyx

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = kb.nextInt();
		System.out.println("Enter number2");
		int num2 = kb.nextInt();
		
		for (int i = num1; i <= num2; i+=2 )
		{
			System.out.println(i + "\t ");
		}
		
		
		
	}
}