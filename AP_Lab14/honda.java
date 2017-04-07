public class honda implements location
 {
	private double[] location;
	
	public honda (double[] position) 
	{
		location = position;
	}
	
	public int getID() 
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double x, double y) 
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc() 
	{
		return location;
	}
}