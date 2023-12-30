package interfaces;

import java.util.ArrayList;

public class MainWorkers {
    public static void main(String[] args) {
        Director director = new Director();
        Programmist programmist = new Programmist();
        Cook cook = new Cook();

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(director);
        workers.add(programmist);
        workers.add(cook);

        for (Worker worker : workers){
            worker.work();
        }

        Driver first_driver = new Programmist();
        Programmist driving_programmist = (Programmist) first_driver;
//        driving_programmist.drive();

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(programmist);
        drivers.add(cook);

        for (Driver driver : drivers){
            driver.drive();
        }

    }
}
