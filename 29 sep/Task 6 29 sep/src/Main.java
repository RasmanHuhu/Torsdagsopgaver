public class Main {
    public static void main(String[] args) {
        //Creating a new instance .. af noget. Et nyt Object af kaffen
        //Når vi bliver bedt om at kalde noget, så beder vi programmet om at udføre en handling,
        //ved at skrive metodens navn, for så ved systremet at den skal lede efter en metode med samme navn.
        //- På objektet jeg lige har lavet (c), skal du lede efter en metode med det her navn og udføre den handling

        Cafe c = new Cafe();
        c.loadMenuData();
        System.out.println("Which coffee would you like?");
            for (String s:c.coffeeMenu){
            System.out.println(s);
            }
    }
}