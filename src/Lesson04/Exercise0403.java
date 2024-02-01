package Lesson04;

import java.util.Scanner;

public class Exercise0403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Еnter unit price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalPrice= price * quantity;
        double discount = 0;

        if (quantity >100 && quantity < 120) {
            discount = totalPrice* 0.15;
            System.out.printf("The revenue from sale: %.1f$%n", totalPrice - discount);
            System.out.printf("Discount: %.1f$ (15.0%%)", discount);
        } else if (quantity > 120) {
            discount = totalPrice * 0.20;
            System.out.printf("The revenue from sale: %.1f$%n", totalPrice - discount);
            System.out.printf("Discount: %.1f$ (20.0%%)",discount);
        } else if (quantity <100) {
            System.out.printf ("The revenue from sale: %.1f$%n",totalPrice);
            System.out.println("Discount: 0 (0%%)");
        }
        scanner.close();
    }
}
