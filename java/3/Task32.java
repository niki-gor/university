import java.math.BigInteger;
import java.util.Scanner;

public class Task32 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        scanner.close();

        BigInteger factorial = BigInteger.valueOf(1);
        for (; x > 0; x--) {
            factorial = factorial.multiply(BigInteger.valueOf(x));
        }

        System.out.println(factorial);
    }
}
