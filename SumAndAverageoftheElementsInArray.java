import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int sum=0;
        for(int num:a)
        {
            sum=sum+num;
        }
        double avg=(double)sum/n;
        System.out.println("The sum of the elements in an array is "+sum);
        System.out.println("The average of the elements in an array is "+avg);
    }
}
