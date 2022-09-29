/* - Names of coffee
1. Expresso
2. Americano
3. Macchiato
4. Flat White
5. Latte */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu;

//Constructor til 6.g
    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public void loadMenuData() {

        //6.d In this step you will read from the file, using a Scanner object:
        // - Add the file instance to a new Scanner object.
        // (This piece of code will need to be wrapped in a try -catch block)
        try {
            File file = new File("coffees.txt");
            Scanner fileReader = new Scanner(file);
            //while loop til at loop over files og tilføje lines til coffeeArray'et i denne class
        while (fileReader.hasNextLine()) {
            coffeeMenu.add(fileReader.nextLine());
        }
        } catch (Exception e) {
            //Besked hvis den ikke kan finde filen
            System.out.println("file not found. Check path and filename");
        }
        //Constructor til 6.g

        }
    }