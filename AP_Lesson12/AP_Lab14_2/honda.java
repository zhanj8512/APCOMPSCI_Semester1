public class honda extends car
{
    private double j;
    private double z;
    private double [] location;
    
    public honda(double[] ar)
    {
        location = ar;
    }
    
   public int getid()
   {
       
         return (int)(Math.random()*999999)+1;
       
   }
   
   public void move(double x, double y)
   {
       j+=x;
       z+=y;
    }
    public double [] getLoc()
    {
        return location;
    }
}