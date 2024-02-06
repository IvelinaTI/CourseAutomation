package Lesson05;

public class Exersice0502 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];//3 row and 3 column
        arr[0][0] = 5;
        arr[0][1] = 9;
        arr[0][2] = 3;
        arr[1][0] = 2;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 6;
        arr[3][0] = 8;
        arr[3][1] = 9;
        arr[3][2] = 7;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
