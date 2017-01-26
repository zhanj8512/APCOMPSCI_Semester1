import java.util.Scanner;

public class xando
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][]XandO = new String [4][4];
		
		for(int a = 0; a < XandO.length; a++)
		{
			for (int b = 0; b < XandO[a].length; b++)
			{
				int pick = 1 + (int)(Math.random()*2);
				if (pick == 1)
				{
					XandO[a][a] = "x";
				}
				if (pick == 2) 
				{
					XandO[a][b] = "o";
				}
			}
		}
		for(int a = 0; a < XandO.length; a++)
		{
			for (int b = 0; b < XandO[a].length; b++)
			{
				System.out.print(XandO[a][b] + "\t");
			}
			System.out.println();
		}
	}
}