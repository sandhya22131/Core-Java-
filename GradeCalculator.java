import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int m=sc.nextInt();
        
        if(m>=90 && m<=100)
        {
            System.out.println("The grade is A");
        }
        else if(m>=80 && m<90)
        {
            System.out.println("The grade is B");
        }
        else if(m>=70 && m<80)
        {
            System.out.println("The grade is C");
        }
        else if(m>=60 && m<70)
        {
            System.out.println("The grade is D");
        }
        else
        {
            System.out.println("The grade is F");
        }
    }
}
