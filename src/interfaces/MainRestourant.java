package interfaces;

public class MainRestourant {
    public static void main(String[] args) {
        Client client = new Client();
//        Officiant officiant = new Officiant();
//
//        officiant.name = "Boris";
//        client.make_an_order(officiant.name, "Bread");
        client.make_an_order(new Officiant(){
            public String name;
            @Override
            public String setName(String name){
                return  name;
            }
        }, "Bread");
    }
}
