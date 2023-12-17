public class Practice {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.weight = 87;
        dog.breed = "Dog";
        dog.name = "Tuzik";
        dog.speed= 10;

//        System.out.println(dog.info());
        dog.run();

        Box box1 = new Box(10,10,10);
        box1.height = 10;
        box1.length = 10;
        box1.width = 10;

        Box box2 = new Box(20,20,20);
        box2.height = 20;
        box2.length = 20;
        box2.width = 20;

        double volume = box1.height * box1.length * box1.width;
//        System.out.println(volume);
        // или вместо этих 2х строк вызываем метод из класса System.out.println(box1.volume());

        double volume2 = box2.height * box2.length * box2.width;
//        System.out.println(volume2);
        // или вместо этих 2х строк вызываем метод из класса System.out.println(box2.volume());

        // ДЗ CTRL+ALT+L автоформатирование кода
        Human human1 = new Human();
        human1.age = 13;

        Human human2 = new Human();
        human2.age = 19;

        Human human3 = new Human();
        human3.age = 32;

        double res = (human1.age + human2.age + human3.age) / 3;
//        System.out.println(Math.round(res));

        Employer empl = new Employer("Mike", "Manager", 24.09);
//        System.out.println(empl.showInfo());
    }



}
