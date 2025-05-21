
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        
        int t=r.nextInt(20)+1;
        int u=0;
        
        System.out.println("Guess a number between 1 and 20");
        while(u!=t)
        {
            System.out.println("Enter your guess:");
            u=sc.nextInt();
            
            if(u<t)
            {
                System.out.println("The number is too low");
            }
            else if(u>t)
            {
                System.out.println("The number is too high");
            }
            else
            {
                System.out.println("You guessed the correct number");
            }
        }
    }
}
