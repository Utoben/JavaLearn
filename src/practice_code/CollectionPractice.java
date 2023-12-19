package practice_code;

import examples.Employer;

public class CollectionPractice {
    public static void main(String[] args) {
//        String[] employees = getEmployees();
//        String[] newArray = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++){
//            newArray[i] = employees[i];
//        }
//        newArray[newArray.length - 1] = "James";
//        employees = newArray;
//        employees[0] = null;
//        String[] newestArray = new String[employees.length - 1];
//        for (int i = 0, j = 0; i < employees.length; i++){
//            String employee = employees[i];
//            if (employee != null){
//                newestArray[j] = employee;
//                j++;
//            }
//        }
//        for (String employee : employees){
//            System.out.println(employee);
//        }

        MyArrayList employees = getEmployees();
        employees.add("rtrtrt");
        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }

    }
    public static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();

        employees.add("John");
        employees.add("sfsf");
        employees.add("ahahah");
        employees.add("hkhkhk");



        return employees;
    }
}
