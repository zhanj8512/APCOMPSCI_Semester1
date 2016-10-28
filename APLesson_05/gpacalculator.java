import java.util.Scanner;
public class gpacalculator

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your math grade:");
		String math = kb.next();
		System.out.println("Enter your science grade:");
		String science = kb.next();
		System.out.println("Enter your english grade:");
		String english = kb.next();
		System.out.println("Enter your history grade:");
		String history = kb.next();
		System.out.println("Enter your humantites grade:");
		String humanities = kb.next();
		System.out.println("Enter your PE grade:");
		String PE = kb.next();
		System.out.println("Enter your arts grade:");
		String arts = kb.next();
		
		double gPoints = calcPoints(math) + calcPoints(science) + calcPoints(english) + calcPoints(history) + calcPoints(humanities) + calcPoints(PE) + calcPoints(arts);
		double GPA = gPoints/7;
		
		System.out.printf("Your GPA is %.2f", GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		return 0.0;		
	}
}