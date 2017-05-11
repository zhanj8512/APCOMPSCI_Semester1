public class toyota extends car
{
   public toyota(String loc)
   {
       String[] locString = new String[2];
       locString = loc.split(",");
       move(Double.parseDouble(locString[0]), Double.parseDouble(locString[1]));
    }
}