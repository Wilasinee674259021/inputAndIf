import java.util.Scanner;

public class InputValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = -1;
        while (age < 0 || age > 150) {
            System.out.print("Input Age (8-150): ");
            age = scanner.nextInt();
        }
        System.out.print("Register Successful!!! \n Your age is " + age);
    }
}
