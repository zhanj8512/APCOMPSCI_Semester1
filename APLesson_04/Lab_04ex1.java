import java.util.Scanner; //import Statement

public class Lab_04ex1
{
	public static void main(String[]args)
	{
		//new test object
		Lab_04ex1 receipt = new Lab_04ex1();
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//3 sets of variables - 1 for each item
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item2: ");
		String item2 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item3: ");
		String item3 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("<<<<<<<receipt>>>>>>>");
		
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		
		
		double subtotal = (price1+ price2 + price3);
		receipt.format("Subtotal: ", subtotal);
		//do the same thing for tax and total
		
	}
	
	public void format(String item, double price)
	{
		//formatting statement goes here
		//use item and price in your format
		System.out.printf("%10s  %10.2f\n", item, price);
	}
}
		

