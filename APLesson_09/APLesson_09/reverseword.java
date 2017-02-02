import java.util.Scanner;
public class reverseword
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("please enter 5 words: ");
		for(int i = 0; i< words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("these are the words in order...");
		for(String word : words)
		{
			System.out.println(word);
		}
		System.out.println("\nThese are the words in reverse...");
		reverse(words);
	}
	public static void reverse(String[]words)
	{
		for(int i = words.length; i > 0; i--)
		{
			System.out.println(words[i-1]);
		}
	}
}
