import java.util.ArrayList;
public class satellite
{
   public static void main(String[]args)
   {
       ArrayList<location> locate = new ArrayList<>();
       double[] honloc = {5, 6};
       locate.add(new honda(honloc));
       locate.add(new toyota("8, 9"));
       locate.add(new gmc(3, 8));
        double[] home = {0, 0};
        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (location l : locate)
       {
           printout += "\nLocation for " + l.getid() + ": (" + getlocation(l.getloc()) + ")";
       }
        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (location l : locate)
       {
           printout += "\nDistance for " + l.getid() + ": (" + getdistance(l.getloc(), home)+ ")";
       }

        System.out.println(printout);
   }
    public static double getdistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }
    public static String getlocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}