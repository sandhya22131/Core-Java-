















import java.util.*;
public class Main
{
    public static int fibonacci(int a)
    {
        if(a<=1)
        {
            return a;
        }
        
        else
        {
            return fibonacci(a-1)+ fibonacci(a-2);
        }
    }


    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number to find the fibonacci series");
        int a=sc.nextInt();
        System.out.println("The Fibonacci Series of "+a);
        for(int i=0;i<=a;i++)
        {
            System.out.println(fibonacci(i));
        }
        
    }
}
