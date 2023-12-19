package practice_code;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0; // на приватное поле добавдляем гетер

    public  String get(int index){
        return array[index];
    }

    public void add(String element){
        array[size] = element;
        size++;
        if(size== array.length){
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i< array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index){
        for (int i = 0; i< size -1 ; i++) {
            array[i] = array[i+1];

        }
        array[size] = null;
        size--;
    }

    public void remove (String element){
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                array[i] = array[i + 1];
                remove(i);
                return;
            }
        }
    }

    public int getSize(){
        return size;
    }

}
