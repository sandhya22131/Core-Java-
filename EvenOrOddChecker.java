import java.util.*;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        
        if(a%2==0)
        {
            System.out.println(a+" is an Even number");
        }
        else
        {
            System.out.println(a+" is an Odd Number");
        }
    }
}
