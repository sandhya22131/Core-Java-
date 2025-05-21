import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        int c=0;
        System.out.println("Multiplication table of "+a);
        
        for(int i=1;i<11;i++)
        {
            c=a*i;
            System.out.println(i+" * "+a+" = "+c);
        }
        
    }
}
