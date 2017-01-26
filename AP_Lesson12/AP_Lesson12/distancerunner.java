import java.util.Scanner;

public class distancerunner 
{
	public static void main (String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("x1: ");
		int x1 = kb.nextInt();
		System.out.print("y1: ");
		int y1 = kb.nextInt();
		System.out.print("x2: ");
		int x2 = kb.nextInt();
		System.out.print("y2: ");
		int y2 = kb.nextInt();
		
		distance object = new distance(x1, y1, x2, x2);
		System.out.println("distance =  " + object.getdistance());
		object.setValues(0, 0, 1, 1);	
		System.out.println("distance  =  " + object.getdistance());
	}
}