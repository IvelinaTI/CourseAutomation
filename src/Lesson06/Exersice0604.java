package Lesson06;

import java.util.Scanner;

public class Exersice0604 {
    public static void main(String[] args) {
        //Write a method named isEven that accepts an int argument. The method should return true if the
        //argument is even, or false otherwise
        Scanner scanner = new Scanner(System.in);

        int number = isEven(scanner.nextInt());
    }

    static int  isEven(int x) {
        int even = x % 2;

        if (even == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return x;
    }
}

