import java.util.Scanner;

public class Task34 {

    private static int countEvenDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int evenDigits = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                evenDigits++;
            }
            n /= 10;
        }

        return evenDigits;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        System.out.println(countEvenDigits(n));
    }
}
