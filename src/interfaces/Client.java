package interfaces;

public class Client {
    public void make_an_order(Officiant officiant, String name_of_food){
        System.out.println(officiant + " принеси мне " + name_of_food);
    }
}
