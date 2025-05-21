
public class Main
{
    public static void main(String[] args)
    {
        Guitar g=new Guitar();
        Piano p=new Piano();
        g.play();
        p.play();
    }
}
interface Playable
{
    void play();
}

class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Zigzag");
    }
}
class Piano implements Playable
{
    public void play()
    {
        System.out.println("pianooooo");
    }
}
