import java.util.Random;
import java.util.Scanner;

public class GuessRandomNum {

   public static void guessnumber() {
        int answer, guess;
        final int MAX = 200;
        Scanner randomNum = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        answer = rand.nextInt(MAX) + 1;
        while (!correct) {
            System.out.println(
                    "Guess a number between 1 and 200: ");
            guess = randomNum.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            } else if (guess < answer) {
                System.out.println("Too low, try again");
            } else {
                System.out.println(
                        "Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);
    }

    public static void main(String[] args) {
       guessnumber();
    }
}