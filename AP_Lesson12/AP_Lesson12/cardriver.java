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
		
		car car1 = new car(p, i, e, t);
		System.out.print("Your vehicle is ready......\nPaint:\t" + car1.getpaint() + "\nInterior:\t" + car1.getinterior() + "\nEngine:\t" +  car1.getEngine() + "\nTires:\t" + car1.getTires());
	}
}
