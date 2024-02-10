package Lesson05;

import java.util.LinkedList;

public class Exersice0505 {
    //Reverse the order of the elements in a LinkedList using algorithm
    public static void main(String[] args) {
        LinkedList <Integer> numbers = new LinkedList<>();
        numbers.add (1);
        numbers.add (2);
        numbers.add (3);
        numbers.add (4);
        numbers.add (5);

        for (int i=0; i<numbers.size()-1; i++) {
            int lastElement = numbers.pollLast();
            numbers.add(i,lastElement);

        }
        System.out.println(numbers);

    }

}
