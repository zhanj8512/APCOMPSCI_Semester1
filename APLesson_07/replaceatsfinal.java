import java.util.Scanner;
public class replaceatsfinal
{
    static String sent;
    
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a sentence");
        sent = kb.nextLine();
        replace();
        System.out.println(sent);
    }      
    
    public static void replace()
    {
        while(sent.indexOf("a") >=0)
        {
            sent = sent.substring(0, sent.indexOf("a")) + "@" + sent.substring(sent.indexOf("a")+1);
        }
    }
    
}    