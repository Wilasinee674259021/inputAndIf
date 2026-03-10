import java.util.Random;
import java.util.Scanner;

public class GuessNumberPlus {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        int guessNumber = r.nextInt(100) + 1; // เลขสุ่ม
        int inputNumber;
        boolean result = true;
        int count = 0;
        int score = 100;

        while (result) {

            System.out.print("Input Guess Number : ");
            inputNumber = scanner.nextInt();

            if (inputNumber > guessNumber) {
                System.out.println("Too Much");
                count++;
            } else if (inputNumber < guessNumber) {
                System.out.println("Lower Number");
                count++;
            } else {
                result = false;
            }

        }

        System.out.println("Congratulation!!!");
        System.out.println("Your score is : " + (score - count));
    }
}