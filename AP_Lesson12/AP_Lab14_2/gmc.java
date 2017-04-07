public class gmc extends car

{
    private double x;
    private double y;
    
    public gmc (double j, double z)
    {
        x=j;
        y=z;
    }
    
    public int getid()
    {
         return (int)(Math.random()*999999)+1;
    }
    
    public void move (double j, double z)
    {
        x+=j;
        y+=z;
    }
    
    public double[] getloc()
    {
        double[] locate = {x, y};
        return locate;
    }
   
}