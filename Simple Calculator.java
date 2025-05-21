

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int a,b;
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        
        System.out.println("Choose an operator\n\t1.Add\n\t2.Subtract\n\t3.Multiply\n\t4.Divide");
        int x=sc.nextInt();
        int c=0;
        
        switch(x)
        {
            case 1:
                c=a+b;
                break;
            case 2:
                c=a-b;
                break;
            case 3:
                c=a*b;
                break;
            case 4:
                c=a/b;
                break;
                
        }
        System.out.println("The result is:"+c);
        
    }
}

