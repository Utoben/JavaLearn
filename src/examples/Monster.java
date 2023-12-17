package examples;

public class Monster {
    int hands;
    int legs;
    int eyes;
    Monster(int count){
        this(count, count, count);
    }
    Monster(){
        this(2);
    }


    public Monster(int mon_hands, int mon_legs, int mon_eyes) {
        this.hands = mon_hands;
        this.legs = mon_legs;
        this.eyes = mon_eyes;
    }

    static void voice(){
        voice(1);
    }
    static void voice(int count){
        voice(count, "Grrrrr");
    }

    static void voice(int count, String word){
        for (int i = 0; i < count; i++){
            System.out.println(word);
        }
    }
}
