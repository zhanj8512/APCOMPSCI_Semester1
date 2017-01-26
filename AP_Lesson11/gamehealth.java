import java.util.Scanner;
public class gamehealth
{
	static int HEALTHLOAD = 6, healthCount=6;
	static String[] health = new String[HEALTHLOAD];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int damage = 0;
		int amount = 0;
		String turn = "";
		while( !(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2+1);
			amount = (int)(Math.random()*6+1);
			TakeDamage(damage, amount);
			printClip();
		}
		System.out.println("You died!!!!!!");
	}
	public static String TakeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking "+amount+" damage!";
		}
		else 
		
		if(healthCount + damage < HEALTHLOAD)
		{
			healthCount += amount;
		}
		else
		{
			healthCount = HEALTHLOAD;
		}
		return "Power Up"+amount;
	}
	public static void printClip()
	{
		String output = "Health\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if (i < healthCount)
			{
				health[i]= "@";
			}
			else
			{
				health[i]= "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}