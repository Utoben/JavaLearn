package inheritance;

public abstract class Shape {
    private double a;
    private double b;
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public  Shape(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimeter();

    public void showPerimeter(){
        System.out.println(getPerimeter());;
    }
}
