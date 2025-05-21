
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.makeSound();
    }

}
public class Animal
{
    void makeSound()
    {
    }
}
public class Dog extends Animal
{
    void makeSound()
    {
        System.out.println("Bow Bow");
    }
    
}
