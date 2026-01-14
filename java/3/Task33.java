import java.util.Scanner;

public class Task33 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k * k + 1;
        }

        System.out.println(sum);
    }
}
