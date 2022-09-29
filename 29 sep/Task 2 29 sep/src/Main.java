import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Name
        System.out.println("Please type your name");
        String name = in.nextLine();
        System.out.println("Your name is " + name + ". Nice to meet you.");

        //Age
        System.out.println("Please type your age");
        int age = in.nextInt();
        System.out.println("Your age is " + age + ". You old fart.");


        //Years untill retirement
        int result = 67;
        System.out.println("You may retire in " + (result - age) + " years.");

        in.close();
    }

}