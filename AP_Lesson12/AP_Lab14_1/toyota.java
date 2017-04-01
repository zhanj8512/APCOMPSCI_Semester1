public class toyota extends car
{
	private double j;
	private double z;
	private double[] locate;
	
	public toyota(String loc)
	{
		String[] locate = loc.split(", ");
		j = Double.parseDouble(locate[0]);
		z = Double.parseDouble(locate[1]);
	}
	
	public int getid()
	{
		return (int)(Math.random() * 100000);
	}
	
	public void move(double x, double y)
	{
		j += x;
		z += y;
	}
	
	public double[] getloc()
	{
		double[] locate = {j,z};
		return locate;
	}
}