import java.util.Scanner;

public class DataInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input name:");
        String name = scanner.nextLine();
        System.out.println("input age:");
        int age = scanner.nextInt();
        System.out.println("input your height (in metres)");
        double height = scanner.nextDouble();
        System.out.println("do you like java?");
        boolean likesJava = scanner.nextBoolean();
        System.out.println("input the first letter of your city");
        char firstLetter = scanner.next().charAt(0);

        scanner.close();
        String.format("%s %d %f", name, age, height);
    }
}
