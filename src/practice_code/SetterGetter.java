package practice_code;

import examples.Person;

public class SetterGetter {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.setAge(23);

        System.out.println("Name: " + person.getName() + "Age: " + person.getAge());
    }
}
