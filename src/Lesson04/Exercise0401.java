package Lesson04;

import java.util.Scanner;

public class Exercise0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = Integer.parseInt(scanner.nextLine());

        switch (dayOfWeek) {
            case 1:
                System.out.printf("The %d - day of the week is Monday", dayOfWeek);
                break;
            case 2:
                System.out.printf("The %d - day of the week is Tuesday", dayOfWeek);
                break;
            case 3:
                System.out.printf("The %d - day of the week is Wednesday", dayOfWeek);
                break;
            case 4:
                System.out.printf("The %d - day of the week is Thursday", dayOfWeek);
                break;
            case 5:
                System.out.printf("The %d - day of the week is Friday", dayOfWeek);
                break;
            case 6:
                System.out.printf("The %d - day of the week is Saturday", dayOfWeek);
                break;
            case 7:
                System.out.printf("The %d - day of the week is Sunday", dayOfWeek);
                break;

        }
        scanner.close();

    }
}
