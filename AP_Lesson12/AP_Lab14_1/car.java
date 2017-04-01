public abstract class car implements location
{
    public double[] location = new double [2];
    private int id = (int)(Math.random()*999999)+1;
    
    
    public car()
    {
        
        id = (int)(Math.random()*999999)+1;
    }
    
    public int getid()
    {
        return id;
    }
    
    public abstract void move (double x, double y);
}