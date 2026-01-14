import java.util.Scanner;

public class Task13StringCases {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String lowercased = scanner.nextLine().toLowerCase();

        String uppercased = scanner.nextLine().toUpperCase();

        String unchanged = scanner.nextLine();

        System.out.printf("%s\n%s\n%s", unchanged, uppercased, lowercased);

        scanner.close();
    }
}
