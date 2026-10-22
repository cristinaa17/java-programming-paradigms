
public class Form
{
    private String color;
    private static int counter = 0;
    public Form()
    {
        this.color = "white";
        counter++;
    }
    public Form(String color)
    {
        this.color=color;
    }
    public float getArea()
    {
        return 0;
    }
    public String toString()
    {
        return "This form has the color " + color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public static int getCounter()
    {
        return counter;
    }
}
