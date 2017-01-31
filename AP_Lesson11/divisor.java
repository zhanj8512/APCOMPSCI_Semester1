import java.util.Scanner;
public class divisor
{
	public static void main(String[]args)
	{
		int[][]nums = new int [4][4];
		Scanner kb = new Scanner(System.in);
		int num = 1;
		for(int a = 0; a < nums.length; a++)
		{
			for(int b = 0; b < nums[a].length;b++)
			{
				nums[a][b] = 1 + (int)(Math.random() * 100);
				System.out.print(nums[a][b] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		
		int count = 0;
		for(int a = 0; a < nums.length; a++)
		{
			for(int b = 0; b < nums[a].length;b++)
			{
			    if(nums[a][b]%divisor==0)
			    {
			        count++;
			        
			    }
			
			}
		}
		
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}