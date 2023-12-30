package inheritance;

public class Triangle extends Shape{
    public double c;
    public Triangle(double a, double b, double c){  
        super(5,8);
        this.c = 9;
    }

    @Override
    public double getPerimeter() {
        return getA()+getB()+c;
    }
}
