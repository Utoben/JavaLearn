package interfaces;

public class Dog extends  Animal implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("Собачачий корм");
    }
    @Override
    public void run(){
        System.out.println("Бежим");
    }
}
