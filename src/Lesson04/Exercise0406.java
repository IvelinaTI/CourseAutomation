package Lesson04;

import java.util.Scanner;

public class Exercise0406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        double five = num % 5;
//        boolean isTrue = five != 0;

        if (five != 0) {
            num = Integer.parseInt(scanner.nextLine());
        } else if (five == 0) {
            System.out.println(num);
            num = Integer.parseInt(scanner.nextLine());
        } else if (num >=150) {
            return;
        }


//        while (isTrue) {
//            num = Integer.parseInt(scanner.nextLine());
//
//        }
//        System.out.println(num);
//        while (num >= 150){
//            break;
//        }
    }
}
