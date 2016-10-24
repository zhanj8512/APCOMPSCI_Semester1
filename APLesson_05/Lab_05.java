public class Lab_05
{
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*7);
		int computer = (int)(Math.random()*7);
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		rollDice(player, computer);
		
	}
	
	public static void rollDice(int player, int computer)
	{
		if(player > computer)
			System.out.println("Winner is you");
		if(player < computer)
			System.out.println("Winner is computer");
		
	}
}