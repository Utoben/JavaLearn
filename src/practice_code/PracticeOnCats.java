package practice_code;

//import inheritance.CatFamily;

import inheritance.Cat;
import inheritance.Lion;

public class PracticeOnCats {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.canEatPerson);
        System.out.println(lion.canEatPerson);
    }

}
