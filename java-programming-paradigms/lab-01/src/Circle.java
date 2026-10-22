
public class Circle extends Form
{
    private float radius;

    public Circle()
    {
        super();
        this.radius = 0;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public float getArea()
    {
        return (float) (Math.PI * radius * radius);
    }

    public String toString()
    {
        return super.toString() + ", Circle with radius = " + radius;
    }
}
