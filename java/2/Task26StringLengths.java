import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task26StringLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = {
            scanner.nextLine(),
            scanner.nextLine(),
            scanner.nextLine()
        };

        scanner.close();

        String maxLengthString = Collections.max(
            Arrays.asList(strings), 
            Comparator.comparing(String::length)
        );

        System.out.println(maxLengthString);
    }
}
