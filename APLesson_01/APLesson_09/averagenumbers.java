public class averagenumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100 + 1);
		}
		
		System.out.println("Numbers...");
		for(int number : numbers)
		{
			System.out.print(number + " ");
		}
		
		System.out.println("\nThe average of the numbers above is " + avg(numbers));
	}
	
	public static double avg(int[]numbers)
	{
		int variable = 0;
		for(int number : numbers)
		{
			variable += number;
		}
		
		return (double)variable/numbers.length;
	}
}