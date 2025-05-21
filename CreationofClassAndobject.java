public class Main
{
    public static void main(String[] args)
    {
        Car c=new Car();
        c.make="Toyota";
        c.model="goxes";
        c.year=2009;
        c.displayDetails();
    }
}

class Car
{
    String make;
    String model;
    int year;
    void displayDetails()
    {
        System.out.println("Make:"+make);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
    }
}
