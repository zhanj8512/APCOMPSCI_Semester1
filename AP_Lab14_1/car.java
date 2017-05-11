public abstract class car implements location
{
    public double[] location = new double [2];
    private int id;
    
    
    public car()
    {
        id = (int)(Math.random()* 900000)+100000;
        location = new double [2];
    }
    
    public int getid()
    {
        return id;
    }
    
    public void move (double x, double y)
    {
        location[0] +=x;
        location[1] +=y;
    }
    public double[] getloc()
    {
        return location;
    }
}