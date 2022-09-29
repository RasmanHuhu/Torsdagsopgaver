import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //4c In the main method create an ArrayList\<String\> Call the ArrayList-variable actions.
        // Add the following String values to the actions ArrayList:
        // "1) Start game" "2) Resume game" "3) Pause game" "4) End game"

        //4.c
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        System.out.println(actions.get(1));

        // 4.d Still in the main method,
        // instantiate (create an object of) the Menu class with the actions ArrayList as an
        // argument to the constructor ----> "new Menu(actions)"

        Menu m = new Menu(actions);
        int input = m.showMenu(); //kalder metoden for at få den til at køre
        doAction(input);



    }
    //4.h

    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fecthing previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
        }
    }

}