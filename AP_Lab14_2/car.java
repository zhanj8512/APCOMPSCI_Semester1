public abstract class car implements location
{
    double [] location;
    private int id =  (int)(Math.random()*999999)+1;
    
    public car()
    {
        location = new double [2];
        
        
    }
    
    public int getid()
    {
        return (int)(Math.random()*999999)+1;
    }
   
    public void move (double x, double y)
    {
        location [0] += x;
        location [1] += y;
    }
    
    public double [] getloc()
    {
        return location;
    }
}