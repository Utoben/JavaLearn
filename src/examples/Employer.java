package examples;

public class Employer {
    String name;
    String rank;
    double salary;

//    examples.Employer(String emp_name, String  emp_rank, double emp_salary){

    public Employer(String emp_name, String emp_rank, double emp_salary){

        this.name = emp_name;
        this.rank = emp_rank;
        this.salary = emp_salary;
    }

    String showInfo(){
        return "Сотрудника зовут " + name + "\nДолжность у него " + rank + "\nА вот зп " + salary;
    }

}
