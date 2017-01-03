import java.util.Scanner;

public class firstletter
{
	public static void main(String[]args)
	{
	 
	   
		Scanner kb = new Scanner(System.in);
		String[] strings = new String[5];
		
		System.out.println("enter five strings");
		for(int i = 0; i < strings.length; i++)
		{
			strings[i] = kb.next();
		}
		
		firstLetter(strings);
	}
	
	public static void firstLetter(String[]strings)
	{
		for(String string : strings)
		{
			System.out.println(string.substring(0,1));
		}
	}
}