public class Lesson_04
{
	public static void main(String[]args)
	
	{
		Lesson_04 form = new Lesson_04();

		String word1 = "blah";
		double number1 = 4343.45; 
		form.format(word1, number1);
		
		String word2 = "Mayo";
		double number2 = 2.9;
		form.format(word2, number2);
	//new test object
	Lab_04ex2 idcard = new Lab_04ex2 ();
	//new scanner object
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Enter your first name");
	String first = kb.nextline();
	
	System.out.println("Enter yiour last name");
	String last = kb.nextline();
	
	System.out.println("Enter your title");
	String title = kb.nextline();
	
	System.out.println("Enter school year");
	Int school = kb.nextint();
	kb.nextline();
	
		
		
		
	}
	
	public void format(String word, double number)
	{
		System.out.printf("%6s  %6.2f", word, number);
	}
}
