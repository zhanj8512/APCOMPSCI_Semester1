import java.util.Scanner;
public class graphtable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = kb.nextInt();
		System.out.println("Enter table size");
		int size = kb.nextInt();
		
		for (int i = 1; i <=size; i++)
		{
			System.out.printf("%8d %8d \n", i, i*i);
		}
		
	}
}