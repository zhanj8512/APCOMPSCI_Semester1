import java.util.Scanner;

public class humandriver 
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Hair: ");
		String h = kb.next();
		System.out.print("Eyes: ");
		String e = kb.next();
		System.out.print("Skin: ");
		String s = kb.next();
		
		human h1 = new human(h, e, s);
		System.out.print("My info......\nHair:\t" + h1.getHair() + "\nEyes:\t" + h1.getEyes() + "\nSkin:\t" +  h1.getSkin());
		
		human h2 = new human();
		h2.setHES("black", "white", "brown");
		System.out.print("\nFriend's info......\nHair:\t" + h2.getHair() + "\nEyes:\t" + h2.getEyes() + "\nSkin:\t" +  h2.getSkin());
	}
}