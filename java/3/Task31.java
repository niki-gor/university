import java.util.Scanner;

public class Task31 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        for (int i = a; i <= b; i++) {
            System.out.println(i * i);
        }
    }
}
