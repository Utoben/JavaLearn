package examples;

public class Dog {
    public String name;
    public String breed;
    public double weight;
    public int speed;

    String info(){
        String strWeigth = Double.toString(weight);
        return "Имя собаки " + name + "\nПорода собаки " + breed + "\nЕе вес " + strWeigth;
    }
    public void run(){

        for (int i = 0; i < speed; i++){
            System.out.println("Бегу");
        }
    }
}
