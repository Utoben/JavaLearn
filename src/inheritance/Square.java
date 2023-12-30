package inheritance;

public class Square extends Shape{
    public Square(){
        super(5,8);
    }

    @Override
    public double getPerimeter() {
        return (getA() + getB())*2;
    }
}
