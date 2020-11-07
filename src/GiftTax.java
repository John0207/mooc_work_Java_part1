
import java.util.Scanner;


public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        int value = Integer.valueOf(scan.nextLine());
        int tax = 0;
        double tax_rate = 0;
        double answer = 0;
        int limit = 0;
        boolean noTax = false;

        if (value < 5000) {
            tax = 0;
            tax_rate = 0.00;
            noTax = true;
        } else if (value >= 5000 && value < 25000) {
            tax = 100;
            tax_rate = 0.08;
            limit = 5000;
            answer = (tax + (value - limit) * tax_rate);

        } else if (value >= 25000 && value < 55000) {
            tax = 1700;
            tax_rate = 0.1;
            limit = 25000;
            answer = (tax + (value - limit) * tax_rate);
        } else if (value >= 55000 && value < 200000) {
            tax = 4700;
            tax_rate = 0.12;
            limit = 55000;
            answer = (tax + (value - limit) * tax_rate);
        } else if (value >= 200000 && value < 1000000) {
            tax = 22100;
            tax_rate = 0.15;
            limit = 200000;
            answer = (tax + (value - limit) * tax_rate);
        } else if (value >= 1000000) {
            tax = 142100;
            tax_rate = 0.17;
            limit = 1000000;
            answer = (tax + (value - limit) * tax_rate);
        }

        if (noTax == true) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + answer);
        }

    }
}
