public class albumsales
{
	public static void main(String[]args)
	
	{
		String name = "James Brown";
		int units = 1500000;
		String category = "";
		
		if (units >= 1000000)
			category = "Top seller";
		else if (units >= 500000)
			category = "Good Seller";
		else if (units >= 100000)
			category = "Average seller";
		else
			category = "Needs Review";
		
		System.out.println(name + " = " + category);
		
	}
}