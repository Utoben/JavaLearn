package interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{
    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }

    @Override
    public void run() {
        System.out.println("Бегу");
    }

    @Override
    public void fly(){
        System.out.println("Лечу");
    }
}
