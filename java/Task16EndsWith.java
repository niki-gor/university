import java.util.Scanner;

public class Task16EndsWith {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

        System.out.println(input.endsWith("!!!"));
    }
}
