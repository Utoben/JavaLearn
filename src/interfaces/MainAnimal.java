package interfaces;

import java.util.ArrayList;

public class MainAnimal{

    public static void main(String[] args) { // пример Upcast
        Cat cat = new Cat();
        Dog dog = new  Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<AbleToRun> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
//        animals.add(fish);
        for (AbleToRun animal : animals){
            animal.run();
        }

//        Animal animal = new Dog(); // Downcast
//        animal.eat();
//        Dog dog = (Dog) animal;
//        dog.run();
    }
}
