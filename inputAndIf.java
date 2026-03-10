import java.util.Scanner;

public class inputAndIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter gender (M/F): ");
        String gender = input.next();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (age >= 18) {
            if (gender.equalsIgnoreCase("M") && age >= 21) {
                System.out.println("You can vote and serve nation");
            } else {
                System.out.println("You can vote");
            }
        } else {
            System.out.println("You can not vote");
        }

        System.out.println("Year: " + year);

        input.close();
    }
}
