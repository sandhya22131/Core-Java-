import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non negative number");
        a=sc.nextInt();
        int res=1;
        for(int i=1;i<=a;i++)
        {
            res=res*i;
        }
        System.out.println("The factorial of "+a+" is"+ res);
        
    }
}
