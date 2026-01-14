import java.util.Scanner;

public class Task11RegisterComparator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase(second));

        scanner.close();
    }
}
