import java.util.Scanner;

public class Task15IsDigit {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        scanner.close();

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
