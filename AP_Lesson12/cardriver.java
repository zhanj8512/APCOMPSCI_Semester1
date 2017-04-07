import java.util.Scanner;

public class cardriver
 {
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("paint: ");
		String p = kb.next();
		System.out.print("interior: ");
		String i = kb.next();
		System.out.print("engine: ");
		String e = kb.next();
		System.out.print("tires: ");
		String t = kb.next();
		
		carclass Car = new carclass(p, i, e, t);
		System.out.print("Your vehicle is ready......\nPaint:\t" + Car.getPaint() + "\nInterior:\t" + Car.getInterior() + "\nEngine:\t" +  Car.getEngine() + "\nTires:\t" + Car.getTires());
	}
}
