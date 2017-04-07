public class toyota extends car
{
    private double x;
    private double y;
    private double[] locate;
    
    public toyota(String loc)
    {
        String[] locate = loc.split(", ");
        x = Double.parseDouble(locate[0]);
        y= Double.parseDouble(locate[1]);
    }
    
    public int getid()
    {
        return (int)(Math.random()*999999)+1;
    }
    
    public void move(double j, double z)
    {
        x += j;
        y += z ;
    }
    
    public double[] getloc()
    {
        double[] locate = {x,y};
        return locate;
    }
}