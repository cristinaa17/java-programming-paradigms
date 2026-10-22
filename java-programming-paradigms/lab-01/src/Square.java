
public class Square extends Form
{
    private float side;

    public Square() {
        super();
        this.side = 0;
    }

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    public float getArea() {
        return side * side;
    }

    public String toString() {
        return super.toString() + ", Square with side = " + side;
    }
}
