package Task1;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;


    private Driver driver;

    public Car(String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

            }

            //1.e - getter
    public Driver getDriver() {
        return driver;
    }
            //1.e - setter
    public void setDriver(Driver driver) {
        this.driver = driver;
}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}
