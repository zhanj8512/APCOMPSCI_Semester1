import java.util.Scanner;
public class bmi
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your height in inches");
		double height = kb.nextDouble();
		System.out.println("Enter your weight in pounds");
		double weight = kb.nextDouble();
		double BMI = (703 * weight)/(height*height);
		
		String condition = calcCondition(BMI);
		System.out.println("Your body mass index is" + BMI);
		System.out.println("You are" + condition);
	}
	
	public static String calcCondition(double BMI)
	{
		if (BMI < 18.5)
			return "underweight";
		else if (BMI < 25)
			return "normal";
		else if (BMI < 30)
			return "overweight";
		else if (BMI < 35)
			return "obese";
		else if (BMI < 40)
			return "very obese";
		else 
			return "morbidly obese";
	}

}