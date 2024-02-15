package Lesson06;

public class Exersice0601 {
    public static void main(String[] args) {
        //Write a Java method to find the smallest number among three numbers
        Exersice0601 myOBject = new Exersice0601();
        int maxNumber1 = myOBject.maxNumber(1,3,2);
        System.out.println(maxNumber1);

//Това е моят опит да реша задачата.
         }


    public int maxNumber (int x ,int y ,int z) {
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
