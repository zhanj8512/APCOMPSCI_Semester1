public class toyota implements location
{
	private double[] location = new double[2];
	
	public toyota (String lo)
	{
		String[] loc = lo.split(", "); 
		location[0] = Double.parseDouble(loc[0]);
		location[1] = Double.parseDouble(loc[1]);
	}
	public int getID()
	{
		return (int)(Math.random()*999999)+1;
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