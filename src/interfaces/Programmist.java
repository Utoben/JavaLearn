package interfaces;

public class Programmist implements Worker, Driver{
    @Override
    public void drive() {
        System.out.println("Программист водит");
    }

    @Override
    public void work() {
        System.out.println("Программист работает");
    }
}
