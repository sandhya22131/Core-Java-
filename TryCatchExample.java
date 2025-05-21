import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        System.out.println("Enter the next number:");
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println(c);
            
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("There is an error");
        }
        
    }
}
