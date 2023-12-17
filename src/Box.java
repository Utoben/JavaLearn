public class Box {
    double length;
    double width;
    double height;
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public final double volume(){ // this это ключевое слово, обращаемся к
        double result = this.length * this.height * this.width;
        return result;
    }
}
