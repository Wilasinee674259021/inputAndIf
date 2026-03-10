import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int guessNumber = 44;
        int inputNumber;
        boolean result = true;

        while (result) {
            System.out.print("Input Guess Number : ");
            inputNumber = scanner.nextInt();

            if (inputNumber > guessNumber) {
                System.out.println("Too Much");
            } else if (inputNumber < guessNumber) {
                System.out.println("Lower Number");
            } else {
                result = false;
            }
        }

        System.out.println("Congratulation!!!");
    }
}