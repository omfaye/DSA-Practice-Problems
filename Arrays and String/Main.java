public class Main {
    public static void main(String args[])
    {
        Pen p = new Pen();
        p.setColor("Blue");
    }
}
class Pen
{
    String color;

    void setColor(String color)
    {
        System.out.println(color);
    }
}
