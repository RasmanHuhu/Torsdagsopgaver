import Task1.Car;
import Task1.Driver;

public class Main {

    public static void main(String[] args) {
        //instantiating a new driver based on own name + age
        Driver driver = new Driver(33, " Rasmus");
                Car myCar = new Car("Peugeot", "206", 1996, "family");
                        myCar.setDriver(driver);
                            System.out.println(myCar);
                            System.out.println(driver);

    }

}