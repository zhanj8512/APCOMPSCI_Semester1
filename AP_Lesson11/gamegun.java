import java.util.Scanner;
import java.util.Arrays;
public class gamegun
{
	static int BulletCount;
	static int CLIPSIZE = 16;
	static int ShotCount;
	static String[] clip;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		BulletCount = 96;
		ShotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
		
		while(BulletCount > 0 || ShotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.next();
			
			if(action.equals("r"))
			{
				reload();
			}
			if(action.equals("s"))
			{
				System.out.println(Shoot());
			}
			System.out.println(printClip());
		}
	
		System.out.println("out of bullets!!!!!!!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < CLIPSIZE; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String Shoot()
	{
		if(ShotCount > 0)
		{
			clip[ShotCount-1] = "[]";
			ShotCount -= 1;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if(BulletCount >= CLIPSIZE)
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
		
		for(int i = 0; i < ShotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static String printClip()
	{
		String output = "";
		output ="Bullets :" + "\t" + BulletCount + "\nClip:" + "\t";
		for(int i = 0 ; i < CLIPSIZE ; i++)
		{
			output += clip[i];
		}
		
		return output;
	}
	
	
}