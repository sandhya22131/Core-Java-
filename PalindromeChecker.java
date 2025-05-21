import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String inp=sc.nextLine();
        String rev="";
        int n=inp.length();
        for(int i=n-1;i>=0;i--)
        {
            rev+=inp.charAt(i);
        }
        System.out.println(rev);
        if(inp.equals(rev))
        {
            System.out.println("The given string is a palindrome");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
            
        }
    }
}
