import java.util.Scanner;
public class treedeg60
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = kb.nextLine();
        int start = 0;
        int stop = word.length();
        tree(word, start, stop);
        
    }
    
    public static void tree(String word, int start, int stop)
    {
        if(start <= stop)
        {
            System.out.println(word.substring(0, start));
            start += 1;
            tree(word, start, stop);
            
        }
        
    }
}