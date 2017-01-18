import java.util.Scanner;
public class findthezs
{
    public static String [] words = new String[5];
	
	public static void main(String[]args)
	{
		fillArray();
			
		System.out.println("For these words: ");
		printArray();
        System.out.println(hasZs() + " " + "contains the letter z");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter 5 words: ");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		for (String word: words)
		{
			System.out.println(word);
		}
		
	}
	public static String hasZs()
	{
		String z = "";
		for (String word: words)
		{
			if (word.indexOf("z") >= 0)
			{
				z += word + "";
			}
			
		}
		return z;
	}
}