import java.util.Scanner;

public class Task12LastChar {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();

        scanner.close();

        System.out.println(line.charAt(line.length() - 1));
    }
}
