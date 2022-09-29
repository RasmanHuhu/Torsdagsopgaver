import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();

        //Her bestemmer spændets maks, dvs 100
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {

        // Create a Scanner object + read user input
        Scanner scanner = new Scanner(System.in);

        int tryCount = 0;

        // (If you are not sure how to do recursion, you can use a loop instead)
        while (true) {
            System.out.println("Enter your guess ( 1-100):");


            //Tager 0 fra og looper mod 100 vha increment - bruger en form for hasNext
            int playerGuess = scanner.nextInt();
            tryCount++;

            //   Let the user know the result of the comparison (was it the right number?)
            if (playerGuess == rnd_number) {
                System.out.println("Correct! You Win");
                System.out.println("It took you " + tryCount + " tries ");
                //break sørger for at lukke loopet, så vi ikke kører videre når spilleren har ramt rigtigt
                break; //

                //   Help the user by revealing weather the guess was lower or higher than the target number
            } else if (rnd_number > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again");
            } else {
                System.out.println("Nope! The number is lower. Guess again");


            }


        }
        //Lukker scanneren
        scanner.close();
    }

}
