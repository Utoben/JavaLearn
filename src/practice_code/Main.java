package practice_code;

import box.Box;

public class Main {
    public static void main(String[] args) {

//       Math math = new Math();
//        System.out.println(Math.multiple(10.5,5.2));
//        examples.Monster.voice(4);
        Box current = new Box(10);
        Box another = new Box(12);

        current.compare(another);
    }
}