package Task1;

public class Driver {

    private int age;
    private String name;

    public Driver(int age, String name) {
        this.age = age;
        this.name =name;
}

    @Override
    public String toString() {
        return "is driven by" + name;
    }

}

