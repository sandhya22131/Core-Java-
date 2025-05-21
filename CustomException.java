import java.util.*;
public class Main
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a age:");
            int age=sc.nextInt();

            try
                {
                    if(age<18)
                    {
                        throw new InvalidAgeException("Age should be greater than 18");
                    }
                    else
                    {
                        System.out.println("Access granted");
                    }
                }
            catch(InvalidAgeException e)
                {
                    System.out.println("Exception: "+e.getmsg());
                }
        }
    }
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message) 
        {
        super(message);
        }
}
