import java.lang.Math.*;

public class milesperhour
{
	private int distance, hours, minutes;
	private double mph;
	
	public milesperhour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public milesperhour(int dis, int hrs, int min)
	{
		distance = dis;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setDistance(int dis)
	{
		distance = dis;
	}
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	public void setMinutes(int min)
	{
		minutes = min;
	}
	public void setMph()
	{
		mph = 0;
	}
	public int getDis()
	{
		return distance;
	}
	public int getHrs()
	{
		return hours;
	}
	public int getMin()
	{
		return minutes;
	}
	public double calcmph()
	{
		mph = Math.round(distance / (hours + minutes / 60));
		return mph;
	}
	
	
}