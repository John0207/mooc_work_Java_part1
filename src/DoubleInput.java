import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        boolean message = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave " + message);
    }
}
