import java.util.Scanner;
public class strings
{
	public static void main(String[]args)
	{
		String [][] words = new String[4][4];
		Scanner kb = new Scanner(System.in);
		for (int a = 0; a < words.length; a++)
		{
			for (int b = 0; b < words[a].length; b++)
			{
				System.out.println("Enter a word: ");
				words[a][b] = kb.nextLine();
			}
		}
		for (int a = 0; a < words.length; a++)
		{
			for (int b = 0; b < words[a].length; b++)
			{
				System.out.print(words[a][b] + "\t\t");
			}
			System.out.println("");
		}
	}
}