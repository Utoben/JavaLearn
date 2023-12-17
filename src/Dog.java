public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String info(){
        String strWeigth = Double.toString(weight);
        return "Имя собаки " + name + "\nПорода собаки " + breed + "\nЕе вес " + strWeigth;
    }
    void run(){

        for (int i = 0; i < speed; i++){
            System.out.println("Бегу");
        }
    }
}
