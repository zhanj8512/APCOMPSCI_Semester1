import java.util.Scanner;
public class Lab_05_2

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item1");
		String item1= kb.next();
		System.out.println("Enter price1");
		double price1 = kb.nextDouble();
		System.out.println("Enter item2");
		String item2 = kb.next();
		System.out.println("Enter price2");
		double price2 = kb.nextDouble();
		System.out.println("Enter item3");
		String item3 = kb.next();
		System.out.println("Enter price3");
		double price3 = kb.nextDouble();
		System.out.println("Enter item4");
		String item4 = kb.next();
		System.out.println("Enter price4");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount +tax;
		
		System.out.println("<<<<<<<<<<Receipt>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Tax:", tax);
		format("Total", total);
		System.out.println("___________________________");
		System.out.println("Thank you......Come Again!");
		
		
		
	}
	public static double calcDisc(double subtotal)
	{
		if (subtotal >= 2000)
			return subtotal * 0.15;
		`return 0.0;
	}
	
	public static void format(String item, double price)
	{
		
		System.out.printf("%15s........%15.2f\n", item, price);
		
	}
	
}