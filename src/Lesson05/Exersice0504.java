package Lesson05;

public class Exersice0504 {

    //Find biggest element of an array and print it in the console
    public static void main(String[] args) {

        int [] list = {-1 ,5 ,70 ,120 ,-200};
        int max = list[0];

        for (int i =0; i <= list.length-1; i++) {
            if (list[i]> max) {
                max = list[i];
            }
        }
        System.out.println("Max number is:"+ max);
    }
}
