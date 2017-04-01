public class honda extends car


{
    
    private double j;
    private double z;
    private double[]location;
    public honda(double[]array)
    {
        location = array;
    }
    public int getid()
    {
        return super.getid();
    }
    public void move(double x, double y)
    {
        x+=j;
        y+=z;
    }
    
    public double[] getloc()
    {
        return location;
    }
    
   
}