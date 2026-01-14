import java.util.Scanner;

public class Task35 {
    private static void printTriangle(int n) {
        int indent = n - 1;
        int dots = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(indent) + "*".repeat(dots));

            indent -= 1;
            dots += 2;
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        printTriangle(n);
    }
}
