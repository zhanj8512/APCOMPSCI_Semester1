public class biggestnumber

{
    static int[]arr;
    
    public static void main(String[]args)
    {
        arr = new int[10];
        fillArray();
        System.out.println("For the following numbers");
        printArray();
        System.out.println("The biggest number is " + getBiggest());
        
      
        
    }
    
    public static void fillArray()
    {
        for(int i = 0; i < arr.length; i ++)
        {
            arr[i]= (int)(Math.random()*100 + 1);
        }
        
    }
    
    public static void printArray()
    {
        for(int num:arr)
        {
            System.out.println(" " + num);
        }
    }
    
    public static int getBiggest()
    
   
    {
        int max = 0;
        for(int num : arr)
        {
            if (num > max)
            {
                max = num;
            }
            
           
        }
        
        return max;
        
        
    }
}

