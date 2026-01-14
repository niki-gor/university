import java.util.Arrays;
import java.util.Scanner;

public class Task24Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {
            scanner.nextInt(),
            scanner.nextInt(),
            scanner.nextInt()
        };

        scanner.close();

        Arrays.sort(numbers);

        System.out.println(numbers[1]);
    }
}
