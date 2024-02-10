package Lesson06;

import java.util.Scanner;

public class Exersice0603 {
    public static void main(String[] args) {
        //Write a Java method to display the middle character of a string.
        //Note:
        //a) If the length of the string is even there will be two middle characters.
        //b) If the length of the string is odd there will be one middle character.
        //Write a Java method to count all words in a string.
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(middleCharacter(word));
    }
   public static String middleCharacter (String name) {
        int length = name.length();
        int i = length / 2;
        int k = i -1;

        if (i%2==0){
            System.out.print(name.charAt(k) + " ");
            System.out.println(name.charAt(i));
        } else {
            System.out.println(name.charAt(i));
        }
            return name;
        }
    }

