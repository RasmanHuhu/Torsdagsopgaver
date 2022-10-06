package Task3;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int ID;


    public Customer(String firstName, String lastName, String userName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", ID=" + ID +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getID() {
        return ID;
    }
}
