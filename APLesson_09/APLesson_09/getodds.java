


public class getodds
{
    static int[]arr;
    
    public static void main(String[]args)
    {
        arr = new int[10];
        fillArray();
        System.out.println("For the following numbers ");
        printArray();
        System.out.println(getOdds() + " are the odd numbers");
    }
    
    public static void fillArray()
    {
        for (int i = 0; i < arr.length; i++)
        {
           arr[i] = (int)(Math.random()*100+1);
        }
    }
    
    public static void printArray()
    {
        for( int number : arr)
        {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    public static String getOdds()
    {
        String odds = "";
        for( int number : arr)
        {
            if(number % 2 != 0)
            {
                odds += " " + number;
            }
        }
        return odds;
    }
    
  
    
}