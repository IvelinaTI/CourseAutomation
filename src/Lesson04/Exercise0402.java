package Lesson04;

import java.util.Scanner;

public class Exercise0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work.");
        }
        scanner.close();
    }
}
