package box;

public class Box {
    public double length;
    public double width;
    public double height;
    public Box(double size){
        this(size, size,size);
    }
    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void compare(Box another){
        double currentVolume = getvolume();
        double anotherVolume = another.getvolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume){
            System.out.println("Current < Another");
        } else{
            System.out.println("Current == Another");
        }
    }
    double getvolume(){
        return length * width * height;
    }
    public final double volume(){ // this это ключевое слово, обращаемся к
        double result = this.length * this.height * this.width;
        return result;
    }
}
