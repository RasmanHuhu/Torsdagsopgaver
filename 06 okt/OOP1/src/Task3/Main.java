package Task3;
import java.util.ArrayList;

public class Main {

    //3.c
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Rasmus", "Arendt", "Dadcake", 1));
        customers.add(new Customer("Philip", "Hatley", "Kish", 2));
        customers.add(new Customer("Martin", "Thuren", "BatKnob", 3));
        customers.add(new Customer("Nicolaj", "Rosendahl", "Ashermagus", 4));
        customers.add(new Customer("Marcus", "Løbel", "GigaScrub", 5));
        customers.add(new Customer("Victor", "Christensen", "C-Cat", 6));

        printCustomers();
    }

    //3.d Skriv en metode i Main kaldet printCustomers(), hvor du printer alle kunderne ud
    //ved at gennemløbe 'customers' med et ’for each’ loop.
    // Test metoden fra main ved at kalde den.
    public static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c);

        }
    }
}