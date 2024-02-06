package Lesson05;

import java.util.Arrays;

public class Exersice0501 {
    public static void main(String[] args) {

        double[] nums = {5, 5, 1, 4, 2};
        double sum = Arrays.stream(nums).sum();
        System.out.println(sum);
    }
}
