package Challange_100_Days;

class shape
{
    shape draw()
    {
        System.out.println("Drawing a generic shape");
        return this;
    }
}

class circle extends shape
{
    double radius;

    circle(double value)
    {
        this.radius = value;
    }
    circle draw()
    {
        System.out.println("Drawing a circle with radius "+ radius);
        return  this;
    }
}


public class Covariant
{
    public static void main(String[] args)
    {
        shape shape = new shape();
        shape.draw();

        circle circle = new circle(3.0);
        circle.draw();
    }
}
