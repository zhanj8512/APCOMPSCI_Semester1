import java.util.ArrayList;
import java.util.Arrays;
public class keepcomposites
{
	static ArrayList<Integer> numbs;
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		numbs = new ArrayList<>(Arrays.asList(numbers));
		
		removePrimes();
		
		System.out.println(numbs);
	}
	public static int gFactor(int n)
	{
		for (int i = 2; i<n; i++)
		{
			if (n%i == 0)
				return 1;
		}
		return 0;
	}
	public static void removePrimes()
	{
		for (int i = 0; i<numbs.size(); i++)
			if (gFactor(numbs.get(i)) == 0)
				numbs.remove(i);
	}
}