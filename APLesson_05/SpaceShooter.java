import java.util.Scanner;
public class SpaceShooter

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target: ");
		int target = kb.nextInt();
		int enemeyLoc = (int)(Math.random()*3)+1;


		if (target == enemeyLoc)
			System.out.println("It's a hit!");
		else 
			System.out.println("Keep trying!");
	}
}