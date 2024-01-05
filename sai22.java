import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the step size: ");
        int step = scanner.nextInt();

        System.out.println("Numbers from 0 to 100 with a step of " + step + ":");
        for (int i = 0; i <= 100; i += step) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}