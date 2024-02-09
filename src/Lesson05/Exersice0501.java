package Lesson05;

import java.util.Arrays;
//Write program to print sum of a given array elements
public class Exersice0501 {
    public static void main(String[] args) {

//        double[] nums = {5, 5, 1, 4, 2};
//        double sum = Arrays.stream(nums).sum();
//        System.out.println(sum);

        int[] numbers = {5, 5, 2, 1};
        int sum = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
        {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
