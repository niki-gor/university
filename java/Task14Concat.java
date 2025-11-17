import java.util.Scanner;

public class Task14Concat {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String result = first.concat(second).toUpperCase();
        
        System.out.println(result);

        scanner.close();
    }
}
