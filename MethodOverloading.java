import java.util.*;

public class Main
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double c,double d)
    {
        return c+d;
    }
    public static int add(int e,int f,int g)
    {
        return e+f+g;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Provide the value of a");
       int a=sc.nextInt();
       System.out.println("Provide the value of b");
       int b=sc.nextInt();
       System.out.println("Provide the value of c");
       double c=sc.nextDouble();
       System.out.println("Provide the value of d");
       double d=sc.nextDouble();
       System.out.println("Provide the value of e");
       int e=sc.nextInt();
       System.out.println("Provide the value of f");
       int f=sc.nextInt();
       System.out.println("Provide the value of g");
       int g=sc.nextInt();
       
       System.out.println("The sum of two integers is"+add(a,b));
       System.out.println("The sum of two double numbers is"+add(c,d));
       System.out.println("The sum of three integers is"+add(e,f,g));
    }
       
}
