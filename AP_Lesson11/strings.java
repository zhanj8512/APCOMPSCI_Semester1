import java.util.Scanner;

public class strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][]words = new String [4][4];
		
		for(int a = 0; a < words.length; a++)
		{
			for (int b = 0; b < words[a].length; b++)
			{
				System.out.println("Please enter a word:");
				words[a][b] = kb.nextLine();
			}
		}
		for(int a = 0; a < words.length; a++)
		{
			for (int b = 0; b < words[a].length; b++)
			{
				System.out.println(words[a][b] + "\t");
			}
			System.out.println();
		}
	}
}