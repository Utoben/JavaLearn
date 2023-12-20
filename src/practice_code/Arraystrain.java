package practice_code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraystrain {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        String res = "";
        Integer f = 0;
        String humber = "";

        names.add("Karl");
        names.add("Vilgelm");
        names.add("Genrih");
        names.add("Edward");
        names.add("Harry");

        for (int i = 0; i < 5; i++){
            numbers.add(i);
        }

        for (int i = 0; i < names.size(); i++){

            f = numbers.get(i);
            humber = f.toString();

            strings.add(humber + " - " + names.get(i));
        }

        for (String string : strings) {
            System.out.println(string);
        }




//        for (int number : numbers){
//            System.out.println(number);
//        }
    }
//    private static ArrayList<String>    getEmployees(){
//        ArrayList<String> employes = new ArrayList<>();
//        employes.add("John");
//        employes.add("Mike");
//        employes.add("yen");
//        return employes;
//    }
    private static ArrayList<String> names(String name){
        ArrayList<String> employes = new ArrayList<>();
        employes.add("John");
        employes.add("Mike");
        employes.add("yen");
        return employes;
    }

}
