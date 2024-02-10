package Lesson05;

import java.util.Scanner;

public class Exersice0503 {
    //Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of rows");
        int rowNumber = scanner.nextInt();
        System.out.println("Number of columns");
        int columnNumber = scanner.nextInt();

        int[][] matrix = new int[rowNumber][columnNumber];

        for (int i = 0; i < rowNumber; i++) {
            System.out.println("Enter the elements of row number" + i);
            for (int k = 0; k < columnNumber; k++) {
                matrix[i][k] = scanner.nextInt();

            }
        }
        for (int i = 0; i < rowNumber; i++) {
            for (int k = 0; k < columnNumber; k++){
                System.out.print(matrix[i][k]+" ");
            }
            System.out.println();
        }


    }
}
