import java.util.Scanner;

public class Task21Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimal = Math.min(
            scanner.nextInt(),
            scanner.nextInt()
        );

        scanner.close();

        System.out.println(minimal);
    }
}
