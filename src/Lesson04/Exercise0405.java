package Lesson04;

import java.util.Scanner;

public class Exercise0405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write type of vacation:");
        String typeOfVacation = scanner.nextLine();
        System.out.println("Budget:");
        double budget = Double.parseDouble(scanner.nextLine());

        switch (typeOfVacation){
            case "Beach" :
                if (budget < 50){
                    System.out.println("Bulgaria");
                } else if (budget >=50) {
                    System.out.println("Outside Bulgaria");
                }
                break;
            case "Mountain":
                if (budget <=30){
                    System.out.println("Bulgaria");
                } else if (budget>30) {
                    System.out.println("Outside Bulgaria");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation");
                break;
        }
        scanner.close();
    }
}
