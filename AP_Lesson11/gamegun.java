import java.util.Scanner;

public class gamegun
 {
	static int BulletCount;
	static int CLIPSIZE = 16;
	static int ShotCount;
	static String[] clip;
	
	public static void main (String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		BulletCount = 96; 
		ShotCount = 0;
		clip = new String[CLIPSIZE]; 
		resetClip();
		
		while (BulletCount > 0 || ShotCount > 0) 
		{
			System.out.print("Action: ");
			String action = kb.next();
			
			if (action.equals("r")) 
			{
				reload();
			}
			else if (action.equals("s")) 
			{
				System.out.println(shoot());
			}
			
			printClip();
		}
		
		System.out.println("Out of bullets!!!");
	}
	
	public static void resetClip () 
	{
		for (int i = 0; i < clip.length; i++) 
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot () 
	{
		if (ShotCount > 0) 
		{
			clip[ShotCount-1] = "[] ";
			ShotCount--;
			return "Boom!";
		}
		else 
		{
			return "Reload!";
		}
	}
	
	public static void reload () 
	{
		if (BulletCount >= CLIPSIZE) 
		{
			BulletCount -= CLIPSIZE;
			ShotCount = CLIPSIZE;
		}
		else 
		{
			ShotCount = BulletCount;
			BulletCount = 0;
		}
		
		resetClip();
		for (int i = 0; i < CLIPSIZE; i++) 
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip () 
	{
		String output = "Bullets:" + " \t" + BulletCount + "\n "+ "Clip:+" + " \t";
		for (int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}