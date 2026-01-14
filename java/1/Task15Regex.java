import java.util.Scanner;

public class Task15Regex {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();
        
        input.replaceAll("\\D", "");

        System.out.println(input);
    }
}
