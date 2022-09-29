import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

private ArrayList<String> options;

    public Menu(ArrayList<String> options) {
        this.options = options;

        }

        //4e - bruger et for each-loop til at køre mit array igennem

    //4g
    //
        public int showMenu() {
        //Fordelen ved et for-each loop fremfor et for loop er,
        //at da vi ikke ved hvor mange dele der er i array-listen, og ikke nødvendigvis
        //behøver at vide indexet, så får vi bare et seperat string som holder hver String

        System.out.println("Type a number to choose");
        for (String s:options) {
            System.out.println(s);
        }
            //4.f lav en scanners som læser input

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            return choice;

        }


    }
