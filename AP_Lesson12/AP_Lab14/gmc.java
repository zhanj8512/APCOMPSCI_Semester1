public class gmc implements location
 {
	private double x, y;
	
	public gmc (double j, double z) 
	{
		x = j;
		y = z;
	}
	
	public int getID() 
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double j, double z) 
	{
		x += j;
		y += z;
	}
	
	public double[] getLoc() 
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}