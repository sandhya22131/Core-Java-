
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        a=sc.nextLine();
        String rev="";
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            rev+=a.charAt(i);
        }
        System.out.println("The reversed string is"+rev);
        
        
    }
}
