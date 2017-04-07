public class gmc extends car
{
    private double j;
    private double z;
    
    public gmc()
    {
        j = 0;
        z = 0;
    }
    public gmc(double x, double y)
    {
        j=x;
        z=y;
    }
    public int getid()
    {
        
       return super.getid();
    }
    public void move(double x, double y)
    {
        j+=x;
        z+=y;
    }
    public double[] getloc() 
    {
        double[] location = new double[2];
		location[0] = j;
		location[1] = z;
		return location;
    }
}
