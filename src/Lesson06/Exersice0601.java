package Lesson06;

public class Exersice0601 {
    public static void main(String[] args) {
        //Write a Java method to find the smallest number among three numbers
        int maxNumber1 = maxNumber(1,2,3);
        System.out.println(maxNumber1);

//Това е моят опит да реша задачата.
         }


    static int maxNumber (int x ,int y ,int z) {
        int max = x;
        if (x > y && x > z) {
            System.out.println(max);
        } else if (y > x && y > z) {
            max = y;
        } else if (z > x && z > y) {
            max = z;
        }
        return max;
    }
}
