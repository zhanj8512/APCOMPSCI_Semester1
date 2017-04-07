import java.lang.Math.*;
public class distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double Distance;
	
	public distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		Distance = 0;
	}
	
	public distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		Distance = 0;
	}
	
	public void setValues(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		Distance = 0;
	}
	
	public double getdistance()
	{
		Distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return Distance;
	}
}