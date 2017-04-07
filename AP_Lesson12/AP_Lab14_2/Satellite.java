import java.util.ArrayList;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new honda(honLoc));
       locate.add(new toyota("8, 9"));
       locate.add(new gmc(3, 8));
       double[] home = {0, 0};
       String printout = "\n\n" + "==========================" + "\nStarting locations:";
       for (location l : locate)
       {
           printout += "\nLocation for " + l.getid() + ": (" + getLocation(l.getloc()) + ")";
       }
        printout += "\n\n" + "==========================" + "\nDistance from home:";
       for (location l : locate)
       {
           printout += "\nDistance for " + l.getid() + ": (" + getDistance(l.getloc(), home)+ ")";
		   l.getid();
       }
	   printout += "\n\n" + "=========================" + "\nMovement:";
	   double one = 5;
	   double two = 15;
	   for (location l : locate)
       {
		   l.move(one, two);
		   
		   printout += "\nAfter " + l.getid() + " moved " + "(" + one + ", " + two + ")\nNew Location: " + "(" + getLocation(l.getloc()) + ")\n"; 
       }
	    printout += "\n" + "========================" + "\nDistance from home:";
       for (location l : locate)
       {
           printout += "\nDistance for " + l.getid() + ": (" + getDistance(l.getloc(), home)+ ")";
		   l.getid();
       }
       System.out.println(printout);
   }
   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }
   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}